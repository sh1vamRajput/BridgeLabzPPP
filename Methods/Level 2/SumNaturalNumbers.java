import java.util.Scanner;

public class SumNaturalNumbers {

    static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
            return;
        }

        int recursive = sumRecursive(n);
        int formula = sumFormula(n);

        System.out.println("Recursive sum = " + recursive);
        System.out.println("Formula sum = " + formula);
        System.out.println("Both results are equal: " + (recursive == formula));
    }
}
