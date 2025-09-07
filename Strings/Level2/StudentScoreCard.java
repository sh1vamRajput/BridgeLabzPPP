import java.util.Scanner;

public class StudentScoreCard {
    
    // Generate random scores for n students
    public static int[][] generateScores(int n) {
        int[][] scores = new int[n][3]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int)(Math.random() * 41) + 60; 
            }
        }
        return scores;
    }

    // Calculate total, average, percentage
    public static double[][] calculateStats(int[][] scores) {
        int n = scores.length;
        double[][] stats = new double[n][3]; 
        for (int i = 0; i < n; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }

    // Display scorecard
    public static void displayScoreCard(int[][] scores, double[][] stats) {
        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s%n", 
                          "Student", "Sub1", "Sub2", "Sub3", "Total", "Percent");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f%n", 
                              (i + 1), scores[i][0], scores[i][1], scores[i][2], 
                              stats[i][0], stats[i][2]);
        }
        System.out.println("-------------------------------------------------------------");
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        
        int[][] scores = generateScores(n);
        double[][] stats = calculateStats(scores);
        
        displayScoreCard(scores, stats);
        
        sc.close();
    }
}
