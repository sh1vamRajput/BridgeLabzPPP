import java.util.Scanner;

public class ReverseNumberRecursion {

    static int reverse(int num, int rev) {
        if (num == 0) {
            return rev;
        }
        rev = (rev * 10) + (num % 10);
        return reverse(num / 10, rev);
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
