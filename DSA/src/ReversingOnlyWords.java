import java.util.*;
public class ReversingOnlyWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String [] arr = str.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for(int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i] + " ");
        }
        System.out.println(sb.toString());
    }
}
