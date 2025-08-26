import java.util.Scanner;

public class StringLengthWithoutLength {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = sc.nextLine();

        int userLength = findLength(input);
        int builtInLength = input.length();

        System.out.println("User-defined length: " + userLength);
        System.out.println("Built-in length(): " + builtInLength);
    }
}
