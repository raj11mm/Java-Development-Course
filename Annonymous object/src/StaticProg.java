public class StaticProg {
    static int a;
    static int b;

    int p;
    int q;

    static {
        System.out.println("Inside static block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("Inside non-static block");
        p = 100;
        q = 200;
    }

    static void disp1() {
        System.out.println("Inside static method");
        System.out.println(a);
        System.out.println(b);
    }

    void disp2() {
        System.out.println("Inside non-static method");
        System.out.println(p);
        System.out.println(q);
    }

    public static void main(String[] args) {
        StaticProg  p = new StaticProg();
        p.disp1();
        p.disp2();

    }
}
