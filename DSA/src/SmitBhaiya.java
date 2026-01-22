import java.util.*;
public class SmitBhaiya {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rows = n;
        //int add = n;

        for(int i = 1; i <= n; i++) {
            int temp = i;
            int add = n;
            for(int j = 1; j <= i; j++) {

                System.out.print(temp + " ");
                temp += add;
                add--;
            }

            System.out.println();
        }
    }
}
