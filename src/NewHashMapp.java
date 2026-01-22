import java.util.*;

class Studentinfo {
    int roll;
    String name;
    double marks;

    public Studentinfo(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "[name : " + name + " roll: " + roll + " " + "marks: " + marks + "]";
    }
}


public class NewHashMapp {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        Studentinfo s1 = new Studentinfo(11, "Raj", 89);
        Studentinfo s2 = new Studentinfo(12, "Akash", 88);
        Studentinfo s3 = new Studentinfo(13, "Sonu", -77);

        hm.put(1,s1);
        hm.put(2, s2);
        hm.put(3, s3);

        System.out.println(hm);

        System.out.println("Key are:");
        Set res1 = hm.keySet();
        Iterator itr1 = res1.iterator();

        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        System.out.println("Values are: ");
        Collection res2 = hm.values();
        Iterator itr2 = res2.iterator();

        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }

        System.out.println("Key with values:");
        Set res3 = hm.entrySet();
        Iterator itr3 = res3.iterator();

        while(itr3.hasNext()) {
            System.out.println(itr3.next());
        }

    }
}
