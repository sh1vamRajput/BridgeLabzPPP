package OOPS.Class_and_Object.Level2;
class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class ATMSimulator {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Shivam", 12345, 5000);
        account.displayBalance();
        account.deposit(2000);
        account.withdraw(1000);
        account.displayBalance();
    }
}

