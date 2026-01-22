package PACKAGE_NAME;
import java.util.*;
public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        findIndex(arr, target);
    }

    static void findIndex(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.println(target + " found at index " + i);
            }
        }
    }
}
