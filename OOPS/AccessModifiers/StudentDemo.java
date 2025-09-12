package OOPS.AccessModifiers;
// Demonstration of Access Modifiers with Student and PostgraduateStudent classes

// Student class
class Student {
    public int rollNumber;        // Public: Accessible everywhere
    protected String name;        // Protected: Accessible in same package & subclasses
    private double CGPA;          // Private: Accessible only within this class

    // Constructor
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass to demonstrate protected access
class PostgraduateStudent extends Student {
    PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void showName() {
        // Accessing protected member 'name'
        System.out.println("Postgraduate Student Name: " + name);
    }
}

// Main class
public class StudentDemo {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Rahul", 8.5);
        pg.display();
        pg.setCGPA(9.0); // Modify CGPA using public setter
        pg.showName();
    }
}

