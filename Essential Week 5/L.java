import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), nCount = 0, num = 1, sum = 0;


        while (nCount < n) {
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                System.out.println(num);
                nCount++;
            }
            num++;
            sum = 0;
        }
    }
}