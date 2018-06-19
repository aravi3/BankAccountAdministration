public class Savings extends Account {
    // List properties specific to a savings account
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // Constructor to initialize settings for the savings properties
    public Savings(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    // List any methods specific to savings account

    public void setRate() {
        rate = getBaseRate() - 0.25;
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
            " Your Savings Account Features" +
            "\n Safety Deposit Box ID: " + safetyDepositBoxID +
            "\n Safety Deposit Box Key: " + safetyDepositBoxKey
        );
    }
}