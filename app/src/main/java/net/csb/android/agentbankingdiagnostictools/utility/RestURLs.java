package net.csb.android.agentbankingdiagnostictools.utility;


import android.util.Log;

public class RestURLs {


    public static String AGENT_LOGIN = "agentLogin";


    public static String TRANSACTION_TYPE_CHECK_SELF_DEPOSIT = "";
    public static String TRANSACTION_TYPE_CHECK_BEARER_DEPOSIT = "";
    public static String TRANSACTION_TYPE_CHECK_CASH_WITHDRAW = "";
    public static String TRANSACTION_TYPE_CHECK_FUND_TRANSFER = "";
    public static String TRANSACTION_TYPE_CHECK_BALANCE_INQUIRY = "";
    public static String TRANSACTION_TYPE_CHECK_MINI_STATEMENT = "";


    public static String CHECK_TRANSACTION_TYPE_CHECK_SELF_DEPOSIT = "CheckSelfDeposit";
    public static String CHECK_TRANSACTION_TYPE_CHECK_BEARER_DEPOSIT = "CheckBearerDeposit";
    public static String CHECK_TRANSACTION_TYPE_CHECK_CASH_WITHDRAW = "CheckWithdrawal";
    public static String CHECK_TRANSACTION_TYPE_CHECK_FUND_TRANSFER = "CheckTransfer";
    public static String CHECK_TRANSACTION_TYPE_CHECK_BALANCE_INQUIRY = "CheckBalanceInquiry";
    public static String CHECK_TRANSACTION_TYPE_CHECK_MINI_STATEMENT = "CheckMiniStatement";


    public static String CUSTOMER_ACCOUNT_CREATE__PERSONAL_REQUEST_CAO = "";

    public static String TRANSACTION_TYPE_WITHDRAWAL = "Withdrawal";
    public static String TRANSACTION_TYPE_SELF_DEPOSIT = "SelfDeposit";
    public static String TRANSACTION_TYPE_BEARER_DEPOSIT = "BearerDeposit";
    public static String TRANSACTION_TYPE_BALANCEINQUIRY = "BalanceInquiry";
    public static String TRANSACTION_TYPE_AGENT_BALANCEINQUIRY = "AgentBalanceInquiry";
    public static String TRANSACTION_TYPE_MINISTATEMENT = "MiniStatement";
    public static String TRANSACTION_TYPE_ACCOUNTSTATEMENT = "AccountStatement";
    public static String TRANSACTION_TYPE_CUSTOMER_FUNDTRANSFER = "Transfer";
    public static String TRANSACTION_TYPE_AGENT_CREATEDEPOSIT = "CreateAgentDeposit";
    public static String TRANSACTION_TYPE_ACK_REQUEST = "ackRequest";
    public static String TRANSACTION_TYPE_REVERSE_REQUEST = "reverseRequest";
    public static String TRANSACTION_TYPE_RECIEVE_CHEQUE = "ReceiveCheque";
    public static String TRANSACTION_TYPE_BANK_RECEIVE = "BankReceive";
    public static String TRANSACTION_TYPE_IFR_REQUEST = "IfrSave";
    public static String TRANSACTION_TYPE_IFR_CHECK_FP = "IfrCheckFP";
    public static String TRANSACTION_TYPE_IFR_WITHDRAWAL = "IfrWithdrawal";
    public static String TRANSACTION_TYPE_SCHEME_ENCASHMENT_SUMMARY = "EncashmentSummary";
    public static String TRANSACTION_TYPE_SCHEME_ACCOUNT_SUMMARY = "AccountSummary";
    public static String TRANSACTION_TYPE_SCHEME_DEPOSIT = "SelfDeposit";

    public static String URL_UPDATE = "app_update/Celloscope.apk";
    public static String URL_LOGIN = "agent/" + AGENT_LOGIN;
    public static String URL_NEW_ACCOUNT = "accounts/new";
    public static String AGENT_CHANGEPASSWORD = "changePassword";
    public static String GET_CUSTOMER_INFO_URL = "";
    public static String ACCOUNT_RETRIEVAL_URL = "";

    public static String CUSTOMEACCOUNTRENQUIRY_REQUEST = "accounts/customerAccountEnquiry";

    public static String URL_TRASACTION_SELF_DEPOSIT = "";
    public static String URL_TRASACTION_BEARER_DEPOSIT = "";
    public static String URL_TRASACTION_WITHDRAW = "";
    public static String URL_TRASACTION_CUSTOMER_FUND_TRANSFER = "";
    public static String URL_TRASACTION_BALANCE_INQUIRY = "";
    public static String URL_TRASACTION_MINI_STATEMENT = "";
    public static String URL_ACTIVATE_ACCOUNT = "";
    public static String URL_AGENT_BALANCE_INQUIRY = "";
    public static String URL_ACK_REQUEST = "";
    public static String URL_BILL_ACK_REQUEST = "bill/" + TRANSACTION_TYPE_ACK_REQUEST;
    public static String URL__IFR_ACK_REQUEST = "ifr/" + TRANSACTION_TYPE_ACK_REQUEST;
    public static String URL_CHECK_RECEIVE = "chequecollection/" + TRANSACTION_TYPE_RECIEVE_CHEQUE;
    public static String URL_BANK_RECEIVE = "chequecollection/" + TRANSACTION_TYPE_BANK_RECEIVE;
    public static String URL_BILL_COLLECTION_REQUEST = "ablbill/" + "BillDeposit";
    public static String URL_CHECK_BILL_COLLECTION_REQUEST = "ablbill/" + "CheckBillDeposit";
    public static String URL_IFR_REQUEST = "ablifr/" + TRANSACTION_TYPE_IFR_REQUEST;

    public static String URL_IFR_CHECK_FP = "ablifr/" + TRANSACTION_TYPE_IFR_CHECK_FP;

    public static String URL_IFR_WITHDRAWAL = "ablifr/" + TRANSACTION_TYPE_IFR_WITHDRAWAL;
    public static String URL_SCHEME_ENCASHMENT_SUMMARY = "";
    public static String URL_SCHEME_ACCOUNT_SUMMARY = "";
    public static String URL_SCHEME_DEPOSIT = "";
    public static String CUSTOMERENQUIRY_INDIVIDUALPRIVATE_REQUEST = "customer/"
            + Constants.CUSTOMERENQUIRY_IDIVIDUALPRIVATE_REQUEST;

    public static String CUSTOMERENQUIRY_SCHEME_INFORMATION_REQUEST = "customer/"
            + Constants.CUSTOMER_ACCOUNT_ENQUIRY;
    public static String CREATE_INDIVIDUAL_PRIVATE_REQUEST = "customer/"
            + Constants.CUSTOMERCREATE__IDIVIDUALPRIVATE_REQUEST;

    public static String CREATE_ACCOUNT_CREATE_INDIVIDUALPRIVATE_REQUEST = "customer/"
            + Constants.CUSTOMER_ACCOUNT_CREATE__IDIVIDUALPRIVATE_REQUEST;
    public static String CUSTOMERENQUIRY_ORGANIZATIONALPRIVATE_REQUEST = "customer/"
            + Constants.CUSTOMERENQUIRY_ORGANIZATIONALPRIVATE_REQUEST;

    public static String CUSTOMER_ENROLLCBSCUSTOMERANDACCOUNT_REQUEST = "customer/"
            + "enrollIndividualPrivateCustomerAndAccount";
    public static String CUSTOMER_ENROLLCBSACCOUNT_REQUEST = "customer/" + "enrollIndividualPrivateAccount";

    public static String ABDSYSMAKER_LOGIN = "ABDSysMakerLogin";
    public static String DST_LOGIN = "DSTLogin";
    public static String FIND_DST = "findDST";
    public static String FIND_AGENT = "findAgent";
    public static String FIND_AGENTSTAFF = "findAgentStaff";

    public static String URL_AGENT_FPENROLL = "agent/agentFPEnroll";
    public static String URL_AGENT_STAFF_FPENROLL = "agent/agentFPEnroll";
    public static String URL_DST_FPENROLL = "agent/agentFPEnroll";

    public static String AGENT_FPENROLL = "agentFPEnroll";
    public static String AGENT_STAFF_FPENROLL = "agentFPEnroll";
    public static String DST_FPENROLL = "agentFPEnroll";

    public static String CUSTOMER_ACCOUNT_CREATE__PERSONAL_REQUEST = "";
    public static String CUSTOMER_ACCOUNT_APPROVE__PERSONAL_REQUEST_DST = "";
    public static String CUSTOMER_ACCOUNT_APPROVE__PERSONAL_REQUEST_ABD = "";
    public static String CUSTOMER_ACCOUNT_LIST_REQUEST_DST = "";
    public static String CUSTOMER_ACCOUNT_DETAIL_REQUEST = "";

    public static String REQUEST_CUSTOMER_ACCOUNT_CREATE__PERSONAL_REQUEST_CAO = "";


    public static String URL_APPROVAL_ACCOUNT_FOR_DST = "";
    public static String URL_DST_APPROVED_ACCOUNT_REQUEST = "";
    public static String URL_CBL_CUSTOMER_ACCOUNT_LIST_REQUEST_DST = "";
    public static String URL_CBL_CUSTOMER_ACCOUNT_DETAIL_REQUEST = "";
    public static String REQUEST_CUSTOMER_ACCOUNT_CREATE__PERSONAL_REQUEST = "";
    public static String CUSTOMER_AND_ACCOUNT_ENQUIRY_FOR_ENROLLMENT = "";


    public static void URLINIT(String BankName) {


        URL_TRASACTION_SELF_DEPOSIT = BankName + "banking/" + TRANSACTION_TYPE_SELF_DEPOSIT;

        URL_TRASACTION_BEARER_DEPOSIT = BankName + "banking/" + TRANSACTION_TYPE_BEARER_DEPOSIT;
        URL_TRASACTION_WITHDRAW = BankName + "banking/" + TRANSACTION_TYPE_WITHDRAWAL;
        URL_TRASACTION_CUSTOMER_FUND_TRANSFER = BankName + "banking/"
                + TRANSACTION_TYPE_CUSTOMER_FUNDTRANSFER;
        URL_TRASACTION_BALANCE_INQUIRY = BankName + "banking/" + TRANSACTION_TYPE_BALANCEINQUIRY;
        URL_TRASACTION_MINI_STATEMENT = BankName + "banking/" + TRANSACTION_TYPE_MINISTATEMENT;

        URL_AGENT_BALANCE_INQUIRY = BankName + "banking/" + "AgentBalanceInquiry";
        URL_ACK_REQUEST = BankName + "banking/" + TRANSACTION_TYPE_ACK_REQUEST;
        URL_SCHEME_ENCASHMENT_SUMMARY = BankName + "banking/" + TRANSACTION_TYPE_SCHEME_ENCASHMENT_SUMMARY;
        URL_SCHEME_ACCOUNT_SUMMARY = BankName + "banking/" + TRANSACTION_TYPE_SCHEME_ACCOUNT_SUMMARY;
        URL_SCHEME_DEPOSIT = BankName + "banking/" + TRANSACTION_TYPE_SCHEME_DEPOSIT;

        /*_______________________________________________________________________________________*/

        TRANSACTION_TYPE_CHECK_SELF_DEPOSIT = BankName + "banking/" + "CheckSelfDeposit";
        TRANSACTION_TYPE_CHECK_BEARER_DEPOSIT = BankName + "banking/" + "CheckBearerDeposit";
        TRANSACTION_TYPE_CHECK_CASH_WITHDRAW = BankName + "banking/" + "CheckWithdrawal";
        TRANSACTION_TYPE_CHECK_FUND_TRANSFER = BankName + "banking/" + "CheckTransfer";
        TRANSACTION_TYPE_CHECK_BALANCE_INQUIRY = BankName + "banking/" + "CheckBalanceInquiry";
        TRANSACTION_TYPE_CHECK_MINI_STATEMENT = BankName + "banking/" + "CheckMiniStatement";

        /*_______________________________________________________________________________________*/
        REQUEST_CUSTOMER_ACCOUNT_CREATE__PERSONAL_REQUEST = "Create" + BankName.toUpperCase() + "IndividualPrivateCustomerAndAccount";
        REQUEST_CUSTOMER_ACCOUNT_CREATE__PERSONAL_REQUEST_CAO = "Create" + BankName.toUpperCase() + "IndividualPrivateCustomerAndAccountByCAO";

        CUSTOMER_ACCOUNT_CREATE__PERSONAL_REQUEST = BankName + "customer/" + "Create" + BankName.toUpperCase() + "IndividualPrivateCustomerAndAccount";
        CUSTOMER_ACCOUNT_CREATE__PERSONAL_REQUEST_CAO = BankName + "customer/" + "Create" + BankName.toUpperCase() + "IndividualPrivateCustomerAndAccountByCAO";

        /*_______________________________________________________________________________________*/


        CUSTOMER_ACCOUNT_APPROVE__PERSONAL_REQUEST_DST = "Approve" + BankName.toUpperCase() + "PersonalCustomerAndAccountByABD";
        CUSTOMER_ACCOUNT_LIST_REQUEST_DST = BankName.toUpperCase() + "CustomerAccountListForDST";
        CUSTOMER_ACCOUNT_DETAIL_REQUEST = BankName.toUpperCase() + "CustomerAccountDetail";
        /*_________________________________________________________________________________________*/



        /**/


        ACCOUNT_RETRIEVAL_URL = BankName + "customer/" + BankName.toUpperCase() + "CustomerAccountDetail";

        URL_ACTIVATE_ACCOUNT = BankName + "customer/" + "Activate" + BankName.toUpperCase() + "CustomerAndAccount";

        showLogs();

    }

    private static void showLogs() {

        Log.d("TAG", "showLogs: " + URL_TRASACTION_SELF_DEPOSIT + " " + URL_TRASACTION_BEARER_DEPOSIT + " " + URL_TRASACTION_WITHDRAW + " " + URL_TRASACTION_CUSTOMER_FUND_TRANSFER + " " + URL_TRASACTION_CUSTOMER_FUND_TRANSFER + " " + URL_TRASACTION_BALANCE_INQUIRY + " " + URL_TRASACTION_MINI_STATEMENT + " " + URL_AGENT_BALANCE_INQUIRY + " " + TRANSACTION_TYPE_CHECK_SELF_DEPOSIT + " " + TRANSACTION_TYPE_CHECK_BEARER_DEPOSIT + " " + TRANSACTION_TYPE_CHECK_CASH_WITHDRAW + " " + TRANSACTION_TYPE_CHECK_FUND_TRANSFER + " " + TRANSACTION_TYPE_CHECK_BALANCE_INQUIRY + " " + TRANSACTION_TYPE_CHECK_MINI_STATEMENT + " " + CUSTOMER_ACCOUNT_CREATE__PERSONAL_REQUEST + " " + CUSTOMER_ACCOUNT_APPROVE__PERSONAL_REQUEST_DST + " " + CUSTOMER_ACCOUNT_LIST_REQUEST_DST + " " + CUSTOMER_ACCOUNT_DETAIL_REQUEST + " " + ACCOUNT_RETRIEVAL_URL + " " + URL_ACTIVATE_ACCOUNT);

    }

}


