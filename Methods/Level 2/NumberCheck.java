import java.util.Scanner;

public class NumberCheck {

    static boolean isPositive(int num) { return num > 0; }
    static boolean isEven(int num) { return num % 2 == 0; }
    static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 == n2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (isPositive(arr[i])) {
                System.out.print(arr[i] + " is Positive and ");
                System.out.println(isEven(arr[i]) ? "Even" : "Odd");
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        int result = compare(arr[0], arr[arr.length - 1]);
        if (result == 0) System.out.println("First and Last are Equal");
        else if (result > 0) System.out.println("First is Greater");
        else System.out.println("Last is Greater");
    }
}
