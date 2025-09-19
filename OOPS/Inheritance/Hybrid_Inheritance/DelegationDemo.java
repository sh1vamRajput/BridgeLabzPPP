package OOPS.Inheritance.Hybrid_Inheritance;
 // General behavior class
class Printer {
    void print(String message) {
        System.out.println("Printing: " + message);
    }
}

// Special behavior class for fancy printing
class FancyPrinterBehavior {
    void printFancy(String message) {
        System.out.println("*** " + message + " ***");
    }
}

// Client class using delegation instead of inheritance
class Document {
    private Printer printer;
    private FancyPrinterBehavior fancyBehavior;

    Document(Printer printer) {
        this.printer = printer;
        this.fancyBehavior = new FancyPrinterBehavior();
    }

    void printNormal(String message) {
        printer.print(message); // Delegates normal printing
    }

    void printFancy(String message) {
        fancyBehavior.printFancy(message); // Delegates fancy printing
    }
}

public class DelegationDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Document doc = new Document(printer);

        doc.printNormal("Hello World");  // Normal print
        doc.printFancy("Hello World");   // Fancy print
    }
}

