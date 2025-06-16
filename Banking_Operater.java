public class Banking_Operater {
    public static void main(String[] args) {
    String accountHolder = "Ravi Kumar";
    double accountBalance = 2500.0;
    double depositAmount = 1500.0;
    double withdrawalAmount = 500.0;
    int numberOfTransactions = 0;
    boolean isAccountActive = true;

    boolean isDepositValid = depositAmount > 0 && isAccountActive;
    if (isDepositValid) {
        accountBalance += depositAmount;
        numberOfTransactions++;
    }

    accountBalance -= withdrawalAmount;
    numberOfTransactions++;

    boolean isBelowMinimum = accountBalance < 1000;

    System.out.println("----- Bank Account Summary -----");
    System.out.println("Account Holder        : " + accountHolder);
    System.out.println("Final Balance         : $" + accountBalance);
    System.out.println("Number of Transactions: " + numberOfTransactions);
}

}
