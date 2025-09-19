package OOPS.Class_and_Object.Level2;

class PalindromeChecker {
    private String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversed);
    }

    void displayResult() {
        if (isPalindrome()) {
            System.out.println("'" + text + "' is a palindrome.");
        } else {
            System.out.println("'" + text + "' is not a palindrome.");
        }
    }
}

public class PalindromeCheckerDemo {
    public static void main(String[] args) {
        PalindromeChecker checker = new PalindromeChecker("Madam");
        checker.displayResult();
    }
}

