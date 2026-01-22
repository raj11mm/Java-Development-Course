/*Given a string, say S, print it in reverse manner eliminating the repeated characters and spaces.

Example 1:

Input: S = "GEEKS FOR GEEKS"
Output: "SKEGROF"

Example 2:

Input: S = "I AM AWESOME"
Output: "EMOSWAI"
 */



import java.util.Scanner;
public class ReverseStringRemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseString(s));
    }

    public static String reverseString(String s) {
        StringBuilder res = new StringBuilder();
        boolean[] seen = new boolean[256];

        for(int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);

            if(ch == ' ') continue;

            if(!seen[ch]) {
                res.append(ch);
                seen[ch] = true;
            }
        }
        return res.toString();
    }
}
