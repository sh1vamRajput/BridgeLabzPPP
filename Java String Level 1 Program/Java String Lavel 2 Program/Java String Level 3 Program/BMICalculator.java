import java.util.Scanner;

class BMICalculator {

    
    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100; 
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";
        return new String[]{String.format("%.2f", bmi), status};
    }

    
    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0], height = data[i][1];
            String[] bmiData = calculateBMI(weight, height);
            result[i][0] = String.format("%.1f", height);
            result[i][1] = String.format("%.1f", weight);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        return result;
    }

    
    public static void displayTable(String[][] result) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height", "Weight", "BMI", "Status");
        System.out.println("---------------------------------------------");
        for (String[] row : result) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.println("Enter height (cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }
        String[][] result = processBMI(data);
        displayTable(result);
        sc.close();
    }
}
