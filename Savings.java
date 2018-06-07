public class Savings extends Account {
    // List properties specific to a savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the savings properties
    public Savings(String name) {
        super(name);
        System.out.println("NEW SAVINGS ACCOUNT");
    }

    // List any methods specific to savings account
}