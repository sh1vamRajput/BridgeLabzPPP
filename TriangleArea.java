import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double areaCm = 0.5 * base * height;  // in cm²
        double areaInches = areaCm / 6.4516;  // 1 inch² = 6.4516 cm²

        System.out.println("The area of triangle is " + areaCm + " square cm and " + areaInches + " square inches");

        sc.close();
    }
}
