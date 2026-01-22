import java.util.ArrayList;

public class ArrayLists {
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
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(3));
        System.out.println(al.contains('R'));
        System.out.println(al.getFirst());
        System.out.println(al.getLast());
        System.out.println(al.indexOf(true));
        System.out.println(al.isEmpty());
        System.out.println(al);
        al.remove(0);
        System.out.println(al);
        System.out.println(al.lastIndexOf(30));
        al.removeFirst();
        System.out.println(al);
        al.set(2, 'K');
        System.out.println(al);
        al.add(2,9);
        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add(100);
        al2.add(10);
        al2.add(101);
        al2.add(10.0);

        al.addAll(al2);
        System.out.println(al);

       for(int i = 0; i < al.size(); i++) {
           System.out.println(al.get(i));
       }

       for( Object x: al) {
           System.out.print(x + " ");
       }

    }
}
