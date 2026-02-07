package PrefixSum;

import java.util.*;
public class PrefixSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] preFixSumArr = new int[arr.length];
        preFixSumArr[0] = arr[0];

        for(int i = 1; i < preFixSumArr.length; i++) {
            preFixSumArr[i] = arr[i] + preFixSumArr[i-1];
        }

        for(int x : preFixSumArr) {
            System.out.print(x + " ");
        }
    }
}
