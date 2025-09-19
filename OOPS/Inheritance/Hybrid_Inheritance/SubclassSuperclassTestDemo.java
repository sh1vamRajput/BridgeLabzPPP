package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass
class Account {
    private double balance;

    Account(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }
}

// Subclass
class SavingsAccount extends Account {
    private double interestRate;

    SavingsAccount(double balance, double interestRate) {
        super(balance);
        this.interestRate = interestRate;
    }

    // Overriding deposit to add interest
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        double interest = amount * interestRate / 100;
        System.out.println("Interest added: " + interest);
    }
}

public class SubclassSuperclassTestDemo {
    public static void main(String[] args) {
        // Testing superclass behavior
        Account acc = new Account(1000);
        acc.deposit(500); // Expect: Balance = 1500

        // Testing subclass behavior
        SavingsAccount sa = new SavingsAccount(2000, 5);
        sa.deposit(1000); // Expect: Balance = 3000 + Interest = 50

        // Ensure superclass methods still behave as expected when called from subclass
        System.out.println("Total balance in savings account: " + sa.getBalance());
    }
}
