package OOPS.AccessModifiers;
// Demonstration of Access Modifiers with Employee and Manager classes

class Employee {
    public int employeeID;         // Public: Accessible everywhere
    protected String department;   // Protected: Accessible in same package & subclasses
    private double salary;         // Private: Accessible only within this class

    // Constructor
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

// Subclass to demonstrate access to public and protected members
class Manager extends Employee {
    Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void showManagerInfo() {
        System.out.println("Manager ID: " + employeeID);  // Public
        System.out.println("Department: " + department);  // Protected
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        Manager mgr = new Manager(201, "HR", 60000);
        mgr.display();
        mgr.setSalary(65000); // Modifying salary using public method
        mgr.showManagerInfo();
    }
}

