import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k = 5;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), num = in.nextInt();
        int count = 0;
        int sum = 0;

        while (count < k && countDigits(num) < n) {
            sum += num;
            count++;
            if (count < k) {
                num = in.nextInt();
            }
        }
        double average = 0;
        if (count > 0) {
            average = (double) sum / count;
        }

        System.out.printf("%.2f%n", average);
    }

    public static int countDigits(int num) {
        int count = 0;


        while (num > 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}