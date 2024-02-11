import java.util.Scanner;
public class D {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int m = in.nextInt(), n = in.nextInt();
        if( m >= n){
            System.out.println("C("+m+","+n+")=" + combinations(m,n));
            System.out.println("P("+m+","+n+")=" + permutations(m,n));
        }

    }
    public static int factorial( int num){
        int res = 1;
        for(int i = 1; i <= num; i++)
            res = res * i;


        return res;



    }

    public static int combinations(int m, int n){
        int combination;
        combination = (factorial(m) / (factorial(n) * factorial(m-n)));
        return combination;


    }
    public static int permutations(int m, int n){
        int permutation;
        permutation = (factorial(m) / (factorial(m-n)));
        return permutation;

    }
}
