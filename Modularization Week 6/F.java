import java.util.Scanner;

public class F {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String solid = "";

        while (!solid.equals("end")) {
            solid = in.next();

            if (solid.equals("sphere")) {
                double radius = in.nextDouble();
                System.out.printf("%.2f%n", volumeSphere(radius));
            }
            if (solid.equals("cone")) {
                double radius = in.nextDouble();
                double height = in.nextDouble();
                System.out.printf("%.2f%n", volumeCone(radius, height));
            }
            if (solid.equals("cylinder")) {
                double radius = in.nextDouble();
                double height = in.nextDouble();
                System.out.printf("%.2f%n", volumeCylinder(radius, height));
            }
        }
    }

    public static double volumeCylinder(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public static double volumeSphere(double radius) {
        return (4.0 /3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static double volumeCone(double radius, double height) {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}