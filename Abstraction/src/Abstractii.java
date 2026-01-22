abstract class Shape {
    abstract void disp1();
    abstract void disp2();
    abstract void disp3();
}

abstract class Square extends Shape {
    void disp1() {
        System.out.println("Child1 disp1 mehtod");
    }

}

public class Abstractii {
    public static void main(String[] args) {
        Shape s1= new Square();
        s1.disp1();
    }
}
