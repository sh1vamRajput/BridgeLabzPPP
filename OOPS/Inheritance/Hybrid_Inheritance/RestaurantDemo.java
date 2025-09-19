package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass: Person
class Person {
    String name;
    int id;

    // Constructor
    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display common details
    void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}

// Interface: Worker (simulates multiple inheritance behavior)
interface Worker {
    void performDuties();  // Must be implemented by Chef and Waiter
}

// Subclass: Chef inherits Person and implements Worker
class Chef extends Person implements Worker {
    String specialty;

    Chef(String name, int id, String specialty) {
        super(name, id);  // Call Person's constructor
        this.specialty = specialty;
    }

    // Unique implementation of performDuties
    @Override
    public void performDuties() {
        System.out.println(name + " (Chef) prepares delicious " + specialty + " dishes.");
    }
}

// Subclass: Waiter inherits Person and implements Worker
class Waiter extends Person implements Worker {
    int tablesAssigned;

    Waiter(String name, int id, int tablesAssigned) {
        super(name, id);  // Call Person's constructor
        this.tablesAssigned = tablesAssigned;
    }

    // Unique implementation of performDuties
    @Override
    public void performDuties() {
        System.out.println(name + " (Waiter) serves " + tablesAssigned + " tables efficiently.");
    }
}

// Driver class to test the system
public class RestaurantDemo {
    public static void main(String[] args) {
        // Create objects of Chef and Waiter
        Chef chef = new Chef("Arjun", 101, "Italian");
        Waiter waiter = new Waiter("Ravi", 201, 5);

        // Display details and perform their duties
        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}

