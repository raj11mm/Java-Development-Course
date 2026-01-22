import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();

        int max = a;

        if(b > a) {
            max = b;

        }
        if (c > b) {
            max = c;
        }
        // int max = Math.max(c, Math.max(b,a));
        System.out.println("The largest number is: " + max);
    }
}
