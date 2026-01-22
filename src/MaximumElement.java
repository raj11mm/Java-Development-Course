import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];

        for(int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0];

        for(int i = 0; i < a.length; i++) {
            if(max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
