import java.util.*;

class NumberGuessingGame {

    // Function to generate a random guess between min and max
    public static int generateGuess(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 1, max = 100;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100.");
        System.out.println("I will try to guess it. Type 'high', 'low', or 'correct'.");

        while (!feedback.equalsIgnoreCase("correct")) {
            int guess = generateGuess(min, max);
            System.out.println("My guess: " + guess);

            // User feedback
            System.out.print("Is it high, low, or correct? ");
            feedback = sc.next();

            if (feedback.equalsIgnoreCase("high")) {
                max = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                min = guess + 1;
            } else if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed it.");
            }
        }
    }
}
