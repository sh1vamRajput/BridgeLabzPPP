package OOPS.Inheritance.Hierarchical_Inheritance;
// Superclass: Person
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display common details
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Subclass: Teacher
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        System.out.println("Role: Teacher");
        displayDetails();
        System.out.println("Subject: " + subject);
    }
}

// Subclass: Student
class Student extends Person {
    int grade;

    Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        System.out.println("Role: Student");
        displayDetails();
        System.out.println("Grade: " + grade);
    }
}

// Subclass: Staff
class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        System.out.println("Role: Staff");
        displayDetails();
        System.out.println("Department: " + department);
    }
}

// Test class
public class SchoolSystemDemo {
    public static void main(String[] args) {
        Teacher t = new Teacher("Anita", 35, "Mathematics");
        Student s = new Student("Rahul", 15, 10);
        Staff st = new Staff("Meena", 40, "Administration");

        t.displayRole();
        System.out.println();
        s.displayRole();
        System.out.println();
        st.displayRole();
    }
}

