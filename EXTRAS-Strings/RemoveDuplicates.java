import java.util.Scanner;

class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        // Add only unique characters
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // if character not already in result, add it
            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println("String after removing duplicates: " + result);
    }
}
