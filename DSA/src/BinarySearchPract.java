import java.util.*;
public class BinarySearchPract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int key = sc.nextInt();
        bubbleSort(arr, key);
    }

    public static void bubbleSort(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low+high) / 2;
            if(key == arr[mid]) {
                System.out.println(key + " is present at index " + mid);
                return;
            }  if (key < arr[mid]) {
                high = mid - 1;
            } if(key > arr[mid]) {
                low = mid + 1;
            }
        }

       System.out.println("Key not found");
    }
    }

