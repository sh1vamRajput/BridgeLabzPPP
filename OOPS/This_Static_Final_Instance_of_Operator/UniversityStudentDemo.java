package OOPS.This_Static_Final_Instance_of_Operator;

// University Student Management demonstrating static, this, final, and instanceof
class Student {
    static String universityName = "Global University";
    static int totalStudents = 0;
    final int rollNumber;
    String name, grade;

    Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}

public class UniversityStudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Neha", 201, "A");
        if (s1 instanceof Student) {
            s1.displayDetails();
            Student.displayTotalStudents();
        }
    }
}
