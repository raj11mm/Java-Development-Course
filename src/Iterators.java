import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(30);
        al.add(35.45);
        al.add("Raj");
        al.add('R');
        al.add(true);
        al.add(30);
        al.add('R');

        Iterator itr = al.iterator();
        System.out.print("[");

        while (itr.hasNext()) {
            System.out.print(itr.next());
            if(itr.hasNext()) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
        /*for(Object x : al) {
            System.out.print(x);
        }

         */
    }
}
