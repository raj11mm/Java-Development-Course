import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;

class Student2 {
    int roll;
    String name;

    Student2(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return roll + " " + name;
    }
}


public class Comparatorr {
    public static void main(String[] args) {
        Student2 s1 = new Student2(11, "Raj");
        Student2 s2 = new Student2(9, "Ram");
        Student2 s3 = new Student2(16, "Bini");

        ArrayList al = new ArrayList();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        System.out.println(al);
       // Helper h = new Helper();
        Collections.sort(al, new Comparator<Student2>() {
            @Override
            public int compare(Student2 obj1, Student2 obj2) {
                return obj1.roll - obj2.roll;
            }
        });

        System.out.println(al);


    }
}
