import java.util.Scanner;

class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("The addition is " + (num1 + num2));
        System.out.println("The subtraction is " + (num1 - num2));
        System.out.println("The multiplication is " + (num1 * num2));
        System.out.println("The division is " + (num1 / num2));

        sc.close();
    }
}
