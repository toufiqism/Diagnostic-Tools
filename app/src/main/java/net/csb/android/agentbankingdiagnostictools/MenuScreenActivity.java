package net.csb.android.agentbankingdiagnostictools;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.Image;
import android.os.AsyncTask;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import net.csb.android.agentbankingdiagnostictools.serverconnection.RestClient;
import net.csb.android.agentbankingdiagnostictools.utility.AppUtils;
import net.csb.android.agentbankingdiagnostictools.utility.Configuration;
import net.csb.android.agentbankingdiagnostictools.utility.Constants;
import net.csb.android.agentbankingdiagnostictools.utility.Logger;
import net.csb.android.agentbankingdiagnostictools.utility.PasswordEncryptor;
import net.csb.android.agentbankingdiagnostictools.utility.RestParameters;
import net.csb.android.agentbankingdiagnostictools.utility.StaticData;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.conn.HttpHostConnectException;
import org.json.JSONObject;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuScreenActivity extends AppCompatActivity {

    LinearLayout layoutServerIP, layoutAgentBalanceEnquiryInAgentTools, layoutResponse, layoutNumberOfTasksToBeExecutedInAgentTools;
    ImageView imvServerIP;
    Button btnGoBack;
    ImageView imvTask;
    EditText txtTask, txtServerIp;
    TextView txtResponse;
    StringBuilder globalStringBuilder = new StringBuilder("");
    long t1;
    long t2;
    private String TAG = MenuScreenActivity.class.getSimpleName();
    static String URL = "http://192.168.5.253:4231/diagnostics/abl/pingpong";
    final static String BALANCE_INQUIRY = "diagnostics/abl/pingpong";
    //http://192.168.5.253:4231/diagnostics/abl/pingpong
    int times;
    private boolean flag = false;
    int init = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);
        try {
            initializeUIControls();
            loadData();
            registerActionEvents();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private void registerActionEvents() throws Exception {
        layoutAgentBalanceEnquiryInAgentTools.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = true;
                new AsyncAgentBalanceInquiry(MenuScreenActivity.this).execute();
            }
        });
        txtTask.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                times = Integer.parseInt(txtTask.getText().toString().length() != 0 ? txtTask.getText().toString() : "0");
            }
        });
        imvTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag = false;
                if (txtTask.getText().toString().length() > 0) {

                    new AsyncAgentBalanceInquiry(MenuScreenActivity.this).execute();


                } else {
                    AppUtils.ShowToast(MenuScreenActivity.this, "please enter a number");
                    return;
                }
            }
        });
        imvServerIP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                URL = txtServerIp.getText().toString().trim();
            }
        });
        txtResponse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtResponse.setText("");
                layoutResponse.setVisibility(View.GONE);
            }
        });
    }

    private void loadData() {

    }

    private void initializeUIControls() throws Exception {
        imvServerIP = (ImageView) findViewById(R.id.imvServerIP);
        txtServerIp = (EditText) findViewById(R.id.txtServerIp);
        layoutServerIP = (LinearLayout) findViewById(R.id.layoutServerIP);
        layoutAgentBalanceEnquiryInAgentTools = (LinearLayout) findViewById(R.id.layoutAgentBalanceEnquiryInAgentTools);
        btnGoBack = (Button) findViewById(R.id.btnGoBack);
        txtResponse = (TextView) findViewById(R.id.txtResponse);
        layoutResponse = (LinearLayout) findViewById(R.id.layoutResponse);
        txtTask = (EditText) findViewById(R.id.txtTask);
        imvTask = (ImageView) findViewById(R.id.imvTask);
        if (txtResponse.getText().toString().length() == 0) {
            txtResponse.setText("0");
        }

        final EditText input = new EditText(MenuScreenActivity.this);
        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        input.setLayoutParams(lp);
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        final EditText input_password = new EditText(MenuScreenActivity.this);
        LinearLayout.LayoutParams lp_p = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        input_password.setLayoutParams(lp_p);
        input_password.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        new AlertDialog.Builder(MenuScreenActivity.this)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setTitle("User Name")
                .setView(input)
                .setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which) {

                                try {

                                    if (input.getText().toString()
                                            .length() != 0) {

                                        StaticData.USER_NAME = input.getText().toString();

                                        new AlertDialog.Builder(MenuScreenActivity.this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Password").setView(input_password).setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialog, int which) {
                                                try {


                                                    if (input_password.getText().toString().length() != 0) {
                                                        StaticData.PASSWORD = PasswordEncryptor.sha1(input_password.getText().toString().trim());
                                                    }


                                                } catch (Exception exp) {

                                                    exp.printStackTrace();

                                                }
                                            }
                                        }).setNegativeButton("Cancel", null).show();
                                    }

                                } catch (Exception exp) {

                                    exp.printStackTrace();

                                }

                            }

                        }).setNegativeButton("Cancel", null).show();


    }

    public static RestClient getAgentBalanceInquiryRestClient(String url) {
        int retryCount = 0;
        String requestID = "";


        Log.d("Agent Balance Inquiry ", "Agent Balance Inquiry");


        RestClient restClient = new RestClient(url);
        restClient.AddHeader(RestParameters.CONTENT_TYPE,
                RestParameters.CONTENT_TYPE_APP_JSON);


        restClient.AddParam("requestType", "pingrequest");
        restClient.AddParam("requestID", new Date().toString());
        restClient.AddParam("payload", "PING");
        restClient.AddParam("androidAppTime", new Date().toString());


        return restClient;
    }

    public static Timestamp convertStringToTimestamp(String str_date) {
        try {
            DateFormat formatter;
            formatter = new SimpleDateFormat("dd/MM/yyyy");
            // you can change format of date
            Date date = formatter.parse(str_date);
            java.sql.Timestamp timeStampDate = new Timestamp(date.getTime());

            return timeStampDate;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public class AsyncAgentBalanceInquiry extends AsyncTask<Void, Void, String> {

        private Context context;
        ProgressDialog pDialog;

        RestClient restClient;
        String response;

        String status = "", transID = "", message = "", serverTimeStamp = "",
                balance = "", lockedAmount = "";
        String errorMessage = "", requestType = "", androidAppTime = "", payload = "", recievedServerTime = "", sentServerTime = "";

        public AsyncAgentBalanceInquiry(Context context) {
            this.context = context;
            pDialog = new ProgressDialog(context);

        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub

            super.onPreExecute();
            t1 = System.currentTimeMillis();
            pDialog.setMessage("Loading...");
            pDialog.setIndeterminate(true);
            pDialog.setCancelable(false);
            pDialog.show();


        }

        @Override
        protected String doInBackground(Void... params) {
            // TODO Auto-generated method stub

            try {

                restClient =
                        getAgentBalanceInquiryRestClient(URL);

                restClient.Execute(RestClient.RequestMethod.POST);

                response = restClient.getResponse();

                JSONObject responseJSON = new JSONObject(response);

                status = responseJSON.getString(RestParameters.STATUS);

//                transID = responseJSON.getString(RestParameters.TRANS_ID);
                // serverTimeStamp = responseJSON.getString(RestParameters.SERVER_TIMESTAMP);
                requestType = responseJSON.getString("requestType");
                androidAppTime = responseJSON.getString("androidAppTime");
                payload = responseJSON.getString("payload");
                recievedServerTime = responseJSON.getString("recievedServerTime");
                sentServerTime = responseJSON.getString("sentServerTime");

                //  errorMessage = responseJSON.getString(RestParameters.MESSAGE);

            } catch (HttpHostConnectException httpHostConnectException) {
                httpHostConnectException.printStackTrace();
                response = "";
                status = Constants.STATUS_CONNECTION_TIME_OUT;
                AppUtils.NETWORK_ERROR_MESSAGE = Constants.SERVER_IS_UNREACHABLE;
                Logger.AddLog(
                        Constants.TAG_EXCEPTION,
                        "Time :"
                                + AppUtils.getCurrentTime()
                                + " Msg :"
                                + (httpHostConnectException.getMessage() == null ? ""
                                : httpHostConnectException.getMessage()));

            } catch (ClientProtocolException clientProtocolException) {
                clientProtocolException.printStackTrace();
                response = "";
                status = Constants.STATUS_CONNECTION_TIME_OUT;
                AppUtils.NETWORK_ERROR_MESSAGE = Constants.SERVER_CONNECTION_TIME_OUT;
                Logger.AddLog(
                        Constants.TAG_EXCEPTION,
                        "Time :"
                                + AppUtils.getCurrentTime()
                                + " Msg :"
                                + (clientProtocolException.getMessage() == null ? ""
                                : clientProtocolException.getMessage()));

            } catch (IOException ioException) {
                ioException.printStackTrace();
                response = "";
                status = Constants.STATUS_CONNECTION_TIME_OUT;
                AppUtils.NETWORK_ERROR_MESSAGE = Constants.SERVER_CONNECTION_TIME_OUT;
                Logger.AddLog(Constants.TAG_EXCEPTION,
                        "Time :"
                                + AppUtils.getCurrentTime()
                                + " Msg :"
                                + (ioException.getMessage() == null ? ""
                                : ioException.getMessage()));

            } catch (Exception exception) {
                exception.printStackTrace();
                Logger.AddLog(Constants.TAG_EXCEPTION,
                        "Time :"
                                + AppUtils.getCurrentTime()
                                + " Msg :"
                                + (exception.getMessage() == null ? ""
                                : exception.getMessage()));

                status = "";
                response = "";

            }

            return response;

        }

        @Override
        protected void onPostExecute(String result) {
            // TODO Auto-generated method stub
            super.onPostExecute(result);

            if (pDialog.isShowing())
                pDialog.dismiss();

            if (status.compareToIgnoreCase(RestParameters.STATUS_OK) == 0) {

                try {
                    if (flag) {
                        layoutResponse.setVisibility(View.VISIBLE);
                        StringBuilder stringBuilder = new StringBuilder("");

                        stringBuilder.append("Request Type : " + requestType + "\n");


                        stringBuilder.append("Payload: " + payload + "\n");
                        stringBuilder.append("Android App Time: " + androidAppTime + "\n");
                        stringBuilder.append("Received Time from server: " + AppUtils.formatDate(recievedServerTime) + "\n");
                        stringBuilder.append("Send Time from server: " + AppUtils.formatDate(sentServerTime) + "\n");

                        txtResponse.setText(stringBuilder.toString());
                    } else {


                        layoutResponse.setVisibility(View.VISIBLE);
                        //txtResponse.setText("asd");
                        init++;
                        t2 = System.currentTimeMillis();
                        long ave = (t2 - t1) / times;
                        String s = String.valueOf(t2 - t1);
                        globalStringBuilder.append("Difference in millis :" + s + "\n");
                        Log.d(TAG, "::DATA::" + globalStringBuilder);
                        txtResponse.setText(globalStringBuilder);
                        checkINIT();
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            } else if (status.compareToIgnoreCase(RestParameters.STATUS_FAILED) == 0) {

                try {

                    Log.d(TAG, "AgentBalance: Status Fail : " + result);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            } else if (status.length() != 0
                    && status
                    .compareToIgnoreCase(Constants.STATUS_CONNECTION_TIME_OUT) == 0) {

                try {
                    Log.d(TAG, "AgentBalance: Status Timed Out ");

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            } else if (status.length() == 0) {

                Log.d(TAG, "AgentBalance: Status Null ");
            }

        }
    }

    private void checkINIT() {
        if (init < times) {
            AsyncAgentBalanceInquiry asyncAgentBalanceInquiry = new AsyncAgentBalanceInquiry(MenuScreenActivity.this);
            asyncAgentBalanceInquiry.cancel(true);
            Log.d(TAG, "checkINIT: " + times + "& " + init);
            imvTask.performClick();
            //   new AsyncAgentBalanceInquiry(MenuScreenActivity.this);
        } else {
            init = 0;
            globalStringBuilder.setLength(0);
            globalStringBuilder = new StringBuilder("");
            return;
        }
    }
}
