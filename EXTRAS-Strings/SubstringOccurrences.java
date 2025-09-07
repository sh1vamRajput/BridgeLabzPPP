import java.util.Scanner;

class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input main string
        System.out.print("Enter main string: ");
        String str = sc.nextLine();

        // Input substring
        System.out.print("Enter substring: ");
        String sub = sc.nextLine();

        int count = 0, index = 0;

        // Use indexOf in loop
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); // move forward
        }

        System.out.println("Occurrences: " + count);
    }
}
