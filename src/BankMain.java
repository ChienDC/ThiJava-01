import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo các đối tượng AccountBank mới
        AccountBank account1 = new AccountBank();
        AccountBank account2 = new AccountBank();

        // Nhập thông tin từ bàn phím
        System.out.print("Enter account number for account 1: ");
        account1.setAccountNumber(scanner.nextLine());
        System.out.print("Enter account holder name for account 1: ");
        account1.setAccountHolderName(scanner.nextLine());
        System.out.print("Enter initial balance for account 1: ");
        account1.setBalance(scanner.nextDouble());
        scanner.nextLine();
        System.out.print("Enter account number for account 2: ");
        account2.setAccountNumber(scanner.nextLine());
        System.out.print("Enter account holder name for account 2: ");
        account2.setAccountHolderName(scanner.nextLine());
        System.out.print("Enter initial balance for account 2: ");
        account2.setBalance(scanner.nextDouble());

        // Hiển thị thông tin tài khoản
        System.out.println("\nAccount 1 Info:");
        account1.displayAccountInfo();
        System.out.println("\nAccount 2 Info:");
        account2.displayAccountInfo();

        // Thực hiện các giao dịch
        System.out.println("\nPerforming transactions on account 1...");
        account1.deposit(200);
        account1.withdraw(100);
        account1.transfer(account2, 50);

        // Hiển thị thông tin tài khoản sau khi thực hiện các giao dịch
        System.out.println("\nAccount 1 Info After Transactions:");
        account1.displayAccountInfo();
        System.out.println("\nAccount 2 Info After Transactions:");
        account2.displayAccountInfo();
        scanner.close();
    }
}
