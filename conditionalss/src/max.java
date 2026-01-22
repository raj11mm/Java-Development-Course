

public class max {
    public static void main (String [] args) {
        int[] arr = {11,17,29,16,22};
        System.out.println(maxRange(arr, 1, 4));
    }
    static int maxRange(int[] arr, int start, int end) {
        int maxVal = arr[start];
        for (int i = start; i<= end; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];

   // static int max(int[] arr) {
      //  int maxVal = arr[0];
       // for(int i =1; i < arr.length; i++) {
         //   if (arr[i] > maxVal) {
          //      maxVal = arr[i];
            }

        }
          return maxVal;
    }
}
