import java.util.Scanner;

public class ReverseNumberRecursion_1 {
    static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        return reverse(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = reverse(num, 0);

        System.out.println("Reversed number is: " + reversed);

        sc.close();
    }
}
