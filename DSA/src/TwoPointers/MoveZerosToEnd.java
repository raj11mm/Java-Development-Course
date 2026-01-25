import java.util.*;
public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] moveZeroes(int[] arr) {
        int [] nums2 = new int[arr.length];
        int left = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                nums2[left] = arr[i];
                left++;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = nums2[i];
        }
        return arr;
    }
}
