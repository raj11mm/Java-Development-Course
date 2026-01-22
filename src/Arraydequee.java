import java.util.*;

public class Arraydequee {
    public static void main(String[] args) {
        ArrayDeque  ad = new ArrayDeque();
        ad.add(20);
        ad.add(30);
        ad.add(40);
        ad.add(50);
        ad.add(60);
        System.out.println(ad);
        ad.addFirst(78);
        System.out.println(ad);
        ad.addLast(101);
        System.out.println(ad);
        ad.removeFirst();
        System.out.println(ad);
        ad.removeLast();
        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad.peekLast());
        System.out.println(ad.remove());
        System.out.println(ad);
    }
}
