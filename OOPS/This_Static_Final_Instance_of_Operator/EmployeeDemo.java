package OOPS.This_Static_Final_Instance_of_Operator;

// Employee Management System demonstrating static, this, final, and instanceof
class Employee {
    static String companyName = "TechCorp";
    static int totalEmployees = 0;
    final int id;
    String name, designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void displayDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 101, "Developer");
        if (e1 instanceof Employee) {
            e1.displayDetails();
            Employee.displayTotalEmployees();
        }
    }
}
