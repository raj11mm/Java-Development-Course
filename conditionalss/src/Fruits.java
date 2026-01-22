import java.util.Scanner;

public class Fruits {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the fruit name");
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Red fruit");
                break;
            case "Orange":
                System.out.println("Tangy fruit");
                break;
            case "Grapes":
                System.out.println("Small green fruit");
                break;
            default:
                System.out.println("Please enter the valid fruit name");

            }

        }
    }

