package OOPS.Inheritance.Hybrid_Inheritance;
// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }
}

// Subclass
class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives.");
    }
}

// Another subclass
class Bike extends Vehicle {
    void ride() {
        System.out.println("Bike rides.");
    }
}

public class ShallowHierarchyDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start(); // Inherited
        car.drive(); // Specific to Car

        Bike bike = new Bike();
        bike.start(); // Inherited
        bike.ride();  // Specific to Bike
    }
}

