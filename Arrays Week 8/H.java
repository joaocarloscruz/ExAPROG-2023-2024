import java.util.Scanner;

public class H {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = in.nextInt();
        int[] numbers = new int[n];
        fillArray(numbers);
        readCommands(numbers);


    }

    private static void displayArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("[" + numbers[i] + "]");

        }
        System.out.println();
    }

    private static void readCommands(int[] numbers) {
        String command;
        boolean exit = false;
        while (!exit) {
            command = in.next();
            switch (command) {
                case "right":
                    shiftRight(numbers);
                    displayArray(numbers);
                    break;

                case "left":
                    shiftLeft(numbers);
                    displayArray(numbers);
                    break;

                case "exit":
                    exit = true;
                    break;

            }
        }
    }


    private static void shiftLeft(int[] numbers) {
        int firstNumber = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];

        }
        numbers[numbers.length - 1] = firstNumber;
    }

    private static void shiftRight(int[] numbers) {
        int lastNumber = numbers[numbers.length - 1];
        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = lastNumber;

    }

    private static void fillArray(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = in.nextInt();

        }
    }
}