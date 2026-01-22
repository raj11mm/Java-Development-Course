

import java.util.*;
public class MultiThreading5 {
    public static void main(String[] args) {
        TeXtEdit te = new TeXtEdit();
        Thread t1 = new Thread(te);
        Thread t2 = new Thread(te);
        Thread t3 = new Thread(te);

        t1.setName("TYPE");
        t2.setName("CHECK");
        t3.setName("SAVE");

        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t2.setDaemon(true);
        t3.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

    }
}

class TeXtEdit implements Runnable{

    public void run() {
        try {
            String threadName = Thread.currentThread().getName();
            if(threadName.equals("TYPE")) {
                type();
            } else if (threadName.equals("CHECK")) {
                spellCheck();
            } else {
                autoSave();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    void type() throws InterruptedException {
        for(int i = 0; i <= 5; i++) {
            System.out.println("Typing....");
            Thread.sleep(6000);
        }
    }

    void spellCheck() throws InterruptedException {
        for(;;) {
            System.out.println("Spell checking....");
            Thread.sleep(3000);
        }
    }

    void autoSave() throws InterruptedException {
        for(;;) {
            System.out.println("Auto Saving...");
            Thread.sleep(3000);
        }
    }
}
