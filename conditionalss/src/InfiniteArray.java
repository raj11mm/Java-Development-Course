public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr ={ 2,4,5,7,11,16,16,23,29,25,111,762};
        int target = 16;
        System.out.println(ans(arr, target));


    }
    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarysearch(arr, target,start,end);
    }
    static int binarysearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;

            } else if ( target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;

            }
        }
        return -1;
    }


}
