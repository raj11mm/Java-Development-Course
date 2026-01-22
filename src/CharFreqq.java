import java.util.*;

public class CharFreqq {
    public static void main(String[]  args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[n];

        for(int i = 0; i < arr.length; i++) {
            if(visited[i]) continue;

            int count = 0;
            for(int j = i+1; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] +" " +  count);
            }
        }

    }

