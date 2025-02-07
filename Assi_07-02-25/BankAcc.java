
class BankAcc {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1001, 5000.00);
        System.out.println(bankAccount.displayAccountType());

        SavingsAccount savingsAccount = new SavingsAccount(1002, 8000.00, 3.5);
        System.out.println(savingsAccount.displayAccountType());

        CheckingAccount checkingAccount = new CheckingAccount(1003, 12000.00, 2000.00);
        System.out.println(checkingAccount.displayAccountType());

        FixedDepositAccount fixedDepositAccount = new FixedDepositAccount(1004, 15000.00, 5.0, 2);
        System.out.println(fixedDepositAccount.displayAccountType());
    }
}

class BankAccount {
    int accountNumber;
    double balance;
    
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    String displayAccountType() {
        return "Generic Bank Account";
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    
    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    @Override
    String displayAccountType() {
        return "Savings Account with interest rate: " + interestRate + "%";
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    
    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }
    
    @Override
    String displayAccountType() {
        return "Checking Account with withdrawal limit: $" + withdrawalLimit;
    }
}

class FixedDepositAccount extends BankAccount {
    double interestRate;
    int term;
    
    FixedDepositAccount(int accountNumber, double balance, double interestRate, int term) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
        this.term = term;
    }
    
    @Override
    String displayAccountType() {
        return "Fixed Deposit Account with interest rate: " + interestRate + "% for " + term + " years";
    }
}

