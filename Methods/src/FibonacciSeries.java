
// WRITE A PROGRAM TO PRINT N FIBONACCI SERIES USING METHOD

import java.util.Scanner;
public class FibonacciSeries {
    static void Fibo(int n) {
        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++) {
            int fib = a+b;
            System.out.print(fib+" ");
            a = b;
            b = fib;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fibo(n);
    }
}
