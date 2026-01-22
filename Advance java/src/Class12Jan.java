import java.util.*;

public class Class12Jan {
    public static void main(String[] args) {
       Activity ac1 = new Activity();
       Activity ac2 = new Activity();
       Activity ac3 = new Activity();

       ac1.setName("ADD");
       ac2.setName("CHAR");
       ac3.setName("NUM");

       ac1.start();
       ac2.start();
       ac3.start();
    }
}
class Activity extends Thread {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("ADD")) {
            addition();
        } else if (threadName.equals("CHAR")) {
            printChar();
        } else {
            printNum();
        }
    }
    void addition() {
        System.out.println("Additon activity started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("Addition result is : " + (a+b));
        System.out.println("Addition activity completed:");
    }

    void printChar() {
        System.out.println("Printing activity started:");
        System.out.println("Print char activity started:");
        for(char ch = 'A'; ch <= 'I'; ch++) {
            System.out.println(ch);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("printChar activity completed");
    }

    void printNum() {
        System.out.println("Print num activity started");
        for(int i = 0; i <= 5; i++) {
            System.out.println(i);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("printNum activity completed");
    }
}
