import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        double angleAB = calcAngle(a, b, c);
        double angleAC = calcAngle(a, c, b);
        double angleBC = calcAngle(b, c, a);
        if (a + b > c && a + c > b && b + c > a && a > 0 && b > 0 && c > 0) {
            System.out.printf("a=" + "%.2f\n", a);
            System.out.printf("b=" + "%.2f\n", b);
            System.out.printf("c=" + "%.2f\n", c);
            System.out.printf("ang(a,b)="+ "%.2f\n", angleAB);
            System.out.printf("ang(a,c)="+ "%.2f\n", angleAC);
            System.out.printf("ang(b,c)="+ "%.2f\n", angleBC);
        }
        else{
            System.out.println("impossible");
        }

    }

    public static double calcAngle(double a, double b, double c) {
        double radianAngle = Math.acos((Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b));
        double angle = Math.toDegrees(radianAngle);
        return angle;


    }
}