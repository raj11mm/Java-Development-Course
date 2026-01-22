
// WRITE A FUNCTION TO PRINT INVERSE HALF PYRAMID
import java.util.Scanner;
public class InverseHalfPyramid {
    static void HalfPyramid(int a) {
        for(int i = a; i>=1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HalfPyramid(n);
    }
}
