import java.util.Scanner;
public class SumEven {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want to print Even numbers : ");
        int n = sc.nextInt();
        int sum = 2;
        int i = 2;
        // this program will print even numbers and their sum upto n
      /*  while (i <= n) {
            System.out.print(i+ " ");
            sum = sum+i;
            i+=2;
        }*/

         // This program will print first n number of even numbers and their sum

        while (i <= 2 * n) {
            System.out.print(i+" ");
            sum = sum + i;
            i+=2;
        }
        System.out.println();
        System.out.println("Sum of even numbers is: "+ sum);


    }
}
