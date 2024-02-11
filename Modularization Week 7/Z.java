import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int lowerLimit = in.nextInt();
        int upperLimit = in.nextInt();

        if (upperLimit < lowerLimit) {
            int temp = lowerLimit;
            lowerLimit = upperLimit;
            upperLimit = temp;
        }

        int count = 0;
        for (int i = lowerLimit; i <= upperLimit; i++) {
            if (isFullTimePrime(i)) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("(" + count + ")");
    }

    public static boolean isFullTimePrime(int number) {
        int digCount = 0, temp = number;
        do {
            temp /= 10;
            digCount++;
        } while (temp > 0);

        temp = number;
        for (int i = 0; i < digCount; i++) {
            temp = temp / 10 + (temp % 10) * (int) Math.pow(10, (digCount - 1));
            if (!isPrime(temp))
                return false;
        }
        return true;
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}