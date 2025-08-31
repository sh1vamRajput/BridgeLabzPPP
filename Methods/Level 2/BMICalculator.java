import java.util.Scanner;

public class BMICalculator {

    static double calcBMI(double weight, double heightCm) {
        double heightM = heightCm / 100;
        return weight / (heightM * heightM);
    }

    static String bmiStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][3];
        String[] status = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) for member " + (i + 1) + ": ");
            members[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) for member " + (i + 1) + ": ");
            members[i][1] = sc.nextDouble();
            members[i][2] = calcBMI(members[i][0], members[i][1]);
            status[i] = bmiStatus(members[i][2]);
        }

        System.out.println("\nWeight | Height | BMI | Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%.1f | %.1f | %.2f | %s\n", members[i][0], members[i][1], members[i][2], status[i]);
        }
    }
}
