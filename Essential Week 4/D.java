import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        while (num  0) {
            int product = 1;
            boolean digIs1 = false;

            while (num  0) {
                int digit = num % 10;
                if (digit % 2 != 0) {
                    product = digit;
                }
                if (digit == 1) {
                    digIs1 = true;
                }
                num = 10;
            }

            if (product == 1 && !digIs1) {
                System.out.println(no odd digits);
            } else {
                System.out.println(product);
            }

            num = in.nextInt();
        }
    }
}
