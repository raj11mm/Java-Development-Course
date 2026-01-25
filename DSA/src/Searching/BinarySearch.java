import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int key = sc.nextInt();
        int left = 0;
        int right = arr.length -1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(key == arr[mid]) {
                System.out.println("Key found at index " + mid);
                return;
            }
            if(key < arr[mid]) {
                right = mid-1;
            }
            if(key > arr[mid]) {
                left = mid+1;
            }
        }
        System.out.println("Key not found");
    }
}
