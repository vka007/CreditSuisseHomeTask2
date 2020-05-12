public class GenerateReport {

    public void suspiciousTransactionReport(String suspiciousTransaction[], String transactionData[][])
    {
        String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        String groupByMonth[][] = new String[12][100];

        for (int i=0; i<12; i++)
        {
            groupByMonth[i][0] = month[i];
        }

        int subCharPosition = 3, count = 1;

        for(int i=1; i<15; i++)
        {
            for(int j=0; j<suspiciousTransaction.length; j++) {
                if (transactionData[i][0] == suspiciousTransaction[j])
                {
                    int len = transactionData[i][1].length();
                    if (len==8)
                        subCharPosition-=1;

                    String transMonth = transactionData[i][1].substring(subCharPosition,subCharPosition+3);

                    for(int k=0; k<12;k++)
                    {
                        if(transMonth.equals(groupByMonth[k][0]))
                        {
                            while(groupByMonth[k][count]!=null)
                                count++;

                            groupByMonth[k][count] = suspiciousTransaction[j];
                        }
                    }
                    break;
                }
                subCharPosition = 3; count = 0;
            }
        }

        count = 1;

        for (int i=0; i<12; i++)
        {
            if(groupByMonth[i][count] != null) {
                System.out.println("For the Month of "+month[i]);
                System.out.println("Suspicious Transactions :");
                while (groupByMonth[i][count] != null)
                {
                    System.out.println(groupByMonth[i][count]);
                    count++;
                }
                System.out.println();
            }
            count = 1;
        }
    }

    public void suspiciousAccountReport(String[][] suspiciousAccount)
    {
        int flag = 0;

        if (suspiciousAccount[0][0] == null)
            System.out.println("No Suspicious Accounts present");
        else {
            System.out.println("Suspicious Accounts");
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 2; j++) {
                    if (suspiciousAccount[i][j] == null) {
                        flag = 1;
                        break;
                    }
                    System.out.print(suspiciousAccount[i][j]+ " ");
                }
                if (flag == 1)
                    break;
                System.out.println();
            }
        }
    }
}
