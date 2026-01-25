import java.util.*;
public class Treeset {
    public static void main(String[] args) {
        int[] arr1 ={1, 2, 3, 4, 4, 5, 5, 7};
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i = 0; i < arr1.length; i++) {
            ts.add(arr1[i]);
        }
        System.out.println(ts);

    }
}
