public class Checking extends Account {
    // List properties specific to a checking account
    int debitCardNumber;
    int debitCardPIN;

    // Constructor to initialize checking account properties
    public Checking(String name, String SSN, double initDeposit) {
        super(name, SSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }

    // List any methods specific to the checking account

    private void setDebitCard() {
        debitCardNumber = (int) (Math.random() * Math.pow(10, 12));
        debitCardPIN = (int) (Math.random() * Math.pow(10, 4));

    }

    public void showInfo() {
        super.showInfo();
        System.out.println(
            " Your Checking Account Features" +
            "\n Debit Card Number: " + debitCardNumber +
            "\n Debit Card PIN: " + debitCardPIN
        );
    }
}