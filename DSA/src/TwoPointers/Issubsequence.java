import java.util.*;
public class Issubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        System.out.println(isSubseq(s1, s2));
    }

    public static boolean isSubseq(String s1, String s2) {
        int i = 0;
        int j = 0;

        while(i < s1.length() && j < s2.length()) {
            if(s1.charAt(i) == s2.charAt(j)) {
                i++;
            }
            j++;
        }


        return i == s1.length();
    }
}
