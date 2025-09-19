package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass
class Vehicle {
    private String brand;

    Vehicle(String brand) {
        this.brand = brand;
        // Avoid calling non-final methods here to prevent issues with subclass state
        System.out.println("Vehicle constructor called for: " + brand);
    }

    public String getBrand() {
        return brand;
    }

    // Non-final method (should not be called from constructor)
    public void start() {
        System.out.println(brand + " vehicle starts.");
    }
}

// Subclass
class Car extends Vehicle {
    private int speed;

    Car(String brand, int speed) {
        super(brand); // Explicit call to superclass constructor
        this.speed = speed;
        System.out.println("Car constructor called with speed: " + speed);
    }

    // Override only if behavior differs
    @Override
    public void start() {
        System.out.println(getBrand() + " car starts at speed: " + speed);
    }
}

public class ConstructorSafetyDemo {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 120);
        car.start(); // Uses overridden method safely
    }
}

