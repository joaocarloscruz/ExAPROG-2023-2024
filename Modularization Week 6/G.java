import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i <= n; i++) {
            if (calcArmstrong(i) == i){
            System.out.println(i);}

        }

    }

    public static int calcDigCount(int num) {
        int digCount = 0;
        while (num > 0) {
            num /= 10;
            digCount++;
        }
        return digCount;
    }

    public static int calcArmstrong(int num) {
        int sum = 0;
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            temp /= 10;
            sum = (int) (sum + Math.pow(digit, calcDigCount(num)));
        }
        return sum;


    }
}