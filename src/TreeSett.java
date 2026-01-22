import java.util.*;
public class TreeSett {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(20);
        ts.add(75);
        ts.add(170);
        ts.add(25);
        System.out.println(ts);
        System.out.println(ts.headSet(75));
        System.out.println(ts.headSet(75, true));
        System.out.println(ts.tailSet(100, false));
        System.out.println(ts.higher(100));
        System.out.println(ts.higher(80));
        System.out.println(ts.ceiling(75));
        System.out.println(ts.ceiling(55));
        System.out.println(ts.lower(100));
        System.out.println(ts.floor(99));
    }
}
