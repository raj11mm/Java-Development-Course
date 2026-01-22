public class StaticVar {
    int empid;
    String name;
    static String company = "Google";

    StaticVar(int empid, String name) {
        this.empid = empid;
        this.name = name;
    }

    void display() {
        System.out.println(empid + "  " + name + "   " + company);
    }
}

class Employee {
    public static void main(String[] args) {
        StaticVar e1 = new StaticVar(101, "Raj");
        e1.display();

        StaticVar e2 = new StaticVar(102, "Sundar");
        e2.display();

        StaticVar e3 = new StaticVar(103, "Bill");
        e3.display();

        StaticVar e4 = new StaticVar(104, "Raghu");
        e4.display();
    }

}
