import java.util.Scanner;

public class WordLengthTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = text.split(" ");

        System.out.println("Word\tLength");
        for (String w : words) {
            System.out.println(w + "\t" + w.length());
        }
    }
}
