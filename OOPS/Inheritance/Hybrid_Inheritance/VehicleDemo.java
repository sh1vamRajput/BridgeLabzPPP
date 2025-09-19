package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass: Vehicle
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void displayInfo() {
        System.out.println("Model: " + model + ", Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    void refuel();
}

// Subclass: ElectricVehicle
class ElectricVehicle extends Vehicle {
    int batteryCapacity; // in kWh

    ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    void charge() {
        System.out.println(model + " is charging its " + batteryCapacity + " kWh battery.");
    }
}

// Subclass: PetrolVehicle implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    int fuelCapacity; // in liters

    PetrolVehicle(String model, int maxSpeed, int fuelCapacity) {
        super(model, maxSpeed);
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling with " + fuelCapacity + " liters of petrol.");
    }
}

// Driver class
public class VehicleDemo {
    public static void main(String[] args) {
        // Create ElectricVehicle object
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 225, 75);
        ev.displayInfo();
        ev.charge();

        System.out.println();

        // Create PetrolVehicle object
        PetrolVehicle pv = new PetrolVehicle("Toyota Corolla", 180, 50);
        pv.displayInfo();
        pv.refuel();
    }
}

