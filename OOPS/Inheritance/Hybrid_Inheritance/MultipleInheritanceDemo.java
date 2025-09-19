package OOPS.Inheritance.Hybrid_Inheritance;
// First interface
interface Drivable {
    void drive();
}

// Second interface
interface Flyable {
    void fly();
}

// Class implementing multiple interfaces
class FlyingCar implements Drivable, Flyable {
    @Override
    public void drive() {
        System.out.println("FlyingCar is driving on the road.");
    }

    @Override
    public void fly() {
        System.out.println("FlyingCar is flying in the sky.");
    }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        FlyingCar fc = new FlyingCar();
        fc.drive(); // Call from Drivable
        fc.fly();   // Call from Flyable
    }
}
