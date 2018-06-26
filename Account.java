public abstract class Account implements IRate {
    // List common properties for savings and checking accounts
    private String name;
    private String SSN;
    private double balance;

    private static int index = 10000;
    protected String accountNumber;
    protected double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String SSN, double initDeposit) {
        index++;
        this.name = name;
        this.SSN = SSN;
        this.balance = initDeposit;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = SSN.substring(SSN.length() - 2, SSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound() {
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);
        printBalance();
    }

    // List common methods

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is now: $" + balance);
    }
    
    public void showInfo() {
        System.out.println(
            "NAME: " + name +
            "\nACCOUNT NUMBER: " + accountNumber +
            "\nBALANCE: " + balance +
            "\nRATE: " + rate + "%"
        );
    }
}