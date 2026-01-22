
import java.util.Scanner;
public class ReverseNumber {

    static int Reverse (int a) {
        int rem = 0;
        int rev = 0;

        while(a != 0) {
            rem = a % 10;
            rev = rev * 10 + rem;
            a = a / 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rvrs = Reverse(n);
        System.out.println(rvrs);
    }
}
