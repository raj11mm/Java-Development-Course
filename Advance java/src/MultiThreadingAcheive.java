import java.util.*;
public class MultiThreadingAcheive {
    public static void main(String[] args) {
        Printing p = new Printing();
        Addition a = new Addition();
        p.start();
        a.start();

    }

    static class Printing extends Thread{
        @Override
        public void run() {
            System.out.println("Printing method started");
            for(int i = 0; i < 5; i++) {
                System.out.println("Kodnest");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Printing method completed");
        }
    }

    static class Addition extends Thread {
        @Override
        public void run() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int a = sc.nextInt();
            System.out.println("Enter the second number:");
            int b = sc.nextInt();
            System.out.println("Addition of both number = " + (a+b));
            System.out.println("Additon method completed.");
        }
    }
}
