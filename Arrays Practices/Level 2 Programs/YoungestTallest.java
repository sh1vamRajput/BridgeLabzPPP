import java.util.Scanner;

class YoungestTallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        int[] heights = new int[3];

        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age and height of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            heights[i] = sc.nextInt();
        }

        
        int minAge = ages[0], minIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                minIndex = i;
            }
        }

        
        int maxHeight = heights[0], maxIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                maxIndex = i;
            }
        }

        System.out.println("Youngest Friend: " + names[minIndex]);
        System.out.println("Tallest Friend: " + names[maxIndex]);

        sc.close();
    }
}
