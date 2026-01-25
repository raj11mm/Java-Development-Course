import java.util.*;
public class ContainerWithMostWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] height = new int[n];

        for(int i = 0; i < height.length; i++) {
            height[i] = sc.nextInt();
        }

        int result = maxWater(height);
        System.out.println(result);
    }

    public static int maxWater(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right) {
            int width = right - left;
            int currentLength = Math.min(height[left], height[right]);
            int currentArea = width * currentLength;

            if(currentArea > max) {
                max = currentArea;
            } if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
