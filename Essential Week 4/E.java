    import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner in= new Scanner(System.in);
            int num = in.nextInt(), dig, exponent = 0, decimal = 0;
            while (num > 0){
                while(num >0) {
                    dig = num % 10;
                    decimal = decimal + dig * (int)Math.pow(8, exponent);
                    exponent = exponent + 1;
                    num = num / 10;
                }
                System.out.println(decimal);
                num = in.nextInt();
                exponent = 0;
                decimal = 0;
            }
        }
    }