import java.util.Scanner;

public class J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int tripleCount = calcTripleSum(n);
        System.out.println("triples=" + tripleCount);
    }

    public static int calcTripleSum(int num) {
        int tripleCount = 0;
        for (int n1 = num - 2; n1 >= 1; n1--) {
            for (int n2 = n1; n2 >= 1; n2--) {
                int n3 = num - n1 - n2;
                if (n3 >= 1 && n2 >= n3) {
                    System.out.println(n1 + " + " + n2 + " + " + n3);
                    tripleCount++;
                }
            }
        }

        return tripleCount;
    }
}