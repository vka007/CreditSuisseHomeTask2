Credit Suisse Take Home Task - 2
--------------------------------

Task Summary
=========================
There is a requirement for the bank to flag suspicious activity. 
Transferring between accounts belonging to a same person is one such activity that needs to be reported.
Accounts having same address and mobile number are considered to belong to the same person.
 
A quarterly report of transactions is available and the bank wants us to write a program to flag such accounts.

Requirements
===========================
1. Zip File of the Task(Provided)
2. JDK 1.8(also set bin path)
3. Any IDE or Shell

Steps to Run Program
===========================
1. Unzip the .zip file

2.1.1. Open the Bank Solution folder inside CreditSuisseHomeTask-2 Folder in any IDE. Ex. Intellij, Eclipse etc.
 2. Run the BankHome.java file (Contains the main method)
 3. Output will be displayed
OR

2.2.1. Open the Bank Solution folder inside CreditSuisseHomeTask-2 Folder.
 2. Run cmd or PowerShell in this folder
 3. Compile all the java class
 Command:- $ javac *.java
 4. Run the .class file i.e. BankHome.class in shell/cmd
 Command:- $ java BankHome
 5. Output will be displayed

Note:
*The solution provided for this problem is coded based on Real world scenario of a Bank transaction.
**Multi-Dimensional Array is used to simulate a database & real transaction occurring/flagging and data are in atomic form, instead of single String value for each Data.

Two separate data class is present(SampleCustomerData & SampleTransactionData). 
Input any fresh data of any customer or transaction in those classes respectively.

Array Size is kept to 100(can be increased) initially for this problem and to demo/simulate a database working.
In real world, data will be stored & fetched from real DB, so scaling issue is fixed.

(The Folder structure is made simpler for sending this project/Source code/zip file. The actual workspace can be found in Github.)

==========================
Code Coverage, Unit Tests & Edge cases:

1. Case-Sensitive customer details and condition to flag account handled.
2. Same person with multiple accounts (more than 2 accounts) handled/reported.

===========================
-> Contains of Zip File:

1. "Bank Solution(Java Files)" folder is the workspace where the entire Java program is present.
2. README.txt file has details about the entire project & Workings.
3. "Screenshot" folder contains quick snapshots of the running Java program.

=============================