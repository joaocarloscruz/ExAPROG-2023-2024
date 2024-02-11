import java.util.Scanner;

public class I {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (isFibonacci(num)) {
            System.out.println("is a Fibonacci number");
        } else {
            System.out.println("is not a Fibonacci number");
        }
    }

    public static boolean isFibonacci(int num) {
        if (num < 0) {
            return false;
        }

        int previous = 0, current = 1;
        if (num == 0 || num == 1) {
            return true;
        }

        while (current < num) {
            int next = previous + current;
            if (next == num) {
                return true;
            }
            previous = current;
            current = next;
        }
        return false;
    }
}