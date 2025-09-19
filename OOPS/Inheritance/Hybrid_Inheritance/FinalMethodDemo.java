package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass
class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    // Critical method: should not be overridden
    public final void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", New Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

// Subclass
class SavingsAccount extends BankAccount {

    SavingsAccount(double balance) {
        super(balance);
    }

    // This would cause a compile-time error if uncommented
    // @Override
    // public void deposit(double amount) {
    //     System.out.println("Trying to override deposit!");
    // }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1000);
        sa.deposit(500); // Works fine, cannot be overridden
        System.out.println("Balance: " + sa.getBalance());
    }
}

