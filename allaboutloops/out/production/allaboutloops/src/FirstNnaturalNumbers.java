import java.util.Scanner;
public class FirstNnaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int i = 1;
        do {
            System.out.print(i+" ");
            i++;
        } while(i<=n);
    }
}
