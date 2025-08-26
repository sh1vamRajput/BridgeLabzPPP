import java.util.Scanner;

class IllegalArgumentDemo {

    static void generateException(String text) {
        System.out.println(text.substring(5, 2)); 
    }

    static void handleException(String text) {
        try {
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException!");
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
