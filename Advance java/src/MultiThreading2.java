import java.util.*;
public class MultiThreading2 {
    public static void main(String[] args) {
    Addition a = new Addition();
    PrintingChar pc = new PrintingChar();
    Printing p = new Printing();
    a.start();
    pc.start();
    p.start();


    }
}

 class Addition extends Thread {
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

 class PrintingChar extends Thread {
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

 class Printing extends Thread {
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
