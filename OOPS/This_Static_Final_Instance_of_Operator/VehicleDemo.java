package OOPS.This_Static_Final_Instance_of_Operator;

// Vehicle Registration System demonstrating static, this, final, and instanceof
class Vehicle {
    static double registrationFee = 1500.0;
    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void displayDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Anil", "Car", "MH12AB1234");
        if (v1 instanceof Vehicle) {
            Vehicle.updateRegistrationFee(2000);
            v1.displayDetails();
        }
    }
}

