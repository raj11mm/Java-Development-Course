import java.util.Scanner;
public class SumOfMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print table and their sums");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            int product = n*i;
            System.out.printf("%d x %d = %d\n",n, i,product);
             sum = sum+product;
        }
        System.out.println("Sum is :" + sum);

    }
}
