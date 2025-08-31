import java.util.Scanner;

class FactorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        int fact = 1, i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }

        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
