abstract class Parent {
    abstract void disp1();
    abstract void disp2();
}

class Child1 extends Parent {
    void disp1() {
        System.out.println("Inside child1 display 1");
    }

    void disp2() {
        System.out.println("Inside child1 display2");
    }
}

class Child2 extends Parent {
    void disp1() {
        System.out.println("Inside Child2 display 1");
    }
    void disp2() {
        System.out.println("Inside Child2 display2 ");
    }
}

public class Main {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        accessMethod(c1);
        accessMethod(c2);
    }

    public static void accessMethod(Parent ref) {


        if (ref instanceof Child1) {
            ((Child1) ref).disp1();
            ((Child1) ref).disp2();
        } else {
            ((Child2) ref).disp1();
            ((Child2) ref).disp2();
        }
    }
}
