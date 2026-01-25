import java.util.*;

public class ReversingEachCharinSentenceWithouReversingWOrdOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        String[] arr = str.trim().split("\\s+");
        String finalString = "";


        for(int i = 0; i < arr.length; i++) {
           StringBuilder sb = new StringBuilder(arr[i]);
           sb.reverse();
           finalString = finalString + sb + " ";
        }

        System.out.println(finalString);
    }
}
