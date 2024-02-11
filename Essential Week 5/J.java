import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double maxPercentage = 0;

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                int num = in.nextInt(), digCount = 0, divCount = 0;

                int originalNum = num;
                while (num > 0) {
                    int digit = num % 10;
                    if (digit != 0 && originalNum % digit == 0) {
                        divCount++;
                    }
                    digCount++;
                    num /= 10;
                }

                double percentage = divCount * 100.0 / digCount;
                System.out.printf("%.2f%%\n", percentage);

                if (percentage > maxPercentage) {
                    maxPercentage = percentage;
                }
            }

            System.out.printf("(%.2f%%)\n", maxPercentage);
        }
    }
}