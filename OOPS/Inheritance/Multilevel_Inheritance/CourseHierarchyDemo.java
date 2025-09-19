package OOPS.Inheritance.Multilevel_Inheritance;
// Base class: Course
class Course {
    String courseName; // Name of the course
    int duration;      // Duration in weeks

    // Constructor for Course
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Course: " + courseName + ", Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse extends Course
class OnlineCourse extends Course {
    String platform;    // Platform used for the course
    boolean isRecorded; // Whether the course is recorded

    // Constructor for OnlineCourse
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration); // Call Course constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Override displayDetails to include platform info
    @Override
    void displayDetails() {
        super.displayDetails(); // Use base class method
        System.out.println("Platform: " + platform + ", Recorded: " + isRecorded);
    }
}

// Subclass: PaidOnlineCourse extends OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;       // Course fee
    double discount;  // Discount on the fee

    // Constructor for PaidOnlineCourse
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded); // Call OnlineCourse constructor
        this.fee = fee;
        this.discount = discount;
    }

    // Override displayDetails to include payment info
    @Override
    void displayDetails() {
        super.displayDetails(); // Call OnlineCourse displayDetails
        System.out.println("Fee: ₹" + fee + ", Discount: " + discount + "%");
    }
}

// Test class
public class CourseHierarchyDemo {
    public static void main(String[] args) {
        Course c = new Course("Data Structures", 8);
        OnlineCourse oc = new OnlineCourse("Java Programming", 10, "Udemy", true);
        PaidOnlineCourse pc = new PaidOnlineCourse("Machine Learning", 12, "Coursera", true, 5000.0, 20.0);

        c.displayDetails();
        System.out.println();
        oc.displayDetails();
        System.out.println();
        pc.displayDetails();
    }
}

