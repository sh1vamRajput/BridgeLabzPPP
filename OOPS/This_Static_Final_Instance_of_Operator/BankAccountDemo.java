package OOPS.This_Static_Final_Instance_of_Operator;

// Bank Account System demonstrating static, this, final, and instanceof
class BankAccount {
    static String bankName = "ABC Bank";     // Shared by all accounts
    static int totalAccounts = 0;            // To count total accounts
    final String accountNumber;              // Cannot be changed once assigned
    String accountHolderName;
    double balance;

    // Constructor using 'this'
    BankAccount(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Holder: " + accountHolderName);
        System.out.println("Account No.: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Rahul", "A1001", 5000);
        if (acc1 instanceof BankAccount) acc1.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
