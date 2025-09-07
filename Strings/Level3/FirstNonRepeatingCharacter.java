import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // Find first non-repeating character using frequency array
    public static char firstNonRepeatingChar(String text) {
        int[] freq = new int[256]; // ASCII frequency table
        int length = text.length();
        
        // Count frequency of each character
        for (int i = 0; i < length; i++) {
            freq[text.charAt(i)]++;
        }

        // Find first character with frequency 1
        for (int i = 0; i < length; i++) {
            if (freq[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0'; // return null char if none found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char result = firstNonRepeatingChar(text);
        if (result == '\0') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
        sc.close();
    }
}
