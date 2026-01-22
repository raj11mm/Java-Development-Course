import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {23, 86, 18, 46, 25};
        System.out.println("Array before sorting");
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        for(int i = 1; i < 5; i++) {
            int item = arr[i];
            int j = i - 1;

            while(j >= 0 && arr[j] > item) {
                arr[j+1] =arr[j];
                j --;
            }
           arr[j + 1] = item;
        }
        System.out.println();
        System.out.println("Array after sorting");
        for(int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
