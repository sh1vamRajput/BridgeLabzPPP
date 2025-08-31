import java.util.Scanner;

class SumNaturalWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
            return;
        }

        
        int i = 1, sum = 0;
        while (i <= n) {
            sum += i;
            i++;
        }

        
        int formulaSum = n * (n + 1) / 2;

        
        System.out.println("Sum using while loop: " + sum);
        System.out.println("Sum using formula: " + formulaSum);
        System.out.println("Both results are " + (sum == formulaSum));
    }
}
