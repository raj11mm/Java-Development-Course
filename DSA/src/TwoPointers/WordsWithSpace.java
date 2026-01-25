import java.util.*;
public class WordsWithSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        char[] arr = s1.toCharArray();
        char[] revArr = new char[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == ' ') {
                arr[i] = revArr[i];
            }
        }
        int j = revArr.length-1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != ' ') {
                if(revArr[j] == ' ') {
                    j--;
                }
                revArr[j] = arr[i];
                j--;
            }
            }

        System.out.println(new String(revArr));
        }


    }

