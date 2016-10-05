package net.csb.android.agentbankingdiagnostictools.utility;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by arhabib on 12/27/15.
 */
public class DomainConstants {

    public static final String BANK_NAME = "bankName";
    public static final String LBL_TITLE_2_V_TEXT = "lblTitle2VText";
    public static final String MENU_OPEN_NEW_ACCOUNT = "Open New Account";
    public static final String MENU_OPEN_ADDITIONAL_ACCOUNT = "Open Additional Account";
    public static final String MENU_SEARCH_CUSTOMER = "Search Customer";
    public static final String MENU_SERVICE_REQUEST = "Service Request";
    public static final String MENU_INCOMPLETE_REQUEST = "Incomplete Request";
    public static final String MENU_EXISTING_ACCOUNT_ENROL = "Exiting Account Enroll";
    public static final String MENU_UTILITY_BILL_PAYMENTS = "Utility Bill Payment";
    public static final String MENU_CASH_DEPOSIT = "Cash Deposit";
    public static final String MENU_CASH_WITHDRAW = "Cash Withdraw";
    public static final String MENU_FUND_TRANSFER = "Fund Transfer";
    public static final String MENU_BALANCE_INQUIRY = "Balance Inquiry";
    public static final String MENU_PRINT_MINI_STATEMENT = "Mini Statement";
    public static final String MENU_ACCOUNT_LIST_FOR_APPROVAL = "Account List";
    public static final String MENU_REMITTANCE = "Remittance";
    public static final String MENU_DPS_ACCOUNT_SUMMARY = "DPS Account Summary";
    public static final String MENU_DPS_FDR_ENCASHMENT_SUMMARY = "DPS/FDR Encashment Summary";
    public static final String MENU_TOOLS = "Tools";
    public static final String MENU_AGENT_FP_ENROLLMENT = "Agent FP Enrollment";
    public static final String MENU_AGENT_STAFF_FP_ENROLLMENT = "Agent Staff FP Enrollment";
    public static final String MENU_DST_FP_ENROLLMENT = "DST FP Enrollment";
    public static final String BIRTH_REGISTRATION_NO = "Birth Registration No";
    public static final String TRANSACTION_TYPE_CASH_DEPOSIT = "CashDeposit";
    public static final String TRANSACTION_TYPE_CASH_DEPOSIT_SELF = "CashDepositSelf";
    public static final String TRANSACTION_TYPE_CASH_DEPOSIT_BEARER = "CashDepositBearer";
    public static final String TRANSACTION_TYPE_CASH_WITHDRAW = "CashWithdraw";
    public static final String TRANSACTION_TYPE_FUND_TRANSFER = "FundTransfer";
    public static final String TRANSACTION_TYPE_BALANCE_INQUIRY = "BalanceInquiry";
    public static final String TRANSACTION_TYPE_MINI_STATEMENT = "MiniStatement";
    public static final String TRANSACTION_TYPE_IFR_WITHDRAWAL = "IFRWithdrawal";
    public static final String TRANSACTION_TYPE_IFRREQUEST = "IFRRequest";
    public static final String TRANSACTION_TYPE_AGENT_BALANCE_INQUIRY = "AgentBalanceInquiry";

    public static final String RECIEVED_KEY = "FPforEnrollment";
    public static final String SEND_KEY = "FPforEnrollment";
    public static final String SEND_KEY_SINGLE_FINGER = "FPforEnrollmentSingleFingerSend";
    public static final String RECEIVED_KEY_SINGLE_FINGER = "FPforEnrollmentSingleFingerRecieved";
    public static final String SEND_PACKAGE_NAME = Constants.ENROLLMENT_PACKAGE_NAME;
    public static final String SEND_PACKAGE_NAME_SINGLE_FINGER = Constants.ENROLLMENT_PACKAGE_NAME_ENROLLMENT_CLASS_PATH;
    public static final String RE_SEND = "EnrolledFP";
    public static final String ENROLLEDMENT_STATUS_ENROLLED = "ok";
    public static final String ENROLLEDMENT_STATUS_CANNOT_VERIFIED = "not_ok";
    public static final String RE_SEND_ENROLLEDMENT_STATUS = "EnrolledFPStatus";

    public static final String NID = "NID";
    public static final String PASSPORT_NO = "Passport No";
    public static final String BIRTH_CERTIFICATE_NUMBER = "Birth Certificate";
    public static final ArrayList<String> bankingMenus = new ArrayList<String>(Arrays.asList(new String[]{MENU_OPEN_NEW_ACCOUNT, MENU_OPEN_ADDITIONAL_ACCOUNT, MENU_SEARCH_CUSTOMER, MENU_SERVICE_REQUEST, MENU_INCOMPLETE_REQUEST, MENU_UTILITY_BILL_PAYMENTS, MENU_CASH_DEPOSIT, MENU_CASH_WITHDRAW, MENU_FUND_TRANSFER, MENU_BALANCE_INQUIRY, MENU_PRINT_MINI_STATEMENT, MENU_REMITTANCE, MENU_DPS_ACCOUNT_SUMMARY, MENU_DPS_FDR_ENCASHMENT_SUMMARY, MENU_TOOLS}));


    public static final String TRANSFER_TYPE_SELF_ACCOUNT_NO = "SELF";
    public static final String TRANSFER_TYPE_CBL_ACCOUNT_NO = "CBL";
    public static final String TRANSFER_TYPE_EFT = "EFT";
    public static final String USER_ID_AGENT = "User.Agent";
    public static final String USER_ID_AGENT_STAFF = "User.AgentStaff";
    public static final String USER_ID_DST = "User.DST";

    public static final int USER_ID_AGENT_LENGTH = 6;
    public static final int USER_ID_AGENT_STAFF_LENGTH = 8;
    public static final int USER_ID_DST__LENGTH = 8;

    public static final String USERNAME = "username";
    public static final String AGENT_NAME = "agent_name";
    public static final String AGENT_BALANCE = "agent_balance";
    public static final String AGENT_LOCATION = "agent_location";

    public static final String ROLE_ABD_SYS_MAKER = "ABD.Sys.Maker";
    public static final String ROLE_AGENT_CAO = "AGENT.CAO";
    public static final String ROLE_BRANCH_MAKER = "BRANCH.MAKER";


    public static final String CUSTOMER_TYPE_PERSONAL = "PERSONAL CUSTOMER";

    public static final String CUSTOMER_TYPE_JOINT = "JOINT CUSTOMER";

    public static final String CUSTOMER_TYPE_CORPORTE = "CORPORATE CUSTOMER";

    public static final String CUSTOMER_TYPE_MINOR = "MINOR CUSTOMER";


    public static final String MENU_REMITTANCE_WITHDRAWAL = "Remittance Withdraw";

    public static final String DEVICE_NAME = "device_name";

    public static final String MORPHO_MSO_1300_E = "morpho";
    public static final String PROWESS_EVOLUTE = "evolute";
    public static final String E_CONNECT_HM71 = "e_connect";
    public static final String DEVICE_MAC_ADDRESS = "device_mac_address";
    public static final String DEVICE_MAC = "8C:73:6E:FA:F5:FF";

    public static final String TIME_OUT = "Timeout";
    public static final String ABD_SYS_DEVICE = "ABD.Sys.Device";
    public static final String ADDRESS_VERIFICATION_BY_BANK_OFFICIAL = "By Bank Official";
    public static final String ADDRESS_VERIFICATION_BY_TELEPHONE_BILL = "BTCL Telephone Bill";
    public static final String ADDRESS_VERIFICATION_BY_RENTAL_AGREEMENT = "Rental Agreement";
    public static final String ADDRESS_VERIFICATION_BY_UTILITY_BILL = "Utility Bill";
    public static final String ADDRESS_VERIFICATION_BY_AS_IN_PHOTO_DOCUMENT = "As In Photo ID Document";

    public static int SCREEN_TIME_OUT = 10;
    public static String KYC_MASTER_DATA_JSON_CURRENT = "[{\"OID\":\"01\",\"description\":\"Account Name:\"},{\"OID\":\"02\",\"description\":\"Account Type:\"},{\"OID\":\"03\",\"description\":\"Account or Reference No.:\"},{\"OID\":\"04\",\"description\":\"Name of Officer Opening the Account:\"},{\"OID\":\"05\",\"description\":\"Nature of Business and Sources of Fund:\"},{\"OID\":\"06\",\"description\":\"Describe how the source of fund has been verified, and confirmation of whether or not the amount of transaction is commensurate with the nature of business described when the relationship was established:\"},{\"OID\":\"07\",\"description\":\"Who is the Beneficial Owner of the account (Detailed information of the shareholder controlling the company and the single shareholder holding 20% or more share):\"},{\"OID\":\"08\",\"description\":\"Voter ID Card No.:\"},{\"OID\":\"08.1\",\"description\":\"Photocopy Obtained?\"},{\"OID\":\"09\",\"descripion\":\"What does the Customer do/In what type of business is the customer engaged:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Category\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Score\"},{\"optionID\":\"01\",\"optionDescription\":\"Jewelry/Gems Trade\",\"optionRisk\":\"High\",\"optionScore\":\"5\"},{\"optionID\":\"02\",\"optionDescription\":\"Money Changer/Courier Service Agent\",\"optionRisk\":\"High\",\"optionScore\":\"5\"},{\"optionID\":\"03\",\"optionDescription\":\"Real Estate Agent\",\"optionRisk\":\"High\",\"optionScore\":\"5\"},{\"optionID\":\"04\",\"optionDescription\":\"Promoter of Construction Project\",\"optionRisk\":\"High\",\"optionScore\":\"5\"}]},{\"OID\":\"10\",\"descripion\":\"What is the Net Worth/Sales Turnover of the Customer:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Amount (Tk.)\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Risk Rating\"},{\"optionID\":\"01\",\"optionDescription\":\"0 – 50 Lacs\",\"optionRisk\":\"Low\",\"optionScore\":\"0\"},{\"optionID\":\"02\",\"optionDescription\":\"50 Lacs – 2 Crore\",\"optionRisk\":\"Medium\",\"optionScore\":\"1\"},{\"optionID\":\"03\",\"optionDescription\":\"> 2 Crore\",\"optionRisk\":\"High\",\"optionScore\":\"3\"}]},{\"OID\":\"11\",\"descripion\":\"What does the Customer do/In what type of business is the customer engaged:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Type\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Risk Rating\"},{\"optionID\":\"01\",\"optionDescription\":\"By the Relationship Manager/Branch\",\"optionRisk\":\"Low\",\"optionScore\":\"0\"},{\"optionID\":\"02\",\"optionDescription\":\"By Direct Sales Agent\",\"optionRisk\":\"Medium\",\"optionScore\":\"1\"},{\"optionID\":\"03\",\"optionDescription\":\"Internet\",\"optionRisk\":\"High\",\"optionScore\":\"3\"},{\"optionID\":\"04\",\"optionDescription\":\"Walk-in/Unsolicited\",\"optionRisk\":\"High\",\"optionScore\":\"3\"}]},{\"OID\":\"12\",\"descripion\":\"Expected Amount of Monthly Total Transactions:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Amount of Total Transaction in Current A/C (Tk. Lacs)\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Risk Rating\"},{\"optionID\":\"01\",\"optionDescription\":\"0 – 10\",\"optionRisk\":\"Low\",\"optionScore\":\"0\"},{\"optionID\":\"02\",\"optionDescription\":\"10 – 50\",\"optionRisk\":\"Medium\",\"optionScore\":\"1\"},{\"optionID\":\"03\",\"optionDescription\":\"> 50\",\"optionRisk\":\"High\",\"optionScore\":\"3\"}]},{\"OID\":\"13\",\"descripion\":\"Expected Number of Monthly Total Transactions:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Number of Total Transaction in Current A/C\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Risk Rating\"},{\"optionID\":\"01\",\"optionDescription\":\"0 – 100\",\"optionRisk\":\"Low\",\"optionScore\":\"0\"},{\"optionID\":\"02\",\"optionDescription\":\"101 – 250\",\"optionRisk\":\"Medium\",\"optionScore\":\"1\"},{\"optionID\":\"03\",\"optionDescription\":\"> 250\",\"optionRisk\":\"High\",\"optionScore\":\"3\"}]},{\"OID\":\"14\",\"descripion\":\"Expected Amount of Monthly Cash Transactions:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Amount of Cash Transaction in Current A/C (Tk. Lacs)\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Risk Rating\"},{\"optionID\":\"01\",\"optionDescription\":\"0 – 10\",\"optionRisk\":\"Low\",\"optionScore\":\"0\"},{\"optionID\":\"02\",\"optionDescription\":\"10 – 25\",\"optionRisk\":\"Medium\",\"optionScore\":\"1\"},{\"optionID\":\"03\",\"optionDescription\":\"> 25\",\"optionRisk\":\"High\",\"optionScore\":\"3\"}]},{\"OID\":\"15\",\"descripion\":\"Expected Number of Monthly Cash Transactions:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Number of Cash Transaction in Current A/C\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Risk Rating\"},{\"optionID\":\"01\",\"optionDescription\":\"0 – 15\",\"optionRisk\":\"Low\",\"optionScore\":\"0\"},{\"optionID\":\"02\",\"optionDescription\":\"16 – 30\",\"optionRisk\":\"Medium\",\"optionScore\":\"1\"},{\"optionID\":\"03\",\"optionDescription\":\"> 30\",\"optionRisk\":\"High\",\"optionScore\":\"3\"}]},{\"OID\":\"17\",\"descripion\":\"Has the address(es) of the Account holder been verified?\",\"optionList\":[{\"optionID\":\"01\",\"optionDescription\":\"Yes, as in Photo ID Document\"},{\"optionID\":\"02\",\"optionDescription\":\"Yes, Utility Bill\"},{\"optionID\":\"03\",\"optionDescription\":\"Yes, Rental Agreement\"},{\"optionID\":\"04\",\"optionDescription\":\"Yes, BTCL Telephone Bill\"},{\"optionID\":\"05\",\"optionDescription\":\"Yes, By Bank Official\"},{\"optionID\":\"06\",\"optionDescription\":\"Other\"},{\"optionID\":\"07\",\"optionDescription\":\"No\"}]},{\"OID\":\"18\",\"description\":\"Politically Exposed Persons (PEPs):\",\"optionList\":[{\"optionID\":\"01\",\"optionDescription\":\"No\"},{\"optionID\":\"02\",\"optionDescription\":\"Obtained Approval from Senior Management? Yes\"},{\"optionID\":\"03\",\"optionDescription\":\"Obtained Approval from Senior Management? No\"},{\"optionID\":\"04\",\"optionDescription\":\"Sources of Fund\"},{\"optionID\":\"05\",\"optionDescription\":\"Face to Face Interview with the Customer? Yes\"},{\"optionID\":\"06\",\"optionDescription\":\"Face to Face Interview with the Customer? No\"}]}]";
    public static String KYC_MASTER_DATA_JSON_SAVINGS = "[{\"OID\":\"01\",\"description\":\"Account Name:\"},{\"OID\":\"02\",\"description\":\"Account Type:\"},{\"OID\":\"03\",\"description\":\"Account or Reference No.:\"},{\"OID\":\"04\",\"description\":\"Name of Officer Opening the Account:\"},{\"OID\":\"05\",\"description\":\"Nature of Business and Sources of Fund:\"},{\"OID\":\"06\",\"description\":\"Describe how the source of fund has been verified, and confirmation of whether or not the amount of transaction is commensurate with the nature of business described when the relationship was established:\"},{\"OID\":\"07\",\"description\":\"Who is the Beneficial Owner of the account (Detailed information of the shareholder controlling the company and the single shareholder holding 20% or more share):\"},{\"OID\":\"08\",\"description\":\"Voter ID Card No.:\"},{\"OID\":\"08.1\",\"description\":\"Photocopy Obtained?\"},{\"OID\":\"09\",\"descripion\":\"What does the Customer do/In what type of business is the customer engaged:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Category\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Score\"},{\"optionID\":\"01\",\"optionDescription\":\"Jewelry/Gems Trade\",\"optionRisk\":\"High\",\"optionScore\":\"5\"},{\"optionID\":\"02\",\"optionDescription\":\"Money Changer/Courier Service Agent\",\"optionRisk\":\"High\",\"optionScore\":\"5\"},{\"optionID\":\"03\",\"optionDescription\":\"Real Estate Agent\",\"optionRisk\":\"High\",\"optionScore\":\"5\"},{\"optionID\":\"04\",\"optionDescription\":\"Promoter of Construction Project\",\"optionRisk\":\"High\",\"optionScore\":\"5\"}]},{\"OID\":\"10\",\"descripion\":\"What is the Net Worth/Sales Turnover of the Customer:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Amount (Tk.)\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Risk Rating\"},{\"optionID\":\"01\",\"optionDescription\":\"0 – 50 Lacs\",\"optionRisk\":\"Low\",\"optionScore\":\"0\"},{\"optionID\":\"02\",\"optionDescription\":\"50 Lacs – 2 Crore\",\"optionRisk\":\"Medium\",\"optionScore\":\"1\"},{\"optionID\":\"03\",\"optionDescription\":\"> 2 Crore\",\"optionRisk\":\"High\",\"optionScore\":\"3\"}]},{\"OID\":\"11\",\"descripion\":\"What does the Customer do/In what type of business is the customer engaged:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Type\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Risk Rating\"},{\"optionID\":\"01\",\"optionDescription\":\"By the Relationship Manager/Branch\",\"optionRisk\":\"Low\",\"optionScore\":\"0\"},{\"optionID\":\"02\",\"optionDescription\":\"By Direct Sales Agent\",\"optionRisk\":\"Medium\",\"optionScore\":\"1\"},{\"optionID\":\"03\",\"optionDescription\":\"Internet\",\"optionRisk\":\"High\",\"optionScore\":\"3\"},{\"optionID\":\"04\",\"optionDescription\":\"Walk-in/Unsolicited\",\"optionRisk\":\"High\",\"optionScore\":\"3\"}]},{\"OID\":\"12\",\"descripion\":\"Expected Amount of Monthly Total Transactions:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Amount of Total Transaction in Current A/C (Tk. Lacs)\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Risk Rating\"},{\"optionID\":\"01\",\"optionDescription\":\"0 – 10\",\"optionRisk\":\"Low\",\"optionScore\":\"0\"},{\"optionID\":\"02\",\"optionDescription\":\"10 – 50\",\"optionRisk\":\"Medium\",\"optionScore\":\"1\"},{\"optionID\":\"03\",\"optionDescription\":\"> 50\",\"optionRisk\":\"High\",\"optionScore\":\"3\"}]},{\"OID\":\"13\",\"descripion\":\"Expected Number of Monthly Total Transactions:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Number of Total Transaction in Current A/C\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Risk Rating\"},{\"optionID\":\"01\",\"optionDescription\":\"0 – 100\",\"optionRisk\":\"Low\",\"optionScore\":\"0\"},{\"optionID\":\"02\",\"optionDescription\":\"101 – 250\",\"optionRisk\":\"Medium\",\"optionScore\":\"1\"},{\"optionID\":\"03\",\"optionDescription\":\"> 250\",\"optionRisk\":\"High\",\"optionScore\":\"3\"}]},{\"OID\":\"14\",\"descripion\":\"Expected Amount of Monthly Cash Transactions:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Amount of Cash Transaction in Current A/C (Tk. Lacs)\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Risk Rating\"},{\"optionID\":\"01\",\"optionDescription\":\"0 – 10\",\"optionRisk\":\"Low\",\"optionScore\":\"0\"},{\"optionID\":\"02\",\"optionDescription\":\"10 – 25\",\"optionRisk\":\"Medium\",\"optionScore\":\"1\"},{\"optionID\":\"03\",\"optionDescription\":\"> 25\",\"optionRisk\":\"High\",\"optionScore\":\"3\"}]},{\"OID\":\"15\",\"descripion\":\"Expected Number of Monthly Cash Transactions:\",\"optionList\":[{\"optionID\":\"00\",\"optionDescription\":\"Number of Cash Transaction in Current A/C\",\"optionRisk\":\"Risk Level\",\"optionScore\":\"Risk Rating\"},{\"optionID\":\"01\",\"optionDescription\":\"0 – 15\",\"optionRisk\":\"Low\",\"optionScore\":\"0\"},{\"optionID\":\"02\",\"optionDescription\":\"16 – 30\",\"optionRisk\":\"Medium\",\"optionScore\":\"1\"},{\"optionID\":\"03\",\"optionDescription\":\"> 30\",\"optionRisk\":\"High\",\"optionScore\":\"3\"}]},{\"OID\":\"17\",\"descripion\":\"Has the address(es) of the Account holder been verified?\",\"optionList\":[{\"optionID\":\"01\",\"optionDescription\":\"Yes, as in Photo ID Document\"},{\"optionID\":\"02\",\"optionDescription\":\"Yes, Utility Bill\"},{\"optionID\":\"03\",\"optionDescription\":\"Yes, Rental Agreement\"},{\"optionID\":\"04\",\"optionDescription\":\"Yes, BTCL Telephone Bill\"},{\"optionID\":\"05\",\"optionDescription\":\"Yes, By Bank Official\"},{\"optionID\":\"06\",\"optionDescription\":\"Other\"},{\"optionID\":\"07\",\"optionDescription\":\"No\"}]},{\"OID\":\"18\",\"description\":\"Politically Exposed Persons (PEPs):\",\"optionList\":[{\"optionID\":\"01\",\"optionDescription\":\"No\"},{\"optionID\":\"02\",\"optionDescription\":\"Obtained Approval from Senior Management? Yes\"},{\"optionID\":\"03\",\"optionDescription\":\"Obtained Approval from Senior Management? No\"},{\"optionID\":\"04\",\"optionDescription\":\"Sources of Fund\"},{\"optionID\":\"05\",\"optionDescription\":\"Face to Face Interview with the Customer? Yes\"},{\"optionID\":\"06\",\"optionDescription\":\"Face to Face Interview with the Customer? No\"}]}]";
    public static final String MAX_INITIAL_DEPOSIT_CAO = "CAO.Max.Initial.Deposit";

    public static final String RESPONSE_CODE_500 = "500";
    public static final String RESPONSE_CODE_501 = "501";
    public static final String RESPONSE_CODE_502 = "502";
    public static final String RESPONSE_CODE_503 = "503";
    public static final String RESPONSE_CODE_512 = "512";
    public static final String RESPONSE_CODE_513 = "513";
    public static final String RESPONSE_CODE_510 = "510";
    public static final String RESPONSE_CODE_514 = "514";
    public static final String RESPONSE_CODE_515 = "515";
    public static final String RESPONSE_CODE_102 = "102";
    public static final String RESPONSE_CODE_516 = "516";
    public static final String RESPONSE_CODE_517 = "517";
    public static final String RESPONSE_CODE_518 = "518";
    public static final String RESPONSE_CODE_519 = "519";
    public static final String RESPONSE_CODE_520 = "520";
    public static final String RESPONSE_CODE_521 = "521";
    public static final String RESPONSE_CODE_522 = "522";
    public static final String RESPONSE_CODE_523 = "523";
    public static final String RESPONSE_CODE_524 = "524";
    public static final String RESPONSE_CODE_525 = "525";
    public static final String RESPONSE_CODE_526 = "526";
    public static final String RESPONSE_CODE_527 = "527";
    public static final String RESPONSE_CODE_528 = "528";
    public static final String RESPONSE_CODE_529 = "529";
    public static final String RESPONSE_CODE_100 = "100";
    public static final String RESPONSE_CODE_103 = "103";
    public static final String RESPONSE_CODE_104 = "104";
    public static final String RESPONSE_CODE_105 = "105";
    public static final String RESPONSE_CODE_400 = "400";

}
