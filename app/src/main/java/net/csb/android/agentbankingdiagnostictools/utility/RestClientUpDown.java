package net.csb.android.agentbankingdiagnostictools.utility;

import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.NameValuePair;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.AbstractHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.util.ArrayList;

public class RestClientUpDown {

	private static final String SUB_TAG = RestClientUpDown.class.getSimpleName();

	public enum RequestMethod {
		GET, POST;
	}

	private ArrayList<NameValuePair> params;
	private ArrayList<NameValuePair> headers;

	private String url;

	private int responseCode;
	private String message;
	private String requestValues = "";
	private String response;

	public static String jsonBeautify(String json) {
		ObjectMapper mapper = new ObjectMapper();
		try {

			Object obj = mapper.readValue(json, Object.class);
			return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		} catch (Exception e) {
			return json;
		}
	}

	public String getResponse() {

		String beautifyRequest = jsonBeautify(getReQestValues());
		if (beautifyRequest.length() > 4000) {
			Log.d(SUB_TAG, "beautifyRequest.length() = " + beautifyRequest.length());
			int chunkCount = beautifyRequest.length() / 4000;
			// integer division
			for (int i = 0; i <= chunkCount; i++) {
				int max = 4000 * (i + 1);
				if (max >= beautifyRequest.length()) {
					Log.d(SUB_TAG, "REQUEST_FULL"+i+"/"+chunkCount+" : " + beautifyRequest.substring(4000 * i));
				} else {
					Log.d(SUB_TAG, "REQUEST_FULL"+i+"/"+chunkCount+" : " + beautifyRequest.substring(4000 * i, max));
				}
			}
		} else {
			Log.d(SUB_TAG, "REQUEST_FULL : " + beautifyRequest);
		}


		String beautifyResponse = jsonBeautify(response);
		if (beautifyResponse.length() > 4000) {
			Log.d(SUB_TAG, "beautifyResponse.length() = " + beautifyResponse.length());
			int chunkCount = beautifyResponse.length() / 4000;
			// integer division
			for (int i = 0; i <= chunkCount; i++) {
				int max = 4000 * (i + 1);
				if (max >= beautifyResponse.length()) {
					Log.d(SUB_TAG, "RESPONSE_FULL_"+i+"/"+chunkCount+" : " + beautifyResponse.substring(4000 * i));
				} else {
					Log.d(SUB_TAG, "RESPONSE_FULL_"+i+"/"+chunkCount+" : " + beautifyResponse.substring(4000 * i, max));
				}
			}
		} else {
			Log.d(SUB_TAG, "RESPONSE_FULL : " + beautifyResponse);
		}

		return response;
	}

	public String getErrorMessage() {
		return message;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public RestClientUpDown(String url) {
		this.url = url;
		params = new ArrayList<NameValuePair>();
		headers = new ArrayList<NameValuePair>();
		requestValues = "url :" + url + "\n{";
		Log.d(SUB_TAG, "url : "+url);
	}

	public void AddParam(String name, String value) {
		params.add(new BasicNameValuePair(name, value));
		requestValues += "\n\"" + name + "\":\"" + value + "\",";
	}

	public void AddHeader(String name, String value) {
		headers.add(new BasicNameValuePair(name, value));
	}

	public String getReQestValues() {
		return requestValues.substring(0, requestValues.length() - 1) + "\n}";
	}

	public void Execute(RequestMethod method) throws Exception {
		switch (method) {
		case GET: {
			try {
				String combinedParams = "";
				String paramString;
				if (!params.isEmpty()) {
					combinedParams += "?";
					for (NameValuePair p : params) {
						if (p.getName() == "accessToken") {
							paramString = p.getName() + "=" + p.getValue();
						} else {
							paramString = p.getName() + "="
									+ URLEncoder.encode(p.getValue(), "UTF-8");
						}

						if (combinedParams.length() > 1) {
							combinedParams += "&" + paramString;
						} else {
							combinedParams += paramString;
						}
					}
				}

				HttpGet request = new HttpGet(url + combinedParams);

				for (NameValuePair h : headers) {
					request.addHeader(h.getName(), h.getValue());
				}
				Log.d("RestClientUpDown", url + combinedParams);
				executeRequest(request, url);
				break;
			} catch (Exception e) {
				throw e;
			}
		}
		case POST: {
			try {
				HttpPost request = new HttpPost(url);

				for (NameValuePair h : headers) {
					request.addHeader(h.getName(), h.getValue());
				}

				if (!params.isEmpty()) {
					JSONObject jsonObject = new JSONObject();
					for (NameValuePair p : params) {
						jsonObject.put(p.getName(), p.getValue());
					}

					// StringEntity stringEntity = new StringEntity(
					// jsonObject.toString());
					String JSONobjectString = "";

					if (jsonObject.toString().contains("\"{")) {

						JSONobjectString = jsonObject.toString()
								.replace("\"{", "{").replace("}\"", "}")
								.replace("\\\"", "\"");
					} else {
						JSONobjectString = jsonObject.toString();
					}

					Log.d(SUB_TAG, "JSONobjectString : "+JSONobjectString);

					StringEntity stringEntity = new StringEntity(
							JSONobjectString);

					// stringEntity.setContentEncoding(new BasicHeader(
					// HTTP.CONTENT_TYPE, "application/json"));
					stringEntity.setContentEncoding(HTTP.UTF_8);

					request.setEntity(stringEntity);
					// request.setEntity(new UrlEncodedFormEntity(params,
					// HTTP.UTF_8));

				}

				Log.d("RestClientUpDown", EntityUtils.toString(request.getEntity()));

				if (EntityUtils.toString(request.getEntity()).length() > 4000) {
					Log.v("Result",
							"sb.length = "
									+ EntityUtils.toString(request.getEntity())
											.length());
					int chunkCount = EntityUtils.toString(request.getEntity())
							.length() / 4000; // integer division
					for (int i = 0; i <= chunkCount; i++) {
						int max = 4000 * (i + 1);
						if (max >= EntityUtils.toString(request.getEntity())
								.length()) {
							Log.v("Result",
									"chunk "
											+ i
											+ " of "
											+ chunkCount
											+ ":"
											+ EntityUtils.toString(
													request.getEntity())
													.substring(4000 * i));
						} else {
							Log.v("Result",
									"chunk "
											+ i
											+ " of "
											+ chunkCount
											+ ":"
											+ EntityUtils.toString(
													request.getEntity())
													.substring(4000 * i, max));
						}
					}
				} else {
					Log.v("Result", EntityUtils.toString(request.getEntity())
							.toString());
				}
				executeRequest(request, url);
				break;
			} catch (Exception e) {
				throw e;
			}
		}
		}
	}

	private void executeRequest(HttpUriRequest request, String url)
			throws Exception {
		Log.d("RestClientUpDown", url);
		HttpParams httpParameters = new BasicHttpParams();
		// Set the timeout in milliseconds until a connection is established.
		// The default value is zero, that means the timeout is not used.
		int timeoutConnection = Configuration.NETWORK_REQUEST_TIME_OUT;
		HttpConnectionParams.setConnectionTimeout(httpParameters,
				timeoutConnection);
		HttpConnectionParams.setSoTimeout(httpParameters,
				Configuration.NETWORK_REQUEST_TIME_OUT);
		HttpClient client;

		if (url.startsWith("https://")) {
			client = getSSLHttpClient(httpParameters);
		} else {
			client = new DefaultHttpClient(httpParameters);
		}

		((AbstractHttpClient) client).getCredentialsProvider().setCredentials(
				new AuthScope(AuthScope.ANY_HOST, AuthScope.ANY_PORT),
				new UsernamePasswordCredentials(StaticData.USER_NAME, StaticData.PASSWORD));

		HttpResponse httpResponse;
		try {
			HttpProtocolParams.setUseExpectContinue(client.getParams(), false);
			httpResponse = client.execute(request);
			responseCode = httpResponse.getStatusLine().getStatusCode();
			message = httpResponse.getStatusLine().getReasonPhrase();
			HttpEntity entity = httpResponse.getEntity();
			if (entity != null) {
				InputStream instream = entity.getContent();
				response = convertStreamToString(instream);
				instream.close();
				Log.d("RestClientUpDown", response);
			}

		} catch (ConnectTimeoutException connectTimeoutException) {
			client.getConnectionManager().shutdown();
			throw connectTimeoutException;
		} catch (ClientProtocolException e) {
			client.getConnectionManager().shutdown();
			throw e;
			// e.printStackTrace();
		} catch (IOException e) {
			client.getConnectionManager().shutdown();
			throw e;
			// e.printStackTrace();
		}
	}

	public HttpClient getSSLHttpClient(HttpParams params) {
		try {
			KeyStore trustStore = KeyStore.getInstance(KeyStore
					.getDefaultType());
			trustStore.load(null, null);

			SSLSocketFactory sf = new MySSLSocketFactory(trustStore);
			sf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

			HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
			HttpProtocolParams.setContentCharset(params, HTTP.UTF_8);

			SchemeRegistry registry = new SchemeRegistry();
			registry.register(new Scheme("http", PlainSocketFactory
					.getSocketFactory(), 80));
			registry.register(new Scheme("https", sf, 443));

			ClientConnectionManager ccm = new ThreadSafeClientConnManager(
					params, registry);

			return new DefaultHttpClient(ccm, params);
		} catch (Exception e) {
			return new DefaultHttpClient(params);
		}
	}

	private static String convertStreamToString(InputStream is) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		StringBuilder sb = new StringBuilder();

		String line = null;
		try {
			while ((line = reader.readLine()) != null) {
				sb.append(line + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sb.toString();
	}

}
