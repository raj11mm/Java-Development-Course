import java.util.Scanner;
public class PrintingSquare {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        square(a);
    }
    static void square(int x) {
        System.out.println("The square of " + x + " is " + (x * x));
    }
}

/*import java.util.Scanner;
public class PrintingSquare {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        int res = square(a);
        System.out.println("The square of " + a + " is " + res);
    }
    static int square(int x) {
        return x*x;
    }
}*/
