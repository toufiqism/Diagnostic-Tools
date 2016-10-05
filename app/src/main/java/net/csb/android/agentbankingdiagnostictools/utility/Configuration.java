package net.csb.android.agentbankingdiagnostictools.utility;

public class Configuration {

    public static final int POLLING_INTERVAL = 5000;
    public static final int MAX_SCAN_ATTEMPTS = 5;
    public static final String APP_TAG = "DOER>>";
    public static final int MAX_PRINT_ATTEMTS = 3;
    public static final int SESSION_TIME_OUT = 40 * 60 * 1000; // in miliseconds
    public static final String SERVER_ADDRESS = "http://172.16.205.209:4231/";
    //	public static final String SERVER_ADDRESS = "https://27.147.140.125/";
//	public static final String SERVER_ADDRESS = "http://172.16.205.207:4231/";
    public static final int FP_VALUE_TREHSHOLD = 30;
    public static final int FP_VERIFICATION_TIME_OUT = 30000;
    public static final int NETWORK_REQUEST_TIME_OUT = 40 * 1000;
    public static final String URL_CONFIG_PASSWORD = "AgraniDOER";

    public static final boolean PRODUCTION_MODE = false;


    public static final int NO_OF_ACCOUNT_LIST_FOR_APPROVAL = 20;
}
