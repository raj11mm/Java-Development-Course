package ExceptionHandling;

public class StackOverFLowError {
    public static void main(String[] args) {
        display();
    }
        public static void display() {
            System.out.println("Inside display");
            try{
            display();
        } catch (Exception e) {
                System.out.println("Handeled");
            }
    }
    }

