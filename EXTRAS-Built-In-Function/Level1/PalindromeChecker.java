import java.util.Scanner;

class PalindromeChecker {

    // Function to check palindrome
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Check and output
        if (isPalindrome(str))
            System.out.println(str + " is a Palindrome");
        else
            System.out.println(str + " is Not a Palindrome");
    }
}
