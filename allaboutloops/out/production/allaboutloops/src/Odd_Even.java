import java.util.Scanner;
public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

    int sumOdd= 0;
    int sumEven= 0;

    int n = sc.nextInt();
    int i = 2;

    while ( i <= n) {
        if (i%2 == 0) {
            System.out.print(i + " ");
            sumEven= sumEven + i;
        }
        i++;
    }

    System.out.println("Sum of even Number " + sumEven);

    int j = 1;
    while(j <= n) {
        if ( j%2 != 0) {
            System.out.print(j+" ");
            sumOdd+=j;
        }
        j++;
    }
    System.out.println("Sum of odd number: " + sumOdd);
    }
}
