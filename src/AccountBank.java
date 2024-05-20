public class AccountBank {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor with default values
    public AccountBank() {
        this.accountNumber = "";
        this.accountHolderName = "";
        this.balance = 0.0;
    }

    // Getters and Setters
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Balance cannot be negative.");
        } else {
            this.balance = balance;
        }
    }

    // Method to display account information
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
        } else if (amount > 0) {
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    // Method to transfer money to another account
    public void transfer(AccountBank destinationAccount, double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            destinationAccount.deposit(amount);
            System.out.println("Transferred $" + amount + " to account " + destinationAccount.getAccountNumber());
        } else if (amount > 0) {
            System.out.println("Insufficient balance for transfer.");
        } else {
            System.out.println("Transfer amount must be positive.");
        }
    }
}
