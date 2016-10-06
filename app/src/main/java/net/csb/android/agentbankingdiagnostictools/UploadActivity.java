
package net.csb.android.agentbankingdiagnostictools;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import net.csb.android.agentbankingdiagnostictools.utility.MD5HashGenerator;
import net.csb.android.agentbankingdiagnostictools.utility.RestClientUpDown;


public class UploadActivity extends AppCompatActivity {

    long baseTime = System.currentTimeMillis();
    String urlForDownload = "http://192.168.0.111:4231/diagnostics/abl/upload10k";
    int downloadCounter = 0;
    long[] downloadStartTime;
    long[] downloadEndTime;
    long[] downloadTimeInterval;


    RestClientUpDown restClient;
    String response;
    Button btnUpload;
    EditText urlCounter;
    TextView detailsReport;

    String payloadMD5 = MD5HashGenerator.getMD5Hash(MD5HashGenerator.payload);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        btnUpload = (Button) findViewById(R.id.btnUpload);
        urlCounter = (EditText) findViewById(R.id.counter);
        detailsReport = (TextView) findViewById(R.id.details);

        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadCounter = Integer.parseInt(urlCounter.getText().toString());
                downloadStartTime = new long[downloadCounter];
                downloadEndTime= new long[downloadCounter];
                downloadTimeInterval= new long[downloadCounter];
                baseTime = System.currentTimeMillis();
                new AsyncCustomerEnquiryExistingAccount(UploadActivity.this).execute();
            }
        });
    }



    public class AsyncCustomerEnquiryExistingAccount extends
            AsyncTask<Void, Void, String> {

        private Context context;
        ProgressDialog pDialog;

        public AsyncCustomerEnquiryExistingAccount(Context con) {
            context = con;
            pDialog = new ProgressDialog(context);
            Log.d("UploadActivity", "downloadCounter : "+downloadCounter);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            downloadStartTime[downloadCounter-1] = System.currentTimeMillis()-baseTime;
            Log.d("UploadActivity", "Download Starting now .... "+  (System.currentTimeMillis()-baseTime));
        }

        @Override
        protected String doInBackground(Void... params) {

            try {

                restClient = new RestClientUpDown(urlForDownload);
                restClient.AddHeader("Content-Type", "application/json");

                restClient.AddParam("requestType", "upload10k");
                restClient.AddParam("requestID", "1234567890");
                restClient.AddParam("payloadMD5", payloadMD5);
                restClient.AddParam("payload", MD5HashGenerator.payload);
                restClient.AddParam("androidAppTime", ""+System.currentTimeMillis());

                restClient.Execute(RestClientUpDown.RequestMethod.POST);

                response = restClient.getResponse();

                Log.d("UploadActivity", "response : "+response);

            } catch (Exception e) {
               e.printStackTrace();
            }

            return response;

        }

        @Override
        protected void onPostExecute(String result) {
            super.onPostExecute(result);
            downloadEndTime[downloadCounter-1] = System.currentTimeMillis()-baseTime;
            downloadTimeInterval[downloadCounter-1] = downloadEndTime[downloadCounter-1] -downloadStartTime[downloadCounter-1];
            Log.d("UploadActivity", "Download Finished now .... "+  (System.currentTimeMillis()-baseTime));
            Log.d("UploadActivity", "result : "+result);
            onCancelled();
            downloadCounter--;
            if(downloadCounter>0){
                new AsyncCustomerEnquiryExistingAccount(UploadActivity.this).execute();
            }
            else{
                String detailsString = "";
                long totalTime = 0;
                for(int i=downloadEndTime.length-1 ; i>=0  ; i--){
                    totalTime += downloadTimeInterval[i];
                    detailsString += (downloadEndTime.length-i)+" : "+downloadStartTime[i]+"-"+downloadEndTime[i]+", "+downloadTimeInterval[i]+"\n";
                }
                detailsString += "Total Time : "+totalTime+", average time : "+totalTime/downloadEndTime.length;
                detailsReport.setText(detailsString);
            }
        }
    }



}
