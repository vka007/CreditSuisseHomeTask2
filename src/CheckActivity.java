public class CheckActivity {

    //find suspicious accounts
    public String[][] flagAccount(String[][] customerData) {

        //2D array to simulate database
        //one person with multiple accounts can be stored
        String suspiciousAccount[][] = new String[100][100];
        int row = 0, col = 0, flag = 0;

        for (int i = 1; i < 100; i++) {
            for (int j = i + 1; j <= 5; j++) {
                //condition to find same person with multiple account
                if (customerData[i][2].equalsIgnoreCase(customerData[j][2]) && customerData[i][3] == customerData[j][3]) {
                    //check same account is not duplicated
                    if (flag == 0) {
                        suspiciousAccount[row][col] = customerData[i][0];
                        flag = 1;
                    }
                    col += 1;
                    suspiciousAccount[row][col] = customerData[j][0];
                }
            }
            row += 1; col = 0; flag = 0;
        }
        return suspiciousAccount;
    }

    //find suspicious transactions
    public String[] flagTransaction(String transactionData[][] ,String suspiciousAccount[][])
    {
        //array to contains all suspicious/flagged transaction
        //initial size kept at 100, can be scaled.
        String suspiciousTransaction[] = new String[100];
        int count = 0;

            for (int i = 0; i < 2; i++) {
                for (int j = 1; j < 100; j++) {
                    //same person to same person transaction condition 1
                    if ((suspiciousAccount[i][0] == transactionData[j][2]) && (suspiciousAccount[i][1] == transactionData[j][3])) {
                        suspiciousTransaction[count] = transactionData[j][0];
                        count += 1;
                    }
                    //same person to same person transaction condition 2
                    else if ((suspiciousAccount[i][1] == transactionData[j][2]) && (suspiciousAccount[i][0] == transactionData[j][3])) {
                        suspiciousTransaction[count] = transactionData[j][0];
                        count += 1;
                    } else
                        continue;
                }
            }

        return suspiciousTransaction;
    }
}
