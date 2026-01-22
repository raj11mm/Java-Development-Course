public class FindMAx {
    public static void main(String[] args) {
        int[] arr = { 12,16,11,29,17 };
        System.out.println(max(arr));
    }
    static int max(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans) {
                 ans = arr[i];
            }
        }
        return ans;
    }
}
