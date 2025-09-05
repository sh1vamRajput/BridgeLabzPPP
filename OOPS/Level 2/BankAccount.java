class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Vinay Rajput", 12345, 5000);
        acc1.deposit(2000);
        acc1.withdraw(3000);
        acc1.displayBalance();
    }
}