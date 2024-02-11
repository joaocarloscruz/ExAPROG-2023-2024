import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num, dig, sum = 0;
        num = in.nextInt();
        while (num > 0) {
            while (num > 0) {
                dig = num % 10;
                if (dig % 2 == 0) {
                    sum = sum + dig;

                }
                num = num / 10;

            }
            System.out.println(sum);
            sum = 0;
            num = in.nextInt();
        }
    }
}