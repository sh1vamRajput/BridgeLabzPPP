class Tables6to9 {
    public static void main(String[] args) {
        int[][] multiplicationResult = new int[4][10];

        for (int number = 6; number <= 9; number++) {
            for (int i = 1; i <= 10; i++) {
                multiplicationResult[number - 6][i - 1] = number * i;
                System.out.println(number + " * " + i + " = " + multiplicationResult[number - 6][i - 1]);
            }
            System.out.println("-----------------");
        }
    }
}
