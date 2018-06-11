public class Savings extends Account {
    // List properties specific to a savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the savings properties
    public Savings(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        System.out.println("NEW SAVINGS ACCOUNT");
    }

    // List any methods specific to savings account
}