import java.util.Scanner;
/*public class Practice2 {
    public static void main(String[] args) {
        // SWAPPING TWO NUMBERS WITHOUT USING THIRD VARIABLE:
    /*
        int a = 18;
        int b = 45;
         a = a + b;
         b = a - b;
         a = a - b;

        System.out.println("a " + a);
        System.out.println("b " + b);

     */
        /*
      // TAKING INPUT FROM USER AND PRINTING ITS ASCII VALUE
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        int ascii = (int)ch;

        System.out.println(ch +" " + ascii);

         */

        // CONVERTING GIVEN TEMPERATURE IN CELCIUS TO FARHENHITE:
/*
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        float f = (c*9/5) + 32;

        System.out.println(f);

 */
        /*
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        if(num == (int) num) {
            System.out.println(num + " is integer");
        } else {
            System.out.println(num + " is float");
        }

         */
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose shape to calculate area");
        System.out.println("Press 1 for circle");
        System.out.println("Press 2 for Square");
        System.out.println("Press 3 for rectangle");

        int choice = sc.nextInt();

        switch (choice) {
            case 1 : System.out.println("enter the  radius of  circle in cm");

            double radius = sc.nextDouble();
            System.out.println("Area of circle is " + (radius*radius*3.14)+" cm");

            case 2 : System.out.println("Enter the length of side of a square in cm");
            double length = sc.nextDouble();
            System.out.println("Area of Square is: " + length*length+" cm" );

            case 3 : System.out.println("Enter the length and breadth of rectangle in cm");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("Area of rectangle is: " + l*b + " cm");
        }

 *//*
    }
} */

// WRITE A METHOD TO CHECK IF A NUMBER IS PRIME:
        class PrimeCheck{

         static boolean IsPrime(int num) {
             if (num <= 1) {
                 return false;
             }
             for(int i = 2; i <= num-1; i++) {
                 if (num % i == 0) {
                    return false;
                 }
             }
             return true;
         }

         public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         if (IsPrime(n)) {
             System.out.println(n + " is prime number");
            } else {
             System.out.println(n + " is not prime number");
            }
         }

    }





