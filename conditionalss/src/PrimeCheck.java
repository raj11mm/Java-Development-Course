import java.util.Scanner;
public class PrimeCheck {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(ans);

    }
    static boolean isPrime (int n) {
        if ( n <= 1) {
            return false;
        }
        int i = 2;
        while( i * i <= n) {
            if( n % i == 0) {
                return false;
            }
            i++;
        }
        if( i * i > n) {
            return true;
        } else {
            return false;
        }
    }
}