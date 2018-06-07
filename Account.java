public abstract class Account implements IRate {
    // List common properties for savings and checking accounts
    String name;
    String SSN;
    double balance;

    String accountNumber;
    double rate;

    // Constructor to set base properties and initialize the account
    public Account(String name) {
        System.out.println("NAME: " + name);
        System.out.print("NEW ACCOUNT: ");
    }

    // List common methods
}