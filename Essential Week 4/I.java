import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt(), num2 = input.nextInt(), lcm = num1 * num2;
        if (num1 > 0 && num2 > 0) {
            for (int i = 1; i <= lcm; i++) {
                if (i % num1 == 0 && i % num2 == 0) {
                    lcm = i;
                }
            }
        }
        System.out.println(lcm);
    }
}