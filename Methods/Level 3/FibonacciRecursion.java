import java.util.Scanner;

public class FibonacciRecursion {

    
    static int fibonacci(int n) {
        if (n == 0) return 0;   
        if (n == 1) return 1;   
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();

        
        System.out.println("Fibonacci Series:");
        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }
}
