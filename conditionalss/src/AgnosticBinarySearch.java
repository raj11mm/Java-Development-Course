public class AgnosticBinarySearch {
    public static void main (String [] args) {
        int [] arr = {1,3,3,5,11,16,17,29,29,37};
        int target = 16;
        int ans = orderAgnosticBS(arr,  target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find weather the array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // Find the middle element
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if (isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
