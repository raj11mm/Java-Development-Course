import java.util.Scanner;

public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the begining of range");
        int m = sc.nextInt();
        System.out.println("Enter the end of the range");
        int n = sc.nextInt();
        System.out.println("Prime numbers between " + m + " and " + n + " are: ");

        for(int i = m; i <= n; i++) {
            int temp = 0;

            for(int j = 2; j <= i-1; j++) {
                if(i % j == 0) {
                    temp+=1;
                }
            }

            if(temp == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
