import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numLimit = in.nextInt();

        for (int num = 2; num <= numLimit; num++) {
            int divCount = 0;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    divCount++;
                    i = num;
                }
            }
            if (divCount == 0) {
                System.out.println(num);
            }
        }
    }
}