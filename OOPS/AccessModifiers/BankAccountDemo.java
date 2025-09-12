package OOPS.AccessModifiers;
// Demonstration of Access Modifiers with BankAccount and SavingsAccount classes

class BankAccount {
    public String accountNumber;       // Public: Accessible everywhere
    protected String accountHolder;    // Protected: Accessible in same package & subclasses
    private double balance;            // Private: Accessible only within this class

    // Constructor
    BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public methods to access and modify balance
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance!");
    }
}

// Subclass to demonstrate access to public and protected members
class SavingsAccount extends BankAccount {
    SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    public void showAccountDetails() {
        System.out.println("Savings Account Number: " + accountNumber);  // Public
        System.out.println("Account Holder: " + accountHolder);          // Protected
    }
}

// Main class
public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("1234567890", "Amit", 5000);
        sa.showAccountDetails();
        sa.deposit(2000);
        System.out.println("Balance after deposit: " + sa.getBalance());
        sa.withdraw(3000);
        System.out.println("Balance after withdrawal: " + sa.getBalance());
    }
}

