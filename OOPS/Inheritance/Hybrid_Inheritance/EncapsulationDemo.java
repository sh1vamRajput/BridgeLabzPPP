package OOPS.Inheritance.Hybrid_Inheritance;
// Superclass with private fields
class Employee {
    // Fields are private to prevent direct access
    private String name;
    private double salary;

    // Constructor
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary >= 0) { // Validation
            this.salary = salary;
        }
    }
}

// Subclass
class Manager extends Employee {
    private double bonus;

    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getTotalCompensation() {
        return getSalary() + bonus; // Access superclass fields via getters
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Shivam", 50000, 10000);
        System.out.println(manager.getName() + "'s total compensation: " + manager.getTotalCompensation());

        // Direct access like manager.salary = -1000; is prevented
    }
}

