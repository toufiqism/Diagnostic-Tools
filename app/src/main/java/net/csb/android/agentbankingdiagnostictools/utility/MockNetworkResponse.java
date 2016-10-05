package net.csb.android.agentbankingdiagnostictools.utility;

/**
 * Created by arhabib on 1/6/16.
 */
public class MockNetworkResponse {

/*

    static GsonBuilder builder;
    static Gson gson;

    static MockNetworkResponse mockNetworkResponse;


    public static MockNetworkResponse getInstance() {
        builder = new GsonBuilder();

        builder.registerTypeAdapter(Date.class,
                new JsonDeserializer<Date>() {
                    public Date deserialize(JsonElement json,
                                            Type typeOfT,
                                            JsonDeserializationContext context)
                            throws JsonParseException {
                        return new Date(json.getAsJsonPrimitive()
                                .getAsLong());
                    }

                });

        gson = builder.create();

        if (mockNetworkResponse == null) {


            return new MockNetworkResponse();
        } else {

            return mockNetworkResponse;
        }


    }

    public MockNetworkResponse() {
        builder = new GsonBuilder();

        builder.registerTypeAdapter(Date.class,
                new JsonDeserializer<Date>() {
                    public Date deserialize(JsonElement json,
                                            Type typeOfT,
                                            JsonDeserializationContext context)
                            throws JsonParseException {
                        return new Date(json.getAsJsonPrimitive()
                                .getAsLong());
                    }

                });

        gson = builder.create();
    }

    public static String getAgentResult() {


        AgentStaff agentStaff = new AgentStaff();

        agentStaff.setAgentID("AG100002");

        agentStaff.setBankID("101");
        agentStaff.setBranchID("");
        agentStaff.setStatus("");

        DirectSalesTeam directSalesTeam = new DirectSalesTeam();

        directSalesTeam.setLoginID("");
        directSalesTeam.setStatus("");
        directSalesTeam.setBranchID("");
        directSalesTeam.setApproverID("");
        directSalesTeam.setBankID("");
        directSalesTeam.setCheckerID("");
        directSalesTeam.setEmail("");
        directSalesTeam.setMakerID("");
        directSalesTeam.setName("DST 1");
        directSalesTeam.setPhotoPath("");


        AgentResult agentResult = new AgentResult();
        agentResult.setRequestID("00000000000010011");
        agentResult.setAgentID("AG100001");
        agentResult.setAgentName("Badrul Alam");
        agentResult.setBankID("101");
        agentResult.setBankName("CityBank");
        agentResult.setBranchID("10001");
        agentResult.setBranchName("Dhanmondi Branch");
        agentResult.setAgentType("A");
        agentResult.setReset(false);
        agentResult.setAgentDefaultFP("lt");
*/
/*        agentResult.setAgentDefaultFPValue("464d520020323000000000c600000100019000c500c501000000181c40860004dc5740500023d85d808b0025585780b30027d84340a7003354578040003a744a4065004fc85d80390067c05d407d007cd057407f008ac457805c0091b85d809400b2c45740a200c7c44a80ac00c9dc43800a00e82843408b00ef1450806800f62050400c00f8a843409600fb944380630104a043404701062050406a010924574023010d204a807f011c144a4092011e0443406a01310443806801560043807a015680430000");*//*



//anis fp from econnect lt
        agentResult.setAgentDefaultFPValue("464d520020323000000000f2000000d0012000c500c5010000004822005900121b0000a100100f00001d00161600007200221500008a00249300009d00321b0000b7003413000076003f1300009600510900000f0053110000be006907000098007bfb00003100850c00009a008ff500009300a77800007600aafb00001300af1600001100b79800006600caf600008e00cff10000be00d0ee00004c00d38900008f00da7100003100e10e00007700df7a00009e00dfee0000a700eaec00003200f00900007a00eff30000ad00f36400005a00f48900004c00fb070000bc00fbe90000550105f800000600020006000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000");
        //rocky lt
        agentResult.setAgentDefaultFPValue("464d520020323000000001b600000100019000c500c5010000003344805e0017085d4050001e905d403b0023105d803b0033105d4021003a8c5740650041f85d80d40043e85d8028004f945d808f004f705d40bc004fec5d80470056945d80c3005bec5d40f2005b68434031006e9c5d407d0070f85d40dd0072645d40b300756c5740500077085780cd0079645780310085205d40df008ae45780570091044340a000a1d43c801f00a4a45d808800abcc43408f00abdc4a80a000b05c50402a00b2a45780ae00b2d84340c500b2dc5d409900bbcc5080f400c05843805c00c5ac4380e600c5d85d808400c7d83c407800cec443404700d02c43809200d05850802a00dea85080b000e3c45d80d100e8cc5d40ba00efc45d807600f4384380050106243c80d40106c45d40210110a05d80a9011738578065011ca850809b011eb45080cd0123bc5d8086012ea443807f0131a85740db0131c45d809b0133345740ac013cac5080cf013fac50407d0146285d40e20146d05d40c8014b345040650159205d8049015b205d4078015d985d40a00169205d80c50169205d80d4016e0457405c01721857408401721c5d80ca017504570000");

        //anis lt
        //  agentResult.setAgentDefaultFPValue("464d5200203230000000015c00000100019000c500c501000000343540a00004984a408b000b1c5780b7000b285740cf00171850408b00201c5d40ac002e145d40dd003c085d80f000438457402a00541c5d40ba00600c5d80c50075045d40600083185d40b3008a8c5780ae00980c5d404900a8185d40c800b2fc5d404b00b79c5d403100bea45d40a700c5085d403900c7205d408b00c7945d40be00cc845d40e900cef44a80be00de005d407a00e1145d80a500ea905d807300f1145d809900f6145d80a500fd045d805c0106a45d40df010de85d80420110245d80cd0117ec5d40c5011ce45d808f011e105d4050012a245d40a0012af85d406a01311c4a80920131f85d4059013cb4508092013ca04a406f013f2c57807a013f205d40a7013fd03c80a2014bbc3c40db014dcc5740b50154c04a40d40156c057806f0159285080ca015b485080920167a057807a0175945d806f018314570000");

        agentResult.setBankAccountNo("0101391000001");
        agentResult.setFPScanRetryValue(3);
        agentResult.setDeviceID("8C:73:6E:FA:F5:FF");
        agentResult.setStatus(RestParameters.STATUS_OK);
        agentResult.setFingerPrintEnrolmentOrder("{rt,lt,li,ri,lm,rm,lr,rr,lp,rp}");

        Product product = new Product();
        product.setProductID("391");
        product.setProductName("CASA");
        product.setStatus("A");
        product.setProductType("TA");

        ArrayList<ExchangeHouse> exchangeHouseArrayList = new ArrayList<>();


        ExchangeHouse exchangeHouse = new ExchangeHouse();

        exchangeHouse.setAccountJSON("Money Express");
        exchangeHouse.setGlAccountNo("14456456456");
        exchangeHouse.setExHouseID("EX-H_001");
        exchangeHouse.setExHouseName("Money Express");

        exchangeHouseArrayList.add(exchangeHouse);

        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(product);

        agentResult.setExchangeHouseList(exchangeHouseArrayList);
        agentResult.setProductList(productList);
        agentResult.setRole("AGENT.TELLER");
        agentResult.setBalance("10000000.50");
        agentResult.setAgentStaff(agentStaff);
        agentResult.setDirectSalesTeam(directSalesTeam);
        agentResult.setUtilityCompanyList(new ArrayList<UtilityCompany>());
        agentResult.setServerTimeStamp(new Date());
        agentResult.setServicePoint(new ServicePoint("SP0001", "Dhanmondi Point", "", "101", "1001", "", "A"));
        ServiceTerminal serviceTerminal = new ServiceTerminal();
        //agentResult.setRole(DomainConstants.ROLE_AGENT_CAO);
        serviceTerminal.setBiometricDeviceAddress("8C:73:6E:FA:F5:FF");
        agentResult.setServiceTerminal(serviceTerminal);

         agentResult.setRoleJSON("[{\"menuID\":\"NewAccountOpening\",\"menuText\":\"Open New Account\",\"active\":true},{\"menuID\":\"SearchCustomer\",\"menuText\":\"Search Customer\",\"active\":true},{\"menuID\":\"ServiceRequest\",\"menuText\":\"Service Request\",\"active\":true},{\"menuID\":\"IncompleteRequest\",\"menuText\":\"Incomplete Request\",\"active\":true},{\"menuID\":\"\",\"menuText\":\"Utility Bill Payment\",\"active\":true},{\"menuID\":\"CashDeposit\",\"menuText\":\"Cash Deposit\",\"active\":true},{\"menuID\":\"CashWithdraw\",\"menuText\":\"Cash Withdraw\",\"active\":true},{\"menuID\":\"CustomerFundTransfer\",\"menuText\":\"Fund Transfer\",\"active\":true},{\"menuID\":\"BalanceInquiry\",\"menuText\":\"Balance Inquiry\",\"active\":true},{\"menuID\":\"MiniStatement\",\"menuText\":\"Mini Statement\",\"active\":true},{\"menuID\":\"Remittance\",\"menuText\":\"Remittance\",\"active\":true},{\"menuID\":\"DPSAccountSummary\",\"menuText\":\"DPS Account Summary\",\"active\":true},{\"menuID\":\"DPSFDREncashmentSummary\",\"menuText\":\"DPS/FDR Encashmentment Summary\",\"active\":true},{\"menuID\":\"IFRWithdraw\",\"menuText\":\"Remittance Withdraw\",\"active\":true},{\"menuID\":\"AgentTools\",\"menuText\":\"Tools\",\"active\":true}]");
        //  agentResult.setRoleJSON("[{\"menuID\":\"DSTEnrollment\",\"menuText\":\"DST FP Enrollment\",\"active\":true}]");
        // agentResult.setRoleJSON("[{\"menuID\":\"AgentStaffEnrollment\",\"menuText\":\"Agent Staff FP Enrollment\",\"active\":true}]");
        //  agentResult.setRoleJSON("[{\"menuID\":\"AgentEnrollment\",\"menuText\":\"Agent FP Enrollment\",\"active\":true}]");
        //agentResult.setRoleJSON("[{\"menuID\":\"NewAccountOpening\",\"menuText\":\"Open New Account\",\"active\":true},{\"menuID\":\"SearchCustomer\",\"menuText\":\"Search Customer\",\"active\":false},{\"menuID\":\"ServiceRequest\",\"menuText\":\"Service Request\",\"active\":false},{\"menuID\":\"IncompleteRequest\",\"menuText\":\"Incomplete Request\",\"active\":false},{\"menuID\":\"\",\"menuText\":\"Utility Bill Payment\",\"active\":false},{\"menuID\":\"CashDeposit\",\"menuText\":\"Cash Deposit\",\"active\":false},{\"menuID\":\"CashWithdraw\",\"menuText\":\"Cash Withdraw\",\"active\":false},{\"menuID\":\"CustomerFundTransfer\",\"menuText\":\"Fund Transfer\",\"active\":false},{\"menuID\":\"BalanceInquiry\",\"menuText\":\"Balance Inquiry\",\"active\":false},{\"menuID\":\"MiniStatement\",\"menuText\":\"Mini Statement\",\"active\":false},{\"menuID\":\"Remittance\",\"menuText\":\"Remittance\",\"active\":false},{\"menuID\":\"DPSAccountSummary\",\"menuText\":\"DPS Account Summary\",\"active\":false},{\"menuID\":\"DPSFDREncashmentSummary\",\"menuText\":\"DPS/FDR Encashmentment Summary\",\"active\":false},{\"menuID\":\"IFRWithdraw\",\"menuText\":\"Remittance Withdraw\",\"active\":false},{\"menuID\":\"AgentTools\",\"menuText\":\"Tools\",\"active\":false}]");
        return gson.toJson(agentResult);


        //{"requestID":"7E:B6:46:65:82:26/7E:B6:46:65:82:26###20160116153100","status":"OK","agentID":"AG000023","agentName":"ashraful","agentType":"A","bankID":"101","bankName":"NRB Commercial Bank Ltd.","branchID":"0101","branchName":"Principal Branch","deviceID":null,"role":"[\"Agent\"]","roleJSON":"[{\"menuID\":\"NewAccountOpening\",\"menuText\":\"New Account Opening\",\"active\":true},{\"menuID\":\"OpenAdditionalAccount\",\"menuText\":\"Open Additional Account\",\"active\":true},{\"menuID\":\"SearchCustomer\",\"menuText\":\"Search Customer\",\"active\":true},{\"menuID\":\"ServiceRequest\",\"menuText\":\"Service Request\",\"active\":true},{\"menuID\":\"IncompleteRequest\",\"menuText\":\"Incomplete Request\",\"active\":true},{\"menuID\":\"UtilityBillPayment\",\"menuText\":\"Utility Bill Payment\",\"active\":true},{\"menuID\":\"\",\"menuText\":\"Utility Bill Payment\",\"active\":true},{\"menuID\":\"CashDeposit\",\"menuText\":\"Cash Deposit\",\"active\":true},{\"menuID\":\"CashWithdraw\",\"menuText\":\"Cash Withdraw\",\"active\":true},{\"menuID\":\"CustomerFundTransfer\",\"menuText\":\"Fund Transfer\",\"active\":true},{\"menuID\":\"BalanceInquiry\",\"menuText\":\"Balance Inquiry\",\"active\":true},{\"menuID\":\"MiniStatement\",\"menuText\":\"Mini Statement\",\"active\":true},{\"menuID\":\"Remittance\",\"menuText\":\"Remittance\",\"active\":true},{\"menuID\":\"DPSAccountSummary\",\"menuText\":\"DPS Account Summary\",\"active\":true},{\"menuID\":\"DPSFDREncashmentSummary\",\"menuText\":\"DPS/FDR Encashmentment Summary\",\"active\":true}]","reset":false,"serverTimeStamp":1452958261033,"message":"Agent Found.","productList":[{"productID":"391","productName":"SAVINGS BANK DEPOSIT ACCOUNT - Agent","productType":"Demand","productDefinition":null,"status":"A"},{"productID":"393","productName":"CURRENT DEPOSIT ACCOUNT - Agent","productType":"Demand","productDefinition":null,"status":"A"},{"productID":"396","productName":"SPECIAL NOTICE DEPOSIT (SND) ACCOUNT - Agent","productType":"Demand","productDefinition":null,"status":"A"}],"utilityCompanyList":[],"companyZoneMap":{},"servicePoint":{"servicePointID":"SP000023","servicePointName":"Feni- Point","servicePointType":"MasterAgent","bankID":"101","branchID":"0101","addressLine1":"Feni-3900","servicePointStatus":"BM","statusNote":null,"rejectionCause":null,"addressLine2":null,"city":null,"postalCode":null,"district":"145","division":"1","thana":"14513","telephone1":"0234578","telephone2":null,"emailAddress":null,"geoLocation":null,"photopath":null,"photographs":null,"applyDate":1447227731635,"openingDate":null,"makerID":null,"checkerID":null,"approverID":null,"changedBy":"Ampere"},"serviceTerminal":null,"ddlMetaDataList":{"customerType":{"name":"CustomerType","ddllist":[{"name":"Individual Private Customer","sortOrder":"0","id":"IndividualPrivateCustomer"},{"name":"Organization Govt. Customer","sortOrder":"1","id":"OrganizationGovtCustomer"},{"name":"Organization Private Customer","sortOrder":"2","id":"OrganizationPrivateCustomer"},{"name":"Organization Other Public Customer","sortOrder":"3","id":"OrganizationOtherPublicCustomer"}],"ddl_Type":"DDL-1"},"productType":null,"accountType":{"name":"AccountType","ddllist":[{"name":"Corporate","sortOrder":"0","id":"G"},{"name":"Customer","sortOrder":"1","id":"C"},{"name":"Joint","sortOrder":"2","id":"J"}],"ddl_Type":"DDL-16"},"accountCategory":{"name":"AccountCategory","ddllist":[{"name":"Demand Deposit","sortOrder":"0","id":"DD"},{"name":"Scheme Deposit","sortOrder":"1","id":"SD"},{"name":"Time Deposit","sortOrder":"2","id":"TD"}],"ddl_Type":"DDL-17"}},"assID":null,"agentStaffName":null,"agentDefaultFPValue":null,"agentDefaultFP":null,"csbAgentID":null,"csbServicePointID":null,"csbServiceTerminalIDs":null,"csbAgentServiceStaffIDs":null,"noDuplicateUserFound":null,"fingerPrintEnrolmentOrder":"rt,lt","fpscanRetryValue":3}

    }

    public static String getSampleFPData() {
        return "{\"lt\":\"464d5200203230000000014400000100019000c500c5010000002431406c000b845080840019785d805c002a045d4063002e9c50805000412c5080d400414c5d405e004bb84a4071004fe04a80ae004fcc5d80650059bc5040bc00594c5740db0059bc5d405c005d3850408f0062585d406f0064d05080490069405740ba0069445080760070d05040e90079345d40dd007c385d40500083485d809b0085005d40c100859c5d807a008ae05d80cd008a305d40b50091205780c30093305080b000987c57408400a1f05d406500b2e05d40b500b20857408f00b4f05d402800b9d450403600b9585d40e200b98c4a40e900b91c43404900c2dc5d402300ce544a40c300d3084a40c800d70843402600e35c3c404e00e6e05d40a500e6f457404900f6585740df00fb043c40d80109fc3c407f010d6457405c0115e45040840119f057\",\"rt\":\"NOT_SCANNED\",\"li\":\"NOT_SCANNED\",\"ri\":\"FINGER_NOT_PRESENT\",\"lm\":\"CANNOT_VERIFY\",\"rm\":\"NOT_SCANNED\",\"lr\":\"NOT_SCANNED\",\"rr\":\"NOT_SCANNED\",\"lp\":\"NOT_SCANNED\",\"rp\":\"NOT_SCANNED\",\"defaultFP\":\"lt\"}";

    }


    public static String getTransactionResultForInfo() {

        TransactionResultForInfo transactionResultForInfo = new TransactionResultForInfo();

        transactionResultForInfo.setRequestID("7E:B6:46:65:82:26/7E:B6:46:65:82:26###20160116153100");
        transactionResultForInfo.setStatusOk(true);
        transactionResultForInfo.setServerTimeStamp(new Date());
        transactionResultForInfo.setTransID("ABS8373638");
        transactionResultForInfo.setStatus("OK");
        transactionResultForInfo.setMessage("Successfull");

        AccountResponse accountResponse = new AccountResponse();
        accountResponse.setAccountHolderName("MD. AHSAN HABIB ROCKY");
        accountResponse.setRequestID("7E:B6:46:65:82:26/7E:B6:46:65:82:26###20160116153100");
        accountResponse.setAccountId("");
        accountResponse.setEmail("arhabib@ael-bd.com");
        accountResponse.setAccountStatus("A");
        accountResponse.setAccountTitle("MD. AHSAN HABIB ROCKY");
        accountResponse.setAgentId("715005");
        accountResponse.setBankAccountNo("2311331550001");
        accountResponse.setBankId("101");
        accountResponse.setBranchId("10001");
        accountResponse.setCustomerID("1106207");
        accountResponse.setMobileNo("01915067740");
        accountResponse.setGender("M");
        accountResponse.setAccountType("TA");
        accountResponse.setNationalIdNo("01234567890102");
        accountResponse.setProductID("");
        accountResponse.setPhotoContent("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");
        accountResponse.setProductDetail("");

        transactionResultForInfo.setAccount(accountResponse);
        transactionResultForInfo.setChargeAmount(7.80);
        transactionResultForInfo.setToAccount(accountResponse);

        FingerPrint fp = new FingerPrint();
        fp.setDefaultFP("lt");
        fp.setLt("464d5200203230000000014400000100019000c500c5010000002431406c000b845080840019785d805c002a045d4063002e9c50805000412c5080d400414c5d405e004bb84a4071004fe04a80ae004fcc5d80650059bc5040bc00594c5740db0059bc5d405c005d3850408f0062585d406f0064d05080490069405740ba0069445080760070d05040e90079345d40dd007c385d40500083485d809b0085005d40c100859c5d807a008ae05d80cd008a305d40b50091205780c30093305080b000987c57408400a1f05d406500b2e05d40b500b20857408f00b4f05d402800b9d450403600b9585d40e200b98c4a40e900b91c43404900c2dc5d402300ce544a40c300d3084a40c800d70843402600e35c3c404e00e6e05d40a500e6f457404900f6585740df00fb043c40d80109fc3c407f010d6457405c0115e45040840119f057");
        fp.setLi("");
        fp.setLm("");
        fp.setLr("");
        fp.setLp("");
        fp.setRt("");
        fp.setRi("");
        fp.setRm("");
        fp.setRr("");
        fp.setRp("");

        transactionResultForInfo.setFingerPrint(fp);

        return gson.toJson(transactionResultForInfo);

    }


    public static String getTransactionResult() {

        TransactionResult transactionResult = new TransactionResult();

        transactionResult.setRequestID("7E:B6:46:65:82:26/7E:B6:46:65:82:26###20160116153100");
        transactionResult.setStatusOk(true);
        transactionResult.setStatus("OK");
        //  transactionResult.setServerTimeStamp(new Date());
        transactionResult.setServerTimeStamp("15-JAN-2016 7:00 PM ");
        transactionResult.setTransID("ABS8373638");
        transactionResult.setMessage("Transaction Successfull");
        AccountResponse accountResponse = new AccountResponse();
        accountResponse.setAccountHolderName("MD. AHSAN HABIB ROCKY");
        accountResponse.setRequestID("7E:B6:46:65:82:26/7E:B6:46:65:82:26###20160116153100");
        accountResponse.setAccountId("");
        accountResponse.setEmail("arhabib@ael-bd.com");
        accountResponse.setAccountStatus("A");
        accountResponse.setAccountTitle("MD. AHSAN HABIB ROCKY");
        accountResponse.setAgentId("715005");
        accountResponse.setBankAccountNo("2311331550001");
        accountResponse.setBankId("101");
        accountResponse.setBranchId("10001");
        accountResponse.setCustomerID("1106207");
        accountResponse.setMobileNo("01915067740");
        accountResponse.setGender("M");
        accountResponse.setNationalIdNo("01234567890102");
        accountResponse.setProductID("");
        accountResponse.setPhotoContent("");
        accountResponse.setProductDetail("");
*/
/*
        transactionResult.setBalance(new Money(1000));*//*


        transactionResult.setBalance(1000);
        transactionResult.setAccount(accountResponse);
        transactionResult.setChargeAmount(7.80);
        transactionResult.setToAccount(accountResponse);

        FingerPrint fp = new FingerPrint();
        fp.setDefaultFP("lt");
        fp.setLt("464d5200203230000000014400000100019000c500c5010000002431406c000b845080840019785d805c002a045d4063002e9c50805000412c5080d400414c5d405e004bb84a4071004fe04a80ae004fcc5d80650059bc5040bc00594c5740db0059bc5d405c005d3850408f0062585d406f0064d05080490069405740ba0069445080760070d05040e90079345d40dd007c385d40500083485d809b0085005d40c100859c5d807a008ae05d80cd008a305d40b50091205780c30093305080b000987c57408400a1f05d406500b2e05d40b500b20857408f00b4f05d402800b9d450403600b9585d40e200b98c4a40e900b91c43404900c2dc5d402300ce544a40c300d3084a40c800d70843402600e35c3c404e00e6e05d40a500e6f457404900f6585740df00fb043c40d80109fc3c407f010d6457405c0115e45040840119f057");
        fp.setLi("");
        fp.setLm("");
        fp.setLr("");
        fp.setLp("");
        fp.setRt("");
        fp.setRi("");
        fp.setRm("");
        fp.setRr("");
        fp.setRp("");

        transactionResult.setFingerPrint(fp);
        return gson.toJson(transactionResult);

    }

    public static String getDSTCustomerAccountInformation() {


        ArrayList<DSTCustomerAccountApproval> dstCustomerAccountApprovalArrayList = new ArrayList<DSTCustomerAccountApproval>();
        DSTApprovalListResult listResult = new DSTApprovalListResult();
        DSTCustomerAccountApproval dstCustomerAccountApproval = new DSTCustomerAccountApproval();
        DSTCustomerAccountApprovalDAO dstCustomerAccountApprovalDAO = new DSTCustomerAccountApprovalDAO();
        Customer customer = new Customer();
        CustomerDAO customerDAO = new CustomerDAO();
        AccountDetails accountDetails = new AccountDetails();
        Account account = Account.builder().build();
        Account account1 = Account.builder().build();


        account.setAccountID("10101011");
        account.setCustomerID("5");


        customer.setFirstName("MD.Toufiq");
        customer.setMobileNo("01911542000");
        accountDetails.setAccountType("Savings");
        accountDetails.setInitialDeposit(100.0f);
        customer.setPhotoID("2010101010101010101");
        customer.setPhotoContent("");

        customerDAO.addCustomerInfoToJson(customer);

        dstCustomerAccountApproval.setCustomer(customer);
        dstCustomerAccountApproval.setAccountDetails(accountDetails);
        dstCustomerAccountApproval.setAccount(account);

        DSTCustomerAccountApproval dstCustomerAccountApproval1 = new DSTCustomerAccountApproval();
        Customer customer1 = new Customer();

        AccountDetails accountDetails1 = new AccountDetails();

        customer1.setFirstName("MD.Toufiq");
        customer1.setMobileNo("01911542000");
        accountDetails1.setAccountType("Savings");
        accountDetails1.setInitialDeposit(100.0f);
        customer1.setPhotoID("2010101010101010101");
        customer1.setPhotoContent("");
        account1.setAccountID("1324444");
        account1.setCustomerID("6");
        customerDAO.addCustomerInfoToJson(customer1);

        dstCustomerAccountApproval1.setCustomer(customer1);
        dstCustomerAccountApproval1.setAccountDetails(accountDetails1);
        dstCustomerAccountApproval1.setAccount(account1);

        dstCustomerAccountApprovalArrayList.add(dstCustomerAccountApproval);
        dstCustomerAccountApprovalArrayList.add(dstCustomerAccountApproval1);


        listResult.setDstCustomerAccountApprovalList(dstCustomerAccountApprovalArrayList);

        return gson.toJson(listResult);

    }


    public static String getIFRResponse() {
        IFRResponse ifrResponse = new IFRResponse();

        ifrResponse.setMessage("Successes");
        ifrResponse.setRequestID("A91109123");
        ifrResponse.setStatus("OK");
        ifrResponse.setServerTimeStamp("1440251009");


        return gson.toJson(ifrResponse);
    }

    public static String getMockIFRSearchByPinResult() {
        IFRSearchByPINResult ifrSearchByPINResult = new IFRSearchByPINResult();

        IFRInfoResponse ifrInfoResponse = new IFRInfoResponse();

        ifrInfoResponse.setActualAmount(100.00);
        ifrInfoResponse.setActualAmountInBDT(7500.00);
        ifrInfoResponse.setAgentID(new AgentResultDAO().getAgentResultObject().getAgentID());
        ifrInfoResponse.setPin("1234");


        ifrSearchByPINResult.setRequestID("123123123");
        ifrSearchByPINResult.setStatus("OK");
        ifrSearchByPINResult.setAccountID("543121312");
        ifrSearchByPINResult.setMessage("Success");
        ifrSearchByPINResult.setBalance(10000.00);
        ifrSearchByPINResult.setIfrResponse(ifrInfoResponse);
        //  ifrSearchByPINResult.setServerTimeStamp(new Date());
        ifrSearchByPINResult.setTransList(null);


        return gson.toJson(ifrSearchByPINResult);
    }
*/


}
