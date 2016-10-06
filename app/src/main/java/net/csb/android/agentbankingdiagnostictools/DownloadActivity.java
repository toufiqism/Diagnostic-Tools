
package net.csb.android.agentbankingdiagnostictools;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Environment;
import android.os.PowerManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import net.csb.android.agentbankingdiagnostictools.utility.DownlaodSettings;
import net.csb.android.agentbankingdiagnostictools.utility.StaticData;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class DownloadActivity extends AppCompatActivity {

    long baseTime = System.currentTimeMillis();
    String urlForDownload = "";
    int[] fileSize;
    int downloadCounter = 0;
    long[] downloadStartTime;
    long[] downloadEndTime;
    long[] downloadTimeInterval;

    TextView details;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.btnDownload);
        Button btnSelectUrl = (Button) findViewById(R.id.btnUrlSelect);
        final TextView urlText = (TextView) findViewById(R.id.urlText);
        details = (TextView) findViewById(R.id.details);
        final EditText urlCounter = (EditText) findViewById(R.id.counter);

        urlForDownload = StaticData.BASEURL+DownlaodSettings.URL_LIST[0];
        urlText.setText(urlForDownload);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                details.setText("Downloading...");
                downloadCounter = Integer.parseInt(urlCounter.getText().toString());
                fileSize = new int[downloadCounter];
                downloadStartTime = new long[downloadCounter];
                downloadEndTime= new long[downloadCounter];
                downloadTimeInterval= new long[downloadCounter];
                baseTime = System.currentTimeMillis();
                new DownloadTask(DownloadActivity.this).execute();
            }
        });

        btnSelectUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(DownloadActivity.this);
                alertDialogBuilder.setTitle("Title");
                alertDialogBuilder.setItems(DownlaodSettings.URL_LIST, new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialogInterface, int arg) {
                        Log.d("DownloadActivity", ""+arg);
                        urlForDownload = StaticData.BASEURL+DownlaodSettings.URL_LIST[arg];
                        Log.d("DownloadActivity", "urlForDownload : "+urlForDownload);
                        Toast.makeText(DownloadActivity.this, arg+" : "+urlForDownload, Toast.LENGTH_SHORT).show();
                        urlText.setText(urlForDownload);
                    }
                });
                alertDialogBuilder.create().show();
            }
        });



    }


    private class DownloadTask extends AsyncTask<String, Integer, String> {

        private Context context;
        private PowerManager.WakeLock mWakeLock;

        public DownloadTask(Context context) {
            this.context = context;
            Log.d("DownloadActivity", "uploadCounter : "+downloadCounter);
        }

        @Override
        protected void onPreExecute() {
            downloadStartTime[downloadCounter-1] = System.currentTimeMillis()-baseTime;
            Log.d("DownloadActivity", "Download Starting now .... "+  (System.currentTimeMillis()-baseTime));
        }


        @Override
        protected void onPostExecute(String result) {
            downloadEndTime[downloadCounter-1] = System.currentTimeMillis()-baseTime;
            downloadTimeInterval[downloadCounter-1] = downloadEndTime[downloadCounter-1] -downloadStartTime[downloadCounter-1];
            Log.d("DownloadActivity", "Download Finished now .... "+  (System.currentTimeMillis()-baseTime));
            Log.d("DownloadActivity", "result : "+result);
            onCancelled();
            downloadCounter--;
            if(downloadCounter>0){
                 new DownloadTask(DownloadActivity.this).execute();
            }
            else{
                String detailsString = "\n";
                long totalTime = 0;
                long totalSpeed = 0;
                for(int i=downloadEndTime.length-1 ; i>=0  ; i--){
                    totalTime += downloadTimeInterval[i];
                    double speed = (double)fileSize[i]/(double)downloadTimeInterval[i];
                    totalSpeed += speed;
                    detailsString += (downloadEndTime.length-i)+" : "+String.format("%05d", downloadStartTime[i])+"-"+String.format("%05d", downloadEndTime[i])+", "+String.format("%05d", downloadTimeInterval[i])+"ms, SPEED: "+String.format("%5.2f", speed)+"KB\n";
                }
                detailsString += "\nTotal Time : "+totalTime+"\naverage time : "+totalTime/downloadEndTime.length+"\naverage speed : "+String.format("%.2f", (double)totalSpeed/(double)downloadEndTime.length);
                details.setText(detailsString);
            }
        }

        @Override
        protected String doInBackground(String... sUrl) {
            InputStream input = null;
            OutputStream output = null;
            HttpURLConnection connection = null;
            try {

                Log.d("DownloadActivity", "Starting time : "+  (System.currentTimeMillis()-baseTime));

//                URL url = new URL("http://192.168.0.111/100KBdownload.jpg");
                URL url = new URL(urlForDownload);
                connection = (HttpURLConnection) url.openConnection();
                connection.connect();

                fileSize[downloadCounter-1] = connection.getContentLength();
                Log.d("DownloadActivity", "file size : "+fileSize[downloadCounter-1]);

                Log.d("DownloadActivity", "connectivity time : "+  (System.currentTimeMillis()-baseTime));
                // expect HTTP 200 OK, so we don't mistakenly save error report
                // instead of the file
                if (connection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                    return "Server returned HTTP " + connection.getResponseCode()
                            + " " + connection.getResponseMessage();
                }

                // this will be useful to display download percentage
                // might be -1: server did not report the length
                int fileLength = connection.getContentLength();

                Log.d("DownloadActivity", "download start time : "+  (System.currentTimeMillis()-baseTime));
                // download the file
                input = connection.getInputStream();
                output = new FileOutputStream("/sdcard/"+downloadCounter+"_"+urlForDownload.substring( urlForDownload.lastIndexOf('/')+1, urlForDownload.length() ));

                Log.d("DownloadActivity", "download finish time : "+  (System.currentTimeMillis()-baseTime));


                byte data[] = new byte[4096];
                long total = 0;
                int count;
                while ((count = input.read(data)) != -1) {
                    // allow canceling with back button
//                    if (isCancelled()) {
//                        input.close();
//                        return null;
//                    }
                    total += count;
                    // publishing the progress....
//                    if (fileLength > 0) // only if total length is known
//                        publishProgress((int) (total * 100 / fileLength));
                    output.write(data, 0, count);
                }
                Log.d("DownloadActivity", "downloaded file write time : "+  (System.currentTimeMillis()-baseTime));
            } catch (Exception e) {
                return e.toString();
            } finally {
                try {
                    if (output != null)
                        output.close();
                    if (input != null)
                        input.close();
                } catch (IOException ignored) {
                }

                if (connection != null)
                    connection.disconnect();
            }
            return null;
        }

    public void DownloadFiles(){

        try {
            URL u = new URL("http://themes.g5plus.net/academia/wp-content/uploads/2015/07/Adobe-Intro-to-Scripting-1.pdf");
            InputStream is = u.openStream();

            DataInputStream dis = new DataInputStream(is);

            byte[] buffer = new byte[1024];
            int length;

            FileOutputStream fos = new FileOutputStream(new File(Environment.getExternalStorageDirectory() + "/" + "data/test.kml"));
            while ((length = dis.read(buffer))>0) {
                fos.write(buffer, 0, length);
            }

        } catch (MalformedURLException mue) {
            Log.e("SYNC getUpdate", "malformed url error", mue);
        } catch (IOException ioe) {
            Log.e("SYNC getUpdate", "io error", ioe);
        } catch (SecurityException se) {
            Log.e("SYNC getUpdate", "security error", se);
        }
    }
    }

}
