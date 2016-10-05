package net.csb.android.agentbankingdiagnostictools.utility;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;


/**
 * Created by Toufiq on 12/28/15.
 */
public class AlertDialogFragment extends DialogFragment {

    String title;
    String msg;
    String okButtonText;
    String okButtonActivity;
    String okButtonActivitySeqID;
    String cancelButtonActivity;
    String cancelButtonActivitySeqID;
    String fullWorkflowJSONString;


    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {


        Bundle bundle = getArguments();

        title = bundle.getString(IntentConstants.TITLE);
        msg = bundle.getString(IntentConstants.MESSAGE);
        okButtonText = bundle.getString(IntentConstants.OK_BUTTON_TEXT);
        okButtonActivity = bundle.getString(IntentConstants.OK_BUTTON_ACTIVITY);
        okButtonActivitySeqID = bundle.getString(IntentConstants.OK_BUTTON_ACTIVITY_SEQ_ID);
        cancelButtonActivity = bundle.getString(IntentConstants.CANCEL_BUTTON_ACTIVITY);
        cancelButtonActivitySeqID = bundle.getString(IntentConstants.CANCEL_BUTTON_ACTIVITY_SEQ_ID);
        fullWorkflowJSONString = bundle.getString(IntentConstants.FULL_WORKFLOW_JSON_STRING);


        return new AlertDialog.Builder(getActivity())
                // Set Dialog Icon
                .setIcon(android.R.drawable.sym_def_app_icon)
                // Set Dialog Title
                .setTitle(title)
                // Set Dialog Message
                .setMessage(msg)

                // Positive button
                .setPositiveButton(okButtonText, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something else


                        Intent intent = null;
                        try {
                            intent = new Intent(getActivity(), Class.forName(okButtonActivity));

                            intent.putExtra(
                                    IntentConstants.FULL_WORKFLOW_JSON_STRING,
                                    fullWorkflowJSONString);
                            intent.putExtra(
                                    IntentConstants.BUTTON_SEQ_ID,
                                    okButtonActivitySeqID);


                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        startActivity(intent);

                    }
                })

                // Negative Button
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // Do something else


                     /*   Intent intent = null;
                        try {
                            intent = new Intent(getActivity(), Class.forName(cancelButtonActivity));

                            intent.putExtra(
                                    IntentConstants.FULL_WORKFLOW_JSON_STRING,
                                    fullWorkflowJSONString);
                            intent.putExtra(
                                    IntentConstants.BUTTON_SEQ_ID,
                                    cancelButtonActivitySeqID);


                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        startActivity(intent);
*/


                    }
                }).create();
    }
}
