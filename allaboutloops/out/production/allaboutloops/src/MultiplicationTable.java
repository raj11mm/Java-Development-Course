import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which table you want to print:  ");
        int n = sc.nextInt();
        System.out.println("The table of " + n + " is: ");

        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            System.out.println(n + " x " + i + " = " + product);


        // this code will print multiplication table in reverse order..

       /* for (int i = 10; i > 0; i--) {
            System.out.printf("%d x %d = %d\n", n, i, n * i);*/
        }
    }
}

