import java.util.Scanner;

class StringIndexOutOfBoundsDemo {

    static void generateException(String str) {
        System.out.println(str.charAt(str.length())); // Invalid index
    }

    static void handleException(String str) {
        try {
            System.out.println(str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.next();

        handleException(text);
        sc.close();
    }
}
