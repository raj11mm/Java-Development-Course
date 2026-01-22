class Student {
    Student() {
        System.out.println("Constructor Executed");
    }

    static {
        System.out.println("staic block executed");
    }

    {
        System.out.println("non static block executed");
    }
}

public class Prog {
    public static void main(String[] args) {
        Student s1 = new Student();

    }
}
