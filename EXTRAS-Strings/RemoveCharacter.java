import java.util.Scanner;

class RemoveCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Input character
        System.out.print("Enter character to remove: ");
        char remove = sc.next().charAt(0);

        String result = "";

        // Remove occurrences
        for (char ch : str.toCharArray()) {
            if (ch != remove) {
                result += ch;
            }
        }

        System.out.println("Modified String: " + result);
    }
}
