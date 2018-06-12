public abstract class Account implements IRate {
    // List common properties for savings and checking accounts
    String name;
    String SSN;
    double balance;

    static int index = 10000;
    String accountNumber;
    double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name, String SSN, double initDeposit) {
        this.name = name;
        this.SSN = SSN;
        balance = initDeposit;
        System.out.println("NAME: " + name + " SSN: " + SSN + " BALANCE: $" + balance);

        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
    }

    private String setAccountNumber() {
        String lastTwoOfSSN = SSN.substring(SSN.length() - 2, SSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // List common methods
}