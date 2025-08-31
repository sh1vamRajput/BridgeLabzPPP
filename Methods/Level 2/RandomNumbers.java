public class RandomNumbers {

    public int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = 1000 + (int)(Math.random() * 9000);
        }
        return arr;
    }

    public double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            if (n < min) min = n;
            if (n > max) max = n;
        }
        double avg = (double)sum / numbers.length;
        return new double[] { avg, min, max };
    }

    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        int[] arr = rn.generate4DigitRandomArray(5);

        System.out.print("Numbers: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        double[] results = rn.findAverageMinMax(arr);
        System.out.println("Average: " + results[0]);
        System.out.println("Min: " + results[1]);
        System.out.println("Max: " + results[2]);
    }
}
