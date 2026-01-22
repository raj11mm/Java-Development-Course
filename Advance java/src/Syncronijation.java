import java.util.*;
public class Syncronijation {
    public static void main(String[] args) {
        Developer d = new Developer();
        Thread t1 = new Thread(d);
        Thread t2 = new Thread(d);
        Thread t3 = new Thread(d);

        t1.setName("Java Developer");
        t2.setName("Python Developer");
        t3.setName("C Developer");

        t1.start();
        t2.start();
        t3.start();

    }
}

 class Developer implements Runnable {
    @Override
    synchronized public void run() {
        try {
            String threadName = Thread.currentThread().getName();

            System.out.println(threadName + " started printer");
            Thread.sleep(3000);
            System.out.println(threadName + " using printer");
            Thread.sleep(3000);
            System.out.println(threadName + " Stopped using printer");
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
