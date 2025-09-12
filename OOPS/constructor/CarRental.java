package OOPS.constructor;
class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    static final double DAILY_RATE = 1000.0;

    CarRental() {
        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        return rentalDays * DAILY_RATE;
    }

    void display() {
        System.out.println(customerName + " rented " + carModel + " for " + rentalDays +
                " days. Total Cost: ₹" + calculateCost());
    }

    public static void main(String[] args) {
        CarRental c1 = new CarRental();
        CarRental c2 = new CarRental("Ravi", "SUV", 5);
        c1.display();
        c2.display();
    }
}
