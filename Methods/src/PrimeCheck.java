
import java.util.Scanner;

// USING BOOLEAN STATEMENT

/* public class PrimeCheck {
    static boolean isPrime(int a) {
        for(int i = 2; i<a; i++) {
            if (a % i == 0) {
                return false;
            } else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = isPrime(n);
        System.out.println(res);
    }
}
 */

//  USING PRINT STATEMENT

public class PrimeCheck {
    static void primeNum(int a ) {
        if(a == 1) {
            System.out.println(a + " is not a prime number.");
            return;
        }
        for(int i = 2; i < a; i++) {
            if(a % i == 0) {
                System.out.println(a + " is not a prime number");
                return;
            }
            }
        System.out.println(a + " is a prime number");
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeNum(n);
    }
}