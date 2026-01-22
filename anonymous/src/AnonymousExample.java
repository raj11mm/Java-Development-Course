
interface ProgramInterface {
    void display();
}


public class AnonymousExample {
    public static void main(String[] args) {
        ProgramInterface p = () -> {
            System.out.println("Inside display");
        };

        p.display();
    }
}
