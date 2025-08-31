import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        String numStr = Integer.toString(num);
        int len = numStr.length();
        int[] digits = new int[len];

        for (int i = 0; i < len; i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        System.out.print("Reversed Number = ");
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
    }
}
