import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[sc.nextInt()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Before sorting: " + Arrays.toString(arr));
        selectionsort(arr);
        System.out.println("After sorting: " + Arrays.toString(arr));
    }

    public static void selectionsort(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n-1; i++) {
            int min = arr[i];
            int pos = i;

            for(int j = i+1; j < n; j++) {
                if(min > arr[j]) {
                    min = arr[j];
                    pos = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
        }
    }
}
