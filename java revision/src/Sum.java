import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        getSum(a,b);
    }
    static void getSum(int x, int y) {
        System.out.println("The sum of " +x+" and " + y + " is " + (x + y)+".");
    }
}

/*import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number: ");
        int b = sc.nextInt();
        int sum = getSum(a,b);
        System.out.println("The sum of " + a + " and " + b + " is " + sum + ".");
    }
    static int getSum(int x, int y) {
        return x + y;
    }
}*/
