
public class MainClass {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Producer producer = new Producer(factory);
        Consumer consumer = new Consumer(factory);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();

    }
}

class Factory {
    int x;
    boolean isProduced = false;

    synchronized public void setData(int x) {
        if(isProduced == true) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.x = x;
        System.out.println("I have put " + x + " to factory");
        isProduced = true;
        notify();
    }

    synchronized public void getData() {
        if(isProduced == false) {
            try {
                wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("I have taken " + x + " from factory");
        isProduced = false;
        notify();
    }
}

class Producer implements Runnable {
    Factory factory;

    Producer(Factory factory) {
        this.factory = factory;
    }

    @Override
    public void run() {
        int count = 1;

        while(true) {
           factory.setData(count++);
        }
    }
}

class Consumer implements Runnable {
    Factory factory;

    Consumer(Factory factory) {
        this.factory = factory;
    }

    public void run() {

        while(true) {
            try {
                factory.getData();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}