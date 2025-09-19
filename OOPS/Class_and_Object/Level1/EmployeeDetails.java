package OOPS.Class_and_Object.Level1;

class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp = new Employee("Shivam", 101, 50000);
        emp.displayDetails();
    }
}

