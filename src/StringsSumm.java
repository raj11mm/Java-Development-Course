public class StringsSumm {
    public static void main(String[] args) {
        int a [] =  {1,2,3,4,5};
        int sum = findSum(a);
        System.out.println(sum);
    }
    public static int findSum(int[]a) {
        int sum = 0;
        for(int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
}
