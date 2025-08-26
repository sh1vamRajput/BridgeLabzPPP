import java.util.Scanner;

public class ReverseString {
    public static String reverse(String text) {
        String rev = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            rev += text.charAt(i);
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str = sc.nextLine();

        System.out.println("Reversed: " + reverse(str));
    }
}
