package OOPS.Inheritance.Hybrid_Inheritance;
// Bad practice: inheriting from a concrete class
class ConcretePrinter {
    void print(String message) {
        System.out.println("Printing: " + message);
    }
}

// Subclass tightly coupled to ConcretePrinter
class FancyPrinter extends ConcretePrinter {
    void printFancy(String message) {
        System.out.println("*** " + message + " ***");
    }
}

// Better approach: using abstract class or interface
interface Printer {
    void print(String message);
}

class SimplePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Printing: " + message);
    }
}

class AdvancedPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("*** " + message + " ***");
    }
}

public class AvoidConcreteInheritanceDemo {
    public static void main(String[] args) {
        // Tightly coupled approach
        FancyPrinter fp = new FancyPrinter();
        fp.print("Hello World");      // Inherits directly
        fp.printFancy("Hello World"); // Custom behavior

        // Flexible approach using interfaces
        Printer p1 = new SimplePrinter();
        Printer p2 = new AdvancedPrinter();

        p1.print("Hello Interface");
        p2.print("Hello Interface");
    }
}
