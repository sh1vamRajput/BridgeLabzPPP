import java.util.Scanner;

class BasicCalculator {

    // Functions for operations
    public static double add(double a, double b) { return a + b; }
    public static double subtract(double a, double b) { return a - b; }
    public static double multiply(double a, double b) { return a * b; }
    public static double divide(double a, double b) { return a / b; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        // Menu
        System.out.println("Choose operation: 1) Add  2) Subtract  3) Multiply  4) Divide");
        int choice = sc.nextInt();

        double result = 0;
        switch (choice) {
            case 1: result = add(a, b); break;
            case 2: result = subtract(a, b); break;
            case 3: result = multiply(a, b); break;
            case 4: result = divide(a, b); break;
            default: System.out.println("Invalid choice"); return;
        }

        System.out.println("Result = " + result);
    }
}
