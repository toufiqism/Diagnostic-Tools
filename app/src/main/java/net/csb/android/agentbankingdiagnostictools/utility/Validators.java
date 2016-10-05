package net.csb.android.agentbankingdiagnostictools.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by arhabib on 12/28/15.
 */
public class Validators {
    static final String REGEX_EMAIL = android.util.Patterns.EMAIL_ADDRESS
            .pattern();
    static final String REGEX_NATIONAL_ID = "[0-9]{13}";
    static final String REGEX_PHONE_NO = "[0-9]{11}";
    //static final String REGEX_PHONE_NO = "[+][0-9]{13}";
    static final String REGEX_PASSPORT = "[a-zA-Z]{1,2}[0-9]{7}";

    public static boolean isAccountNoValid(String accountNo) {

        if (accountNo.length() == 13) {

            return true;
        }

        return false;

    }
    public static boolean isBirthRegistrationNoValid(String birthRegistrationNo) {


        if (birthRegistrationNo.length() == 17) {

            return true;
        } else {
            return false;
        }

        //   return isValid(nidNumber, REGEX_NATIONAL_ID);
    }

    public static boolean isPinNumberValid(String pin) {

        if (pin.length() == 17) {

            return true;
        }

        return false;

    }


    public static boolean isNationalIDValid(String nidNumber) {


        if (nidNumber.length() == 13 || nidNumber.length() == 17) {

            return true;
        } else {
            return false;
        }

        //   return isValid(nidNumber, REGEX_NATIONAL_ID);
    }


    public static boolean isPassportNoValid(String passportNumber) {


        return isValid(passportNumber, REGEX_PASSPORT);
    }


    public static boolean isTINValid() {


        return false;
    }

    public static boolean isMobileNumberValid(String mobileNumber) {


        return isValid(mobileNumber, REGEX_PHONE_NO);
    }


    private static boolean isValid(String value, String regEx) {

        Pattern pattern;
        Matcher matcher;

        pattern = Pattern.compile(regEx);
        matcher = pattern.matcher(value);

        return matcher.matches();
    }

}
