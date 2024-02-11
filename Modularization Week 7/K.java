import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println("points=" + getDicePoints(num));
    }

    public static int calcReversedNumber(int num) {
        int reverse = 0;

        while (num != 0) {
            int dig = num % 10;
            reverse = reverse * 10 + dig;
            num /= 10;
        }

        return reverse;
    }

    public static int getDicePoints(int num) {
        num = calcReversedNumber(num);
        int previousDig = 0, totalPoints = 0;

        while (num > 0) {
            int currentDig = num % 10;
            num /= 10;
            if (previousDig == currentDig) {
                if (totalPoints < 0) {
                    (totalPoints) = totalPoints - currentDig;
                } else {
                    totalPoints = (totalPoints * -1) - currentDig;
                }
            } else {
                totalPoints += currentDig;
            }

            previousDig = currentDig;
        }

        return totalPoints;
    }
}