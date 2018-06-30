import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> accounts = new LinkedList<Account>();

        // Read a CSV file then create new accounts based on that data
        String file = "/Users/arvindravi/Desktop/Java Projects/BankAccountAdministration/NewBankAccounts.csv";
        CSV file1 = new CSV();
        List<String[]> newAccountHolders = file1.read(file);
        for (String[] accountHolder : newAccountHolders) {
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if (accountType.equals("Savings")) {
                accounts.add(new Savings(name, SSN, initDeposit));
            } else if (accountType.equals("Checking")) {
                accounts.add(new Checking(name, SSN, initDeposit));
            } else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }
        }

        for (Account acc : accounts) {
            System.out.println("\n*****************");
            acc.showInfo();
        }
    }
}