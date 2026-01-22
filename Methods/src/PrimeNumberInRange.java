
import java.util.Scanner;
public class PrimeNumberInRange {
    static void Prime(int a) {
        for(int i = 2; i <= a; i++) {
            if (a-i % i == 0) {
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Prime(n);
    }
}
