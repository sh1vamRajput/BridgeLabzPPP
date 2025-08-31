import java.util.Scanner;

class GCDRecursion {
    static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("GCD: " + gcd);
    }
}
