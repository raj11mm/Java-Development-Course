package ExceptionHandling;

public class StackOverflow {
    public static void main(String[] args) {
        display();

    }

    public static void display() {
        System.out.println("Inside Display");
        try{
            display();
        } catch (Exception e) {
            System.out.println("Handled");
        }
    }
}
