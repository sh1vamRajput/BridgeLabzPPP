package OOPS.Inheritance.Hybrid_Inheritance;
/**
 * Superclass representing a generic Employee.
 * 
 * Subclasses should extend this class to provide specific roles.
 * Critical methods like calculateSalary() should be overridden
 * with the appropriate logic for each type of employee.
 */
class Employee {
    private String name;
    private double baseSalary;

    /**
     * Constructor to initialize an employee.
     * @param name Employee's name
     * @param baseSalary Base salary of the employee
     */
    Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    /**
     * Get the employee's name.
     * @return name of the employee
     */
    public String getName() {
        return name;
    }

    /**
     * Calculate total salary.
     * Subclasses should override this method to include bonuses, allowances, etc.
     * @return total salary
     */
    public double calculateSalary() {
        return baseSalary;
    }
}

/**
 * Subclass representing a Manager.
 * Overrides calculateSalary() to include a bonus.
 */
class Manager extends Employee {
    private double bonus;

    Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    /**
     * Calculate total salary including bonus.
     * Overrides the superclass method.
     * @return total salary
     */
    @Override
    public double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}

public class DocumentedInheritanceDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Shivam", 50000);
        Manager mgr = new Manager("Raj", 60000, 15000);

        System.out.println(emp.getName() + "'s Salary: " + emp.calculateSalary());
        System.out.println(mgr.getName() + "'s Salary: " + mgr.calculateSalary());
    }
}
