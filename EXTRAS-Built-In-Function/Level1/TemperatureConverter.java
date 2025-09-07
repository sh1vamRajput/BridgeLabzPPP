import java.util.Scanner;

class TemperatureConverter {

    // Fahrenheit to Celsius
    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // Celsius to Fahrenheit
    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input choice
        System.out.print("Choose conversion: 1) F -> C  2) C -> F : ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Celsius = " + toCelsius(f));
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit = " + toFahrenheit(c));
        } else {
            System.out.println("Invalid Choice");
        }
    }
}
