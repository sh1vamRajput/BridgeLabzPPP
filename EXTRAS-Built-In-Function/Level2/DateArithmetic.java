// Program to perform date arithmetic
import java.time.*;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take date input in YYYY-MM-DD format
        System.out.print("Enter a date (yyyy-mm-dd): ");
        String input = sc.nextLine();
        LocalDate date = LocalDate.parse(input);

        // Add 7 days, 1 month, and 2 years
        LocalDate updatedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        updatedDate = updatedDate.minusWeeks(3);

        System.out.println("Final Date after operations: " + updatedDate);
        sc.close();
    }
}
