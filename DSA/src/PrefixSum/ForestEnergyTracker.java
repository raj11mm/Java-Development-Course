package PrefixSum;
import java.util.*;

public class ForestEnergyTracker {
    public static long[] rangeSumQueries(int[] energy, int[][] queries) {
        // Write your code here
        int[] sum = new int[energy.length];
        sum[0] = energy[0];

        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i] + energy[i - 1];
        }
        return new long[0];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] energy = new int[n];
        for (int i = 0; i < n; i++) {
            energy[i] = sc.nextInt();
        }

        int q = sc.nextInt();
        int[][] queries = new int[q][2];
        for (int i = 0; i < q; i++) {
            queries[i][0] = sc.nextInt();
            queries[i][1] = sc.nextInt();
        }

        long[] result = rangeSumQueries(energy, queries);

        for (long ans : result) {
            System.out.println(ans);
        }
    }
}
