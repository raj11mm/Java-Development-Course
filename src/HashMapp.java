import java.util.*;
class Student{
    int roll;
    String name;
    int age;

    Student(int roll, String name, int age) {
        this.roll = roll;
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student[roll = " + roll + "Name = " + name + "Age = " + age + "]";
    }


}



public class HashMapp {
public static void main(String[] args) {
    Student s1 = new Student( 11, "Raj", 23);
    Student s2 = new Student( 12, "Rani", 26);
    Student s3 = new Student(13, "Ram", 45);

    HashMap hm = new HashMap();

    hm.put(1, s1);
    hm.put(2, s2);
    hm.put(3, s3);

    System.out.println(hm);
}
}
