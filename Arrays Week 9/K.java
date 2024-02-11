import java.util.Scanner;

public class K {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        int[] numbers = new int[n];
        readNumbers(numbers);
        displayNonRepeated(numbers);
    }

    private static void displayNonRepeated(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (!isRepeated(numbers, i)) {
                System.out.println(numbers[i]);
            }
        }
    }

    private static boolean isRepeated(int[] numbers, int position) {
        for (int j = 0; j < position; j++) {
            if (numbers[position] == numbers[j]) {
                return true;
            }
        }
        return false;
    }

    private static void readNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();
        }
    }
}