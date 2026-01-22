import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of columns: ");
        int [][] a  = new int[sc.nextInt()][];

        for(int i = 0; i < a.length; i++) {
            System.out.println("Enter the number of columns in " + i + "th row:");
            a[i] = new int [sc.nextInt()];
        }

        System.out.println("Enter the elements: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Required elements are: ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
