import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(), divCount = 0;
        if (num > 0) {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    divCount = divCount + 1;

                }
            }
            if (divCount == 0 & num != 1) {
                System.out.println("prime");
            } else {
                System.out.println("not prime");
            }
        }
    }
}