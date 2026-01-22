class Studentt {
    int roll;
    String name;
    double perc;

    Studentt(int roll, String name, double perc) {
        this.roll = roll;
        this.name = name;
        this.perc = perc;
    }
        void disp() {
            System.out.println(roll);
            System.out.println(name);
            System.out.println(perc);
        }

    }


public class Shadow {
    public static void main(String[] args) {
        Studentt s1 = new Studentt(1, "Raj", 83.4);
        s1.disp();
    }
}
