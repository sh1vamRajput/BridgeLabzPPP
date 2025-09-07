import java.util.Scanner;

class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split by spaces
        String[] words = sentence.split(" ");
        String longest = "";

        // Compare lengths
        for (String w : words) {
            if (w.length() > longest.length()) {
                longest = w;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
