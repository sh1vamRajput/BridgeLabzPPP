import java.util.Scanner;

class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Array to store frequency of each char
        int[] freq = new int[256];

        for (char ch : str.toCharArray()) {
            freq[ch]++;
        }

        char maxChar = ' ';
        int maxCount = 0;

        // Find char with max frequency
        for (int i = 0; i < 256; i++) {
            if (freq[i] > maxCount) {
                maxCount = freq[i];
                maxChar = (char) i;
            }
        }

        System.out.println("Most Frequent Character: '" + maxChar + "'");
    }
}
