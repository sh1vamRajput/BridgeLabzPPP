import java.util.Scanner;

class MaxOfThree {

    // Function to find maximum
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Find and print maximum
        int max = findMax(a, b, c);
        System.out.println("Maximum: " + max);
    }
}
