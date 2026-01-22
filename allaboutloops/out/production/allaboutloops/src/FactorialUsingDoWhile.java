import java.util.Scanner;
public class FactorialUsingDoWhile {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int fact1 = 1;
        int fact2 = 1;

        do {
            fact1 *= i;
            i++;
        } while (i <= a);
        System.out.println("fact of " + a + " is: " +fact1);
        i = 1;
        do {
            fact2 *= i;
            i++;
    }  while (i <= b);
        System.out.println("Fact of " + b  + " is: "+ fact2);

    }
}
