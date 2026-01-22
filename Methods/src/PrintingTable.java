
// WRITE A JAVA METHOD TO PRINT MULTIPLICATION TABLE OF N

import java.util.Scanner;
public class PrintingTable {

    static void multiplicationTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, n * i);

        }
    }

    public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            multiplicationTable(n);
        }
    }


