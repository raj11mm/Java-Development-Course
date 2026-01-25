import java.util.*;
public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float[] arr = new float[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextFloat();
        }
        float f = sc.nextFloat();
        //float min = arr[0];
        float max = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] <= f && arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
