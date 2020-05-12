public class BankHome {

    //transaction data stored in 2-dimensional array
    //to simulate a database
    public static String transactionData[][] = new String[100][5];

    //Customer data stored in 2-dimensional array
    //to simulate a database
    public static String customerData[][] = new String[100][4];

    public static void main(String[] args)
    {
        SampleCustomerData sampleCustomerData = new SampleCustomerData();
        //initialise the array/database with sample Customer Data
        sampleCustomerData.customerData();

        SampleTransactionData sampleTransactionData = new SampleTransactionData();
        //initialise the array/database with sample Transaction Data
        sampleTransactionData.TransactionData();

        CheckActivity checkActivity = new CheckActivity();

        //Find Suspicious Accounts
        String suspiciousAccount[][] = checkActivity.flagAccount(customerData);

        //Find Suspicious Transactions
        String suspiciousTransaction[] =  checkActivity.flagTransaction(transactionData, suspiciousAccount);

        GenerateReport generateReport = new GenerateReport();

        //Generate & Print the Suspicious Transactions
        generateReport.suspiciousTransactionReport(suspiciousTransaction, transactionData);

        //Generate & Print the Suspicious Accounts
        generateReport.suspiciousAccountReport(suspiciousAccount);

    }
}
