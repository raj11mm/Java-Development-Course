import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Math.max(c, Math.max(b,a));
        System.out.println(max);
    }

}
