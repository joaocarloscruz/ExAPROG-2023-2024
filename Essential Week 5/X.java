import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int clock = in.nextInt();
        if (clock == 1) {
            System.out.println("Tag Heuer");
        }
        else if (clock == 2) {
            System.out.println("Rolex");
        }
        else if (clock == 3) {
            System.out.println("Omega");
        }
        else if (clock == 4) {
            System.out.println("Cartier");
        }
        else if (clock == 5) {
            System.out.println("Bvlgari");
        }
        else if (clock == 6) {
            System.out.println("Raymond Weil");
        } else {
            System.out.println("Invalid brand");
        }
    }


}
