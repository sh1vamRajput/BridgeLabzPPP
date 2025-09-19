package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass
class Vehicle {
    void start() {
        System.out.println("Vehicle starts.");
    }

    // Suppose we change this method in future
    void stop() {
        System.out.println("Vehicle stops safely.");
    }
}

// Subclass relying on the original behavior
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with ignition key.");
    }

    void stopCar() {
        // Uses superclass stop method
        stop(); 
    }
}

public class FragileBaseClassDemo {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();   // Works fine
        car.stopCar(); // Relies on Vehicle's stop() behavior
    }
}

