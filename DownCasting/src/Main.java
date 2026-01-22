class Parent {
    void display1() {
        System.out.println("Inside parent disp1");
    }

    void display2() {
        System.out.println("Inside parent disp2");
    }
}

class Child1 extends Parent{
    void display2() {
        System.out.println("Inside child1 disp2");
    }
    void display3() {
        System.out.println("Inside child1 disp3");
    }
}

class Child2 extends Parent {
    void display2() {
        System.out.println("Inside child2 disp2");
    }

    void display3() {
        System.out.println("Inside child2 display 3");
    }
}

public class Main {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        accessMethod(c1);
        Child2 c2 = new Child2();
        accessMethod(c2);
    }

    public static void accessMethod(Parent ref) {
        ref.display1();
        ref.display2();

        if(ref instanceof Child1) {
            ((Child1)(ref)).display3();
        }
        else {
            ((Child2)(ref)).display3();
        }
    }
}