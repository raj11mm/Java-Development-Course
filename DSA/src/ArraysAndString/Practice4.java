import java.util.*;
public class Practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        double low = sc.nextDouble();
        double high = sc.nextDouble();
        double target = sc.nextDouble();
        tempFoundAt(arr, low, high, target);
    }
    static void tempFoundAt(double[] arr, double low, double high, double target) {
        
    }
}
