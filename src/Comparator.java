import java.util.*;

class Student1 implements Comparable<Student1>
{
    int roll;
    String name;
    double marks;

    Student1(int roll, String name, double marks) {
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return roll + " " + name + " " + marks;
    }

    @Override
    public int compareTo(Student1 obj) {
       /* if(roll > obj.roll) {
            return 1;
        } else if(roll < obj.roll) {
            return -1;
        } else {
            return 1;
        }
        */

        //return this.roll - obj.roll; // for comapring based on roll;

       // return (int)(this.marks - obj.marks); // for comparing based on marks;

        return this.name.compareTo(obj.name); // for comparing based on name;
    }
}

public class Comparator {
    public static void main(String[] args) {
        Student1 s1 = new Student1(21, "Raj", 99.2);
        Student1 s2 = new Student1(12, "Bini", 71.34);
        Student1 s3 = new Student1(13, "Akash", 91.4);

        ArrayList<Student1> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        System.out.println(al);

        Collections.sort(al);

        System.out.println(al);

    }
}
