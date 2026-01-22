class OS {
    OS() {
        System.out.println("OS is installed");
    }
    void checkOS() {
        System.out.println("OS is still executing");
    }
}

class Charger {
    String name;
    Charger(String s) {
        name = s;
        System.out.println("Charger Created");
    }

    void getCharger() {
        System.out.println("Charger can be utilised");
    }
}

class Mobile {
    OS o = new OS();
    Mobile() {
        System.out.println("Mobile created with OS");
    }
    void hasA(Charger c) {
        System.out.println("Charger acquired and getting charge");
    }
}


public class HasArel {
    public static void main(String[] args) {
        Mobile m = new Mobile();
        Charger c = new Charger("HP");
        m.hasA(c);
        m.o.checkOS();
        c.getCharger();

        m= null;

        //m.o.checkOS();
        c.getCharger();
    }
}


