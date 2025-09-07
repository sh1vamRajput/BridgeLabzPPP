import java.util.Scanner;

public class CharacterTypeChecker {
    
    // Check if a character is vowel, consonant or not a letter
    public static String checkCharacterType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // convert uppercase to lowercase
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Analyze each character in the string
    public static String[][] analyzeString(String text) {
        int size = text.length();
        String[][] result = new String[size][2];

        for (int i = 0; i < size; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharacterType(ch);
        }
        return result;  // you forgot this closing brace earlier
    }

    // Display results in table format
    public static void displayResult(String[][] array) {
        System.out.println("\nCharacter\tType");
        System.out.println("-----------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + "\t\t" + array[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] analysis = analyzeString(input);
        displayResult(analysis);

        sc.close();
    }
}
