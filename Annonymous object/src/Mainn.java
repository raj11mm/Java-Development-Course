class Student {
    int roll;
    String name;
    int age;

    void study() {
        System.out.println("Studying");
    }
    void sleep() {
        System.out.println("Sleeping");
    }
    void eat() {
        System.out.println("eating");
    }
}
public class Mainn {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.roll = 11;
        s1.name ="Raj";
        s1.age = 23;


        System.out.println(s1.roll);
        System.out.println(s1.name);
        System.out.println(s1.age);


        s1.study();
        s1.sleep();
        s1.eat();
        new Student().study();
    }
}