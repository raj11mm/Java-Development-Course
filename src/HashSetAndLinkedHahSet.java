import java.util.*;
public class HashSetAndLinkedHahSet {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(75);
        hs.add(125);
        hs.add(175);


        System.out.println(hs);

        LinkedHashSet ls = new LinkedHashSet();
        ls.add(100);
        ls.add(50);
        ls.add(150);
        ls.add(25);
        ls.add(75);
        ls.add(125);
        ls.add(175);

        System.out.println(ls);

    }
}
