import java.util.Scanner;

class UniqueCharacters {

    // Find length without length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    
    public static char[] uniqueChars(String text) {
        int n = findLength(text);
        char[] result = new char[n];
        int index = 0;
        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) result[index++] = c;
        }
        char[] finalResult = new char[index];
        for (int i = 0; i < index; i++) finalResult[i] = result[i];
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        char[] unique = uniqueChars(text);
        System.out.print("Unique characters: ");
        for (char c : unique) System.out.print(c + " ");
        sc.close();
    }
}
