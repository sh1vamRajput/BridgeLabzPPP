package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass
class Calculator {
    // Original method
    int add(int a, int b) {
        return a + b;
    }
}

// Subclass that overrides and overloads
class AdvancedCalculator extends Calculator {
    
    // Overriding the superclass method
    @Override
    int add(int a, int b) {
        System.out.println("Using overridden add method");
        return a + b;
    }

    // Overloaded method with different parameters (can be confusing)
    int add(int a, int b, int c) {
        System.out.println("Using overloaded add method");
        return a + b + c;
    }
}

public class OverloadOverrideDemo {
    public static void main(String[] args) {
        AdvancedCalculator calc = new AdvancedCalculator();
        System.out.println(calc.add(5, 10));    // Calls overridden method
        System.out.println(calc.add(5, 10, 15)); // Calls overloaded method
    }
}

