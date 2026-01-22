class Personn {

    int age;
    String name;
    String email;

    void work() {
        System.out.println("Working");
    }

    void sleep() {
        System.out.println("Sleeping");
    }
}

    public class Person {
        public static void main(String[] args) {
            Personn p1 = new Personn();

            p1.age = 23;
            p1.name = "Ram";
            p1.email = "ram@gmail.com";

            System.out.println(p1.age);
            System.out.println(p1.name);
            System.out.println(p1.email);
            p1.work();
            p1.sleep();

        }
    }

