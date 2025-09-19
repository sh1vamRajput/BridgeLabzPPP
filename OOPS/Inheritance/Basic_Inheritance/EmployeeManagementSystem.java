package OOPS.Inheritance.Basic_Inheritance;
// Base class
class Employee {
    protected String name;
    protected int id;
    protected double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display common details
    void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

// Subclass for Manager
class Manager extends Employee {
    private int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

// Subclass for Developer
class Developer extends Employee {
    private String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

// Subclass for Intern
class Intern extends Employee {
    private int durationInMonths;

    Intern(String name, int id, double salary, int durationInMonths) {
        super(name, id, salary);
        this.durationInMonths = durationInMonths;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + durationInMonths + " months");
    }
}

// Main class
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 101, 90000, 5);
        Developer developer = new Developer("Bob", 102, 70000, "Java");
        Intern intern = new Intern("Charlie", 103, 20000, 6);

        System.out.println("Employee Details:\n");

        manager.displayDetails();
        System.out.println();

        developer.displayDetails();
        System.out.println();

        intern.displayDetails();
    }
}
