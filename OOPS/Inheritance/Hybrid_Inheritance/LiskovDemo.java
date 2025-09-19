package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass
class Bird {
    void fly() {
        System.out.println("This bird can fly.");
    }
}

// Subclass following Liskov Substitution Principle
class Sparrow extends Bird {
    @Override
    void fly() {
        System.out.println("The sparrow flies high.");
    }
}

// Subclass violating Liskov Substitution Principle
class Ostrich extends Bird {
    @Override
    void fly() {
        throw new UnsupportedOperationException("Ostriches cannot fly!");
    }
}

public class LiskovDemo {
    // Method that works with any Bird
    static void makeBirdFly(Bird bird) {
        bird.fly();
    }

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        makeBirdFly(sparrow); // Works fine

        Bird ostrich = new Ostrich();
        makeBirdFly(ostrich); // Violates LSP, throws exception
    }
}

