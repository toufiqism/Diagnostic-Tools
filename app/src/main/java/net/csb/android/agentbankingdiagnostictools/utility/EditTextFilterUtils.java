package net.csb.android.agentbankingdiagnostictools.utility;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by anis on 4/10/16.
 */
public class EditTextFilterUtils {

    public static boolean isValidByPattern(String value, String regEx) {

        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile(regEx);
        matcher = pattern.matcher(value);

        boolean isMatched = matcher.matches();
//        Log.d("TEST_APP", "isMatched " + isMatched + " text :" + value + " regEx : " + regEx);
        return isMatched;
    }

    private static boolean isMatched(EditText editText, String reGex, boolean isReverse) {
        if (isReverse) {
            return !isValidByPattern(editText.getText().toString(), reGex);
        } else {
            return isValidByPattern(editText.getText().toString(), reGex);
        }
    }

    public static void filerEditText(final EditText editText, final String[][] regexSet) {

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (editText.getText().toString().length() > 0) {
                    for (int i = 0; i < regexSet.length; i++) {
                        if (isMatched(editText, regexSet[i][0], regexSet[i][2].equals("true"))) {
                            Log.d("TEST_APP", "OK");
                            editText.setError(null);
                        } else {
                            Log.d("TEST_APP", "NOT OK");
                            Editable currentText = editText.getText();
                            if (currentText.length() > 0) {
                                currentText.delete(currentText.length() - 1,
                                        currentText.length());
                                editText.setText(currentText);
                                editText.setSelection(editText.getText().length());
                            }
                            editText.setError(regexSet[i][1]);
                            break;
                        }
                    }
                }
            }
        });
    }
}
