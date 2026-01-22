import java.util.*;
public class Collectionsorting {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(20);
        al.add(35);
        al.add(10);
        al.add(5);
        al.add(51);
        al.add(19);

        System.out.println(al);

        Collections.sort(al);
        System.out.println(al);
    }
}
