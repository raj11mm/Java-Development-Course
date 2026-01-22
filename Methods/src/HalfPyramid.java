
// WRITE A JAVA METHOD TO PRINT STAR PATTERN USING N NUMBER OF COLUMN

import java.util.Scanner;
public class HalfPyramid {
    static void Pattern(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern(n);
    }

}
