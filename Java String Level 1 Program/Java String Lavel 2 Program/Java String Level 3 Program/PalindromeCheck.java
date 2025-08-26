import java.util.Scanner;

class PalindromeCheck {

    
    public static boolean isPalindromeIter(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }

    
    public static boolean isPalindromeRec(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRec(text, start + 1, end - 1);
    }

    
    public static boolean isPalindromeReverse(String text) {
        char[] arr = text.toCharArray();
        char[] rev = new char[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        for (int i = 0; i < arr.length; i++) if (arr[i] != rev[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        System.out.println("Palindrome (Iterative)? " + isPalindromeIter(text));
        System.out.println("Palindrome (Recursive)? " + isPalindromeRec(text, 0, text.length() - 1));
        System.out.println("Palindrome (Reverse)? " + isPalindromeReverse(text));
        sc.close();
    }
}
