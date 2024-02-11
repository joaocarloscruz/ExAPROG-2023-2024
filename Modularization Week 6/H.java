import java.util.Scanner;

public class H {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int attempts = 0;
        boolean palindrome = false;
        while(attempts < 5 && !palindrome){
            int num= in.nextInt();
            if(isPalindrome(num)) {
                System.out.println("palindrome");
                palindrome = true;
            }
            else {
                attempts++;
            }
        }
        if (attempts == 5){
            System.out.println("attempts exceeded");
        }

    }
    public static boolean isPalindrome(int num){
        int reverse = 0, dig, originalNumber = num;
        while (num != 0) {
            dig = num % 10;
            reverse = reverse * 10 + dig;
            num /= 10;
        }
        return originalNumber == reverse;

    }
}