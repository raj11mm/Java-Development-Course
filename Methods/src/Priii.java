import java.util.Scanner;

public class Priii {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if (n <= 1) {
                System.out.println(n + " is not a prime number");
                return;
            }

            for (int i = 2; i < n; i++) {
                if (n % i == 0 && n != 2) {
                    System.out.println(n + " is not a prime number");
                    return;
                }
            }

            System.out.println(n + " is a prime number");
        }
    }

