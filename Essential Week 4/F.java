import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int reverse = 0, dig, originalNumber;
        originalNumber = num;
        while (num != 0) {
            dig = num % 10;
            reverse = reverse * 10 + dig;
            num /= 10;
        }
        if (originalNumber == reverse) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }
}