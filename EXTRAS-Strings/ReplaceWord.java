import java.util.Scanner;

class ReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Word to replace
        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        // New word
        System.out.print("Enter new word: ");
        String newWord = sc.next();

        // Replace whole word using regex boundary (\b)
        String result = sentence.replaceAll("\\b" + oldWord + "\\b", newWord);

        System.out.println("Modified Sentence: " + result);
    }
}
