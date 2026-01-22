import java.util.*;

public class LinearSarch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the keyb to search");
        int k = sc.nextInt();
       if(isKeyPresent(k, arr)) {
           System.out.println( k + " is present in the array");
       } else {
           System.out.println(k + " is not found");
       }
        System.out.println("Index of the key: " + indOfKey(k, arr));

    }

    public static boolean isKeyPresent(int k, int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(k == arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static int indOfKey(int k, int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if(k == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
