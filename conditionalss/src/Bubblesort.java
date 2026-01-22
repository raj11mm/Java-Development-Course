/*import java.util.Arrays;

/*public class Bubblesort {

    public static void main(String[] args) {
        int[] arr = { -1, -11, 0 , 33, 16, 11};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        // run the steps n-1
        for (int i = 0; i < arr.length; i++) {

            //for each step max item will come at the last respective in others
            for (int j = 1; j < arr.length - i; j++) {
                // swap if the item is smaller than the previous one
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}*/

import java.util.Arrays;
public class Bubblesort {
    public static void main (String[] args) {
        int[] arr = {-45, 64, -12, 0, 176, 98, 74};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble (int [] arr) {
        for ( int i =0; i < arr.length; i++ ) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }

            }
        }
    }


}
.032