package ExceptionHandling;
import java.util.*;
public class ManagingExceptionLocally {
    public static void main(String[] args) {
        System.out.println("Main method execution started");
        try {
            divide();
        } catch(Exception e) {
            System.out.println("Divide method exception handeled");
        }
        System.out.println("Main method execution ended");
    }

    static void divide() {
        try {
            System.out.println("Divide method started");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (Exception e) {
            System.out.println("Excception handled");
            throw e;
        }
        finally {
            System.out.println("Divide method ended");
        }
    }
}
