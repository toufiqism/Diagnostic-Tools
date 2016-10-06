
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
import net.csb.android.agentbankingdiagnostictools.utility.StaticData;


public class UploadActivity extends AppCompatActivity {

    private String SERVICE_REQUEST_FOR_UPLOAD = "diagnostics/abl/upload10k";

    long baseTime = System.currentTimeMillis();
    String urlForDownload = "http://nothing.com/";
    int uploadCounter = 0;
    long[] uploadStartTime;
    long[] uploadEndTime;
    long[] uploadTimeInterval;


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

        urlForDownload = StaticData.BASEURL+SERVICE_REQUEST_FOR_UPLOAD;

        btnUpload = (Button) findViewById(R.id.btnUpload);
        urlCounter = (EditText) findViewById(R.id.counter);
        detailsReport = (TextView) findViewById(R.id.details);

        btnUpload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailsReport.setText("Uploading...");
                uploadCounter = Integer.parseInt(urlCounter.getText().toString());
                uploadStartTime = new long[uploadCounter];
                uploadEndTime = new long[uploadCounter];
                uploadTimeInterval = new long[uploadCounter];
                baseTime = System.currentTimeMillis();
                new UploadTask(UploadActivity.this).execute();
            }
        });
    }


    public class UploadTask extends
            AsyncTask<Void, Void, String> {

        private Context context;
        ProgressDialog pDialog;

        public UploadTask(Context con) {
            context = con;
            pDialog = new ProgressDialog(context);
            Log.d("UploadActivity", "uploadCounter : "+ uploadCounter);
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            uploadStartTime[uploadCounter -1] = System.currentTimeMillis()-baseTime;
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
            uploadEndTime[uploadCounter -1] = System.currentTimeMillis()-baseTime;
            uploadTimeInterval[uploadCounter -1] = uploadEndTime[uploadCounter -1] - uploadStartTime[uploadCounter -1];
            Log.d("UploadActivity", "Download Finished now .... "+  (System.currentTimeMillis()-baseTime));
            Log.d("UploadActivity", "result : "+result);
            onCancelled();
            uploadCounter--;
            if(uploadCounter >0){
                new UploadTask(UploadActivity.this).execute();
            }
            else{
                String detailsString = "";
                long totalTime = 0;
                for(int i = uploadEndTime.length-1; i>=0  ; i--){
                    totalTime += uploadTimeInterval[i];
                    detailsString += (uploadEndTime.length-i)+" : "+ uploadStartTime[i]+"-"+ uploadEndTime[i]+", "+ uploadTimeInterval[i]+"\n";
                }
                detailsString += "Total Time : "+totalTime+", average time : "+totalTime/ uploadEndTime.length;
                detailsReport.setText(detailsString);
            }
        }
    }



}
