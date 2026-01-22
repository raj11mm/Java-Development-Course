class Studentt {
    int age;
    String name;
    int marks;

    public void study() {
        System.out.println(this.name + " is studying");
    }
    public void eat() {
        System.out.println(this.name + " Student is eating");
    }
    public void  sleep() {
        System.out.println(this.name + " Student is sleeping");
    }
}

public class Student {
    public static void main(String[] args) {
        Studentt s1 = new Studentt();
        s1.age = 23;
        s1.name = "Raj";
        s1.marks = 58;
        ;System.out.println("Student age: " + s1.age);
        System.out.println("Student name: " + s1.name);
        System.out.println("Student marks: " + s1.marks);
        s1.study();
        s1.sleep();
        s1.eat();
        new Studentt();
    }

}
