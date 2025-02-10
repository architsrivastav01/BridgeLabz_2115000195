
import java.util.Scanner;
abstract class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            throw new IllegalArgumentException("Invalid withdrawal amount.");
        }
    }

    public abstract void displayAccountDetails();
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Savings Account: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= (getBalance() + overdraftLimit)) {
            super.withdraw(amount);
        } else {
            throw new IllegalArgumentException("Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public void displayAccountDetails() {
        System.out.println("Current Account: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: " + getBalance());
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class BankAccountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SavingsAccount savings = new SavingsAccount("SA12345", "Alice", 5000, 4);
        CurrentAccount current = new CurrentAccount("CA54321", "Bob", 3000, 1000);

        System.out.println("--- Savings Account ---");
        savings.displayAccountDetails();
        System.out.println("Applying Interest...");
        savings.applyInterest();
        savings.displayAccountDetails();

        System.out.println("\n--- Current Account ---");
        current.displayAccountDetails();
        System.out.println("Withdrawing 3500...");
        current.withdraw(3500);
        current.displayAccountDetails();

        scanner.close();
    }
}
