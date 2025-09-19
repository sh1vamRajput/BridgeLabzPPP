package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass
class Printer {
    void print(String message) {
        System.out.println("Printing: " + message);
    }
}

// Subclass that does NOT override unnecessarily
class ColorPrinter extends Printer {
    // Only override if behavior changes; otherwise, reuse superclass method
    // No override here because basic print functionality is sufficient
}

public class UnnecessaryOverrideDemo {
    public static void main(String[] args) {
        Printer basicPrinter = new Printer();
        basicPrinter.print("Hello World");

        ColorPrinter colorPrinter = new ColorPrinter();
        colorPrinter.print("Hello Color World"); // Uses inherited method
    }
}

