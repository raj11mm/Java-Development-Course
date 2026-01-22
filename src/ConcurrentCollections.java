import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollections {
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

//        for(int x : list) {
//            System.out.print(x + " ");
//            list.add(99);
//        }
//        System.out.println(list);

        Iterator<Integer> itr = list.iterator();

        while(itr.hasNext()) {
            System.out.print(itr.next() + " ");
            list.add(99);
        }

        System.out.println();
        System.out.println(list);
    }
}
