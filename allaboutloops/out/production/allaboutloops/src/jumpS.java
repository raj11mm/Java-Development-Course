import java.util.Scanner;
public class jumpS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Number: ");
        int i = 1;
        while(i <= n) {
            if(i % 3 == 0 && i % 5 == 0) {
                continue;
            }
            System.out.print(i+" ");
            i++;
        }
    }

}
