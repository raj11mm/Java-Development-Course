package ExceptionHandling;

import java.util.Scanner;

public class Ducking {
    public static void main(String[] args) {
        System.out.println("Main Method Started");
        try {
            divide();
        } catch (Exception e) {
            System.out.println("Exception handeled in main method");
        }
        System.out.println("Main method ended");
    }
    static void divide() throws Exception{
        System.out.println("Divide method started");


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a: ");
            int a = sc.nextInt();
            System.out.println("Enter b: ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);

    }
}
