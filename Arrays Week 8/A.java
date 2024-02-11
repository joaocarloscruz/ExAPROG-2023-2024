import java.util.Scanner;

public class A {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        int[] results = writeGrades(n);
        calcAverageAndFailed(n, results);
    }

    public static int[] writeGrades(int n) {
        int[] results = new int[30];
        for (int i = 0; i < n; i++) {
            int result = in.nextInt();
            results[i] = result;
        }
        return results;
    }

    public static void calcAverageAndFailed(int n, int[] results) {
        int sum = 0;
        int failures = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + results[i];
            if (results[i] < 10) {
                failures++;
            }
        }
        double average = (double) sum / n;
        System.out.printf("average=%.1f\n", average);
        System.out.println("failures=" + failures);
    }
}