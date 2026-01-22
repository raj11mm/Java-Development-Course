package maps;
import java.util.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Student> classA = new ArrayList<Student>();
        List<Student> classB = new ArrayList<Student>();
        List<Student> classC = new ArrayList<Student>();

        Student s1 = new Student(1, "Akash");
        Student s2 = new Student(2, "Raj");
        Student s3 = new Student(3, "bini");

        classA.add(s1);
        classB.add(s2);
        classC.add(s3);

        Student s4 = new Student(4, "Divya");
        Student s5 = new Student(5, "Sonu");
        Student s6 = new Student(6, "Ritik");

        classA.add(s4);
        classB.add(s5);
        classC.add(s6);

        Student s7 = new Student(7, "Raja");
        Student s8 = new Student(8, "Ramesh");
        Student s9 = new Student(9, "Vivek");

        classA.add(s7);
        classB.add(s8);
        classC.add(s9);

        HashMap<String, List<Student>> hm = new HashMap<String, List<Student>>();

        hm.put("ClassA", classA);
        hm.put("classB", classB);
        hm.put("classC", classC);

        List<Student> classBStudents = hm.get("classB");
        for (Student st : classBStudents) {
            System.out.println(st);
        }

        System.out.println("Getting all the details of all the classes");

        for (String key : hm.keySet()) {
            for (Student st : hm.get(key)) {
                System.out.println(st);
            }
        }
    }
}
