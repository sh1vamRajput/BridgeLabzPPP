import java.util.Scanner;

class CalendarDisplay {

    static String[] months = {"January","February","March","April","May","June",
                              "July","August","September","October","November","December"};
    static int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

    static boolean isLeap(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    static int getFirstDay(int d, int m, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        return (d + x + 31*m0/12) % 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = sc.nextInt();
        System.out.print("Enter year: ");
        int y = sc.nextInt();
        if (m == 2 && isLeap(y)) days[1] = 29;
        int day = getFirstDay(1, m, y);
        System.out.println("   " + months[m-1] + " " + y);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        for (int i = 0; i < day; i++) System.out.print("    ");
        for (int d = 1; d <= days[m-1]; d++) {
            System.out.printf("%3d ", d);
            if (((d + day) % 7 == 0) || (d == days[m-1])) System.out.println();
        }
        sc.close();
    }
}
