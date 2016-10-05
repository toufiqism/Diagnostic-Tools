package net.csb.android.agentbankingdiagnostictools.utility;

public class WorkflowJSONConstants {

	public final static String WORKFLOW_JSON_FILE_NAME = "workflow.json";
	public final static String WORKFLOW_ID = "workFlowID";
	public final static String CELLOSCOPE = "celloscope";
	public final static String ACTIVITY_NAME = "activityName";
	public final static String BACK_ACTIVITY = "backActivity";
	public final static String BACK_ACTIVITY_SEQ_ID = "backActivitySeqID";

	public final static String CANCEL_ACTIVITY = "cancelActivity";
	public final static String CANCEL_ACTIVITY_SEQ_ID = "cancelActivitySeqID";

	public final static String ACTIVITY_TITLE_1 = "activityTitle1";
	public final static String ACTIVITY_TITLE_2 = "activityTitle2";
	public final static String WORKFLOW_BUTTONS = "workFlowButtons";
	public final static String BUTTON_ID = "buttonID";
	public final static String BUTTON_ACTIVITY = "buttonActivity";
	public final static String BUTTON_SEQ_ID = "buttonSeqID";
	public final static String ACTIVITY_VIEW_TYPE = "activityViewType";
	public final static String NETWORK_ACTIVITY_TYPE = "networkActivityType";
	public final static String CRITERIA_SEARCH_TYPE = "criteriaSearchType";
	public final static String WORKFLOW_RESULTS = "workFlowResults";
	public final static String RESULT_ID = "resultID";
	public final static String RESULT_ACTIVITY = "resultActivity";
	public final static String RESULT_SEQ_ID = "resultSeqID";

	public final static String ACTIVITY_VIEW_TYPE_CBS_SEARCH = "SearchCriteriaCBS_CBSSearch";
	public final static String ACTIVITY_VIEW_TYPE_CSB_SEARCH = "CSBSearch";
	public final static String CRITERIA_SEARCH_TYPE_INDIVIDUAL = "individual";
	public final static String CRITERIA_SEARCH_TYPE_ORG = "organization";
	public final static String NETWORK_ACTIVITY_TYPE_NEW_ACCOUNT_CUSTOMER_SEARCH = "Network.newAccountCustomerSearch";
	public final static String NETWORK_ACTIVITY_TYPE_NEW_ORG_CUSTOMER_SEARCH = "Network.newOrganizationCustomerSearch";
	public final static String NETWORK_ACTIVITY_TYPE_EXISTING_ACCOUNT_CUSTOMER_SEARCH = "Network.existingAccountCustomerSearch";
	public final static String NETWORK_ACTIVITY_TYPE_CUSTOMER_SEARCH_FOR_ENROLLMENT_BYIDS = "Network.CustomerSearchForEnrollmentByIDs";
	public final static String NETWORK_ACTIVITY_TYPE_CHECK_BILL_COLLECTION = "Network.CheckBillCollectionRequest";

	public final static String NETWORK_ACTIVITY_TYPE_EXISTING_CUSTOMER_SEARCH_FOR_ENROLL_BY_ACCINFO = "Network.ExistingCustomerSearchForEnrollmentByAccountInfo";
	public final static String NETWORK_ACTIVITY_TYPE_CUSTOMER_ENQUIRY_FOR_SCHEME_DETAIL_INFORMATION = "Network.SchemeInformationDetail";
	public final static String NETWORK_ACTIVITY_TYPE_DST_CUSTOMER_APPROVAL_LIST="Network.DSTCustomerApprovalList";
	public final static String NETWORK_ACTIVITY_TYPE_NEW_ACC_OPENING = "Network.newAccountOpening";
	public final static String NETWORK_ACTIVITY_TYPE_DEPOSIT = "Network.Deposit";
	public final static String NETWORK_ACTIVITY_TYPE_WITHDRAW = "Network.Withdraw";
	public final static String NETWORK_ACTIVITY_TYPE_BALANCE_INQUIRY = "Network.BalanceInquiry";
	public final static String NETWORK_ACTIVITY_TYPE_MINI_STATEMENT = "Network.MiniStatement";
	public final static String NETWORK_ACTIVITY_TYPE_FUND_TRANSFER = "Network.FundTransfer";
	public final static String NETWORK_ACTIVITY_TYPE_ACCTIVATE_ACCOUNT = "Network.ActivateAccount";
	public final static String NETWORK_ACTIVITY_TYPE_CHANGE_PASSWORD = "Network.ChangePassword";
	public final static String NETWORK_ACTIVITY_TYPE_AGENT_BALANCE_INQUIRY = "Network.AgentBalanceInquiry";
	public final static String NETWORK_ACTIVITY_TYPE_BILL_COLLECTION_REQUEST = "Network.BillCollectionRequest";
	public final static String NETWORK_ACTIVITY_TYPE_IFR_REQUEST = "Network.IFRRequest";
	public final static String NETWORK_ACTIVITY_TYPE_IFR_SEARCH_BY_PIN = "Network.IFRRequestSearchByPIN";
	public final static String NETWORK_ACTIVITY_TYPE_IFR_WITHDRAWAL = "Network.IFRWithdrawal";
	public final static String NETWORK_ACTIVITY_TYPE_RECEIVE_CHEQUE = "Network.ReceiveChequeRequest";
	public final static String NETWORK_ACTIVITY_TYPE_BANK_RECEIVE_CHEQUE = "Network.BankReceiveChequeRequest";
	public final static String NETWORK_ACTIVITY_TYPE_SCHEME_ENCASHMENT_SUMMARY = "Network.SchemeEncashmentSummary";
	public final static String NETWORK_ACTIVITY_TYPE_SCHEME_ACCOUNT_SUMMARY = "Network.SchemeAccountSummary";
	public final static String NETWORK_ACTIVITY_TYPE_CUSTOMER_ENROLLCBSCUSTOMERANDACCOUNT_REQUEST = "Network.EnrollIndividualPrivateCustomerAndAccount";
	public final static String NETWORK_ACTIVITY_TYPE_CUSTOMER_ENROLLCBSACCOUNT_REQUEST = "Network.EnrollIndividualPrivateAccount";
	public final static String NETWORK_ACTIVITY_TYPE_SCHEME_DEPOSIT="Network.SchemeDeposit";
	public final static String NETWORK_ACTIVITY_TYPE_CHECK_TRANSACTION_INFO="Network.CheckTransactionInfo";
	public final static String NETWORK_ACTIVITY_TYPE_ACK_NEW_ACCOUNT = "Network.AckNewAccount";
	public final static String NETWORK_ACTIVITY_TYPE_ACK_DEPOSIT = "Network.AckDeposit";
	public final static String NETWORK_ACTIVITY_TYPE_ACK_WITHDRAW = "Network.AckWithdrawal";
	public final static String NETWORK_ACTIVITY_TYPE_ACK_FUND_TRANSFER = "Network.AckFundTransfer";
	public final static String NETWORK_ACTIVITY_TYPE_ACK_BALANCE_INQUIRY = "Network.AckBalanceInquiry";
	public final static String NETWORK_ACTIVITY_TYPE_ACK_MINI_STATEMENT = "Network.AckMiniStatement";
	public final static String NETWORK_ACTIVITY_TYPE_ACK_ACTIVATE_ACCOUNT = "Network.AckActivateAccount";
	public final static String NETWORK_ACTIVITY_TYPE_ACK_AGENT_BALANCE_INQUIRY = "Network.AckAgentBalanceInquiry";
	public final static String NETWORK_ACTIVITY_TYPE_ACK_BILL_COLLECTION_REQUEST = "Network.AckBillCollectionRequest";
	public final static String NETWORK_ACTIVITY_TYPE_ACK_IFR_WITHDRAWAL = "Network.AckIFRWithdrawal";
	public final static String NETWORK_ACTIVITY_TYPE_NACK_IFR_WITHDRAWAL = "Network.NAckIFRWithdrawal";
	public final static String NETWORK_ACTIVITY_TYPE_NACK_NEW_ACCOUNT = "Network.NAckNewAccount";
	public final static String NETWORK_ACTIVITY_TYPE_NACK_DEPOSIT = "Network.NAckDeposit";
	public final static String NETWORK_ACTIVITY_TYPE_NACK_WITHDRAW = "Network.NAckWithdrawal";
	public final static String NETWORK_ACTIVITY_TYPE_NACK_FUND_TRANSFER = "Network.NAckFundTransfer";
	public final static String NETWORK_ACTIVITY_TYPE_NACK_BALANCE_INQUIRY = "Network.NAckBalanceInquiry";
	public final static String NETWORK_ACTIVITY_TYPE_NACK_MINI_STATEMENT = "Network.NAckMiniStatement";
	public final static String NETWORK_ACTIVITY_TYPE_NACK_ACTIVATE_ACCOUNT = "Network.NAckActivateAccount";
	public final static String NETWORK_ACTIVITY_TYPE_NACK_AGENT_BALANCE_INQUIRY = "Network.NAckAgentBalanceInquiry";
	public final static String NETWORK_ACTIVITY_TYPE_NACK_BILL_COLLECTION_REQUEST = "Network.NAckBillCollectionRequest";

}
