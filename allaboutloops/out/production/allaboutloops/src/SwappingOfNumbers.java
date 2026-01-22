import java.util.Scanner;
public class SwappingOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        // WITH USING THIRD VARIABLE:
        int c = a;
        a = b;
        b = c;

        System.out.println("a " +  a);
        System.out.println("b " + b);

        /* WITHOUT USING THIRD VARIABLE

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a " + a);
        System.out.println("b " + b);
        */


    }
}
