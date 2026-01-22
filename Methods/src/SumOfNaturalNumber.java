
// WRITE A  METHOD TO FIND THE SU OF FIRST N NATURAL NUMBERS

import java.util.Scanner;
public class SumOfNaturalNumber {
    static int sumOf(int a) {
        int sum = 0;
        for(int i = 1; i <= a; i++) {
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = sumOf(n);
        System.out.println(res);
    }
}
