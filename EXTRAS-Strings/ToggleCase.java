import java.util.Scanner;

class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        // Toggle case
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                result += Character.toLowerCase(ch);
            else if (Character.isLowerCase(ch))
                result += Character.toUpperCase(ch);
            else
                result += ch; // keep non-letters same
        }

        System.out.println("Toggled String: " + result);
    }
}
