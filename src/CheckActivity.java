public class CheckActivity {

    public String[][] flagAccount(String[][] customerData) {

        String suspiciousAccount[][] = new String[100][100];
        int row = 0, col = 0, flag = 0;

        for (int i = 1; i < 4; i++) {
            for (int j = i + 1; j <= 5; j++) {
                if (customerData[i][2] == customerData[j][2] && customerData[i][3] == customerData[j][3]) {
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

    public String[] flagTransaction(String transactionData[][] ,String suspiciousAccount[][])
    {
        String suspiciousTransaction[] = new String[100];
        int count = 0;

        if(suspiciousAccount[0][0] == null)
        {
            System.out.println("No Suspicious Transaction Occured");
        }
        else {
            for (int i = 0; i < 2; i++) {
                for (int j = 1; j < 100; j++) {
                    if ((suspiciousAccount[i][0] == transactionData[j][2]) && (suspiciousAccount[i][1] == transactionData[j][3])) {
                        suspiciousTransaction[count] = transactionData[j][0];
                        count += 1;
                    } else if ((suspiciousAccount[i][1] == transactionData[j][2]) && (suspiciousAccount[i][0] == transactionData[j][3])) {
                        suspiciousTransaction[count] = transactionData[j][0];
                        count += 1;
                    } else
                        continue;
                }
            }
        }
        return suspiciousTransaction;
    }
}
