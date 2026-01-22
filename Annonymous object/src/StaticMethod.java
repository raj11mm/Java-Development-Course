public class StaticMethod {
    int studid;
    String name;
    int standard;
    static String School = "BDPS";

    StaticMethod(int studid, String name, int standard ) {
        this.studid = studid;
        this.name = name;
        this.standard = standard;
    }

    void display() {
        System.out.println(studid + "  " + name + "   " + standard + "  " + School);
    }

    static void method () {
        System.out.println(School + " calls the static method");
    }

    static {
        System.out.println("My name is Raj Shekhar");
    }
}
class Main {
    public static void main(String[] args) {
        StaticMethod s1 = new StaticMethod(11, "Raj", 18);
        s1.display();

        StaticMethod s2 = new StaticMethod(12, "Balu", 19);
        s2.display();

        StaticMethod s3 = new StaticMethod(13, "Raja", 21);
        s3.display();

        StaticMethod s4 = new StaticMethod(14, "RRR", 23);
        s4.display();

        StaticMethod s5 = new StaticMethod(15, "Rohit", 45);
        s5.display();

        StaticMethod.method();
    }
}

