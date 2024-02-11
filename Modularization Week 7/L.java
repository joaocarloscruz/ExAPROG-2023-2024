import java.util.Scanner;

public class L {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        System.out.println(getNumberOfWords(sentence));
    }

    public static int getNumberOfWords(String sentence) {
        int numberOfWords = 0;
        boolean isSpace = true;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                isSpace = true;
            } else if (isSpace) {
                numberOfWords++;
                isSpace = false;
            }
        }
        return numberOfWords;
    }
}