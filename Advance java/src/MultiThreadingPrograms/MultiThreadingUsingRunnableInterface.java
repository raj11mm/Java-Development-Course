import java.util.Scanner;

public class MultiThreadingUsingRunnableInterface {
    public static void main(String[] args) {
        System.out.println("Main thread method execution started");
        Additionn a = new Additionn();
        PrintingCharr pc = new PrintingCharr();
        Printingg p = new Printingg();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(pc);
        Thread t3 = new Thread(p);

        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch(Exception e) {
            e.printStackTrace();

        }
        System.out.println("Main thread completed");

    }
}

class Additionn implements Runnable {
    Scanner sc = new Scanner(System.in);
    @Override
    public void run() {
        System.out.println("Printing method started");
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("Addtion result: " + (a+b));
        System.out.println("Additon completed");

    }
}

class PrintingCharr implements Runnable {
    @Override
    public void run() {
        System.out.println("PrintingChar method started:");
        for(char ch = 'A'; ch <= 'I'; ch++) {
            System.out.println(ch);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("PrintingChar method completed");
    }
}

class Printingg implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
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

