import java.util.*;

public class ReversePrintingWithSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
      /*  char[] ch = s1.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left < right) {
            if(ch[left] == ' ') {
                left++;
            } else if (ch[right] == ' ') {
                right--;
            } else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println("Reversed String: " + new String(ch));

       */

        char[] arr1 = s1.toCharArray();
        char[] arr2 = new char[s1.length()];

        for(int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }
        int j = arr2.length-1;

        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != ' ') {
                if(arr2[j] == ' ') {
                    j--;
                }
               arr2[j] = arr1[i];
                j--;
            }
        }

        System.out.println("Reversed String: " + new String(arr2));


    }
}
