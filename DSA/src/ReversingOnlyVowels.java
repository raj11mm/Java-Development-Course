import java.util.*;
public class ReversingOnlyVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char [] ch  = str.toCharArray();
        char[] ch2 = str.toCharArray();

        int j = ch.length - 1;

        for(int i = 0; i < ch.length; i++) {
            if("aeiouAEIOU".indexOf(ch[i]) != -1) {
                while(j >= 0 && "aeiouAEIOU".indexOf(ch2[j]) == -1) {
                    j--;
                }
                ch2[j] = ch[i];
                j--;
            }
        }

        System.out.println(new String(ch2));

    }
}
