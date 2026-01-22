public class student {
    public static void main(String[] args) {
       ClassPrac s = new ClassPrac(11, "Raj", 83);
       s.disp();
       System.out.println();
       ClassPrac s2 = new ClassPrac(12, "Ajay", 93);
       s2.disp();
    }
}

 class ClassPrac {
    int roll;
    String name;
    int perc;

    ClassPrac(int a, String b, int c) {
        roll = a;
        name = b;
        perc = c;
    }

    void disp() {
        System.out.println(roll);
        System.out.println(name);
        System.out.println(perc);
    }

}
