import java.util.ArrayList;
import java.util.List;

public class BankDemo {

    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("S001", 1000.00, 500.00));
        accounts.add(new CurrentAccount("C001", 500.00, 300.00));
        accounts.add(new SavingsAccount("S002", 1500.00, 1000.00));

        System.out.println("=== BANK ACCOUNT DEMO ===");

        for (Account account : accounts) {

            System.out.println("\nAccount: " + account.accountNumber);
            System.out.println("Starting balance: $" + account.getBalance());

            account.withdraw(700.00);

            System.out.println("Balance after withdrawal: $"
                    + account.getBalance());

            account.endOfMonth();

            System.out.println("Balance after month-end: $"
                    + account.getBalance());
        }
    }
}
