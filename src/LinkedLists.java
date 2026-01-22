import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(2, 99);
        System.out.print(ll);
    }
}
