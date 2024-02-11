import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), mostCommonDigits = 0, mcdNum1 = 0, mcdNum2 = 0 ;
        while(n < 0){
            n= in.nextInt();
        }
        for(int i = 1; i <= n; i++) {
            int num1 = in.nextInt(), num2 = in.nextInt();
            if(commonDigits(num1, num2) >= mostCommonDigits ){
                mostCommonDigits = commonDigits(num1, num2);
                mcdNum1 = num1;
                mcdNum2 = num2;

            }

        }
        if(mostCommonDigits == 0){
            System.out.println("no results");}
        else{
            System.out.println(mcdNum1 +"/"+mcdNum2);
        }


    }

    public static int commonDigits(int num1, int num2) {
        int nCommonDig = 0, dig1, dig2;
        while (num1 > 0 && num2 > 0) {
            dig1 = num1 % 10;
            num1 /= 10;
            dig2 = num2 % 10;
            num2 /= 10;
            if(dig1 == dig2){
                nCommonDig++;
            }
        }
        return nCommonDig;

    }
}