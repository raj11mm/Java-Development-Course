package ExceptionHandling;
import java.util.*;

public class TryBlockWithResource {
    public static void main(String[] args) {
        //Try block with resource
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number");
            int a = sc.nextInt();
            System.out.println("You entered number " + a);
        }
    }
}
