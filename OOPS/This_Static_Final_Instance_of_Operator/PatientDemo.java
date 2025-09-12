package OOPS.This_Static_Final_Instance_of_Operator;

// Hospital Management System demonstrating static, this, final, and instanceof
class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    final String patientID;
    String name, ailment;
    int age;

    Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }

    void displayDetails() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Patient ID: " + patientID);
    }
}

public class PatientDemo {
    public static void main(String[] args) {
        Patient p1 = new Patient("Sonia", 30, "Flu", "P123");
        if (p1 instanceof Patient) {
            p1.displayDetails();
            Patient.getTotalPatients();
        }
    }
}
