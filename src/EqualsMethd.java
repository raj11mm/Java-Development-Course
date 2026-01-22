import java.util.*;
class Studentt {
    int roll;
    String name;

    Studentt(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(roll +" "+ name);
    }
    @Override
    public boolean equals(Object obj) {
        Studentt s = (Studentt)obj;
        if(roll == s.roll && name.equals(s.name)) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(roll, name);
    }
    @Override
    public String toString() {
        return roll + " " + name;
    }
}


public class EqualsMethd {
    public static void main(String[] args) {
        Studentt s1 = new Studentt(11, "Raj");
        Studentt s2 = new Studentt(12, "Rajj");
        Studentt s3 = new Studentt(11, "Raj");

        s1.display();
        s2.display();
        s3.display();

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));

        HashSet hs = new HashSet();
        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        System.out.println(hs);

    }
}
