import java.util.Arrays;
import java.util.Scanner;

class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input strings
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

        // Quick check for length
        if (s1.length() != s2.length()) {
            System.out.println("Not Anagrams");
            return;
        }

        // Convert to arrays and sort
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays
        if (Arrays.equals(arr1, arr2))
            System.out.println("Strings are Anagrams");
        else
            System.out.println("Not Anagrams");
    }
}
