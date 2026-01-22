import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        if(s1.length() != s2.length()) {
            System.out.println(s1 +  " and " + s2 + " are not roatation");
        }

        String doubled = s1 + s1;
        if(doubled.contains(s2)) {
            System.out.println("Roation");
        } else {
            System.out.println("Not rotation");
        }

    }
}
