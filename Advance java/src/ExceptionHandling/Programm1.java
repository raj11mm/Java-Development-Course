package ExceptionHandling;
import java.util.*;

public class Programm1 {
    public static void main(String[] args) {
        System.out.println("onnection started");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of a: ");
            int a = sc.nextInt();
            System.out.println("Enter the value of b: ");
            int b = sc.nextInt();

            int c = a / b;
            System.out.println(c);
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the element to be stored in array");
            int e = sc.nextInt();
            System.out.println("Enter the index at which the element should be stored");
            arr[sc.nextInt()] = e;
            System.out.println("Element has been stored");
        }
         catch (ArithmeticException e) {
            System.out.println("denominator cant be zero");
        } catch(NegativeArraySizeException e) {
            System.out.println("Array size can't be negative");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index cant be greater than array size");
        }
        catch(Exception e) {
            System.out.println("Exception handled");
        }

        System.out.println("Connection terminated");
    }
}
