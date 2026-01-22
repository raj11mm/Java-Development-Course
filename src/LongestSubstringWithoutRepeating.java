import java.util.Scanner;
public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //SLIDING WINDOW APPROACH

        /*
        int[] freq = new int[256];
        int maxLen = 0;
        int left = 0;

        for (int right = 0; right < str.length(); right++) {
             char ch = str.charAt(right);
             freq[ch]++;

             while(freq[ch] > 1) {
                 freq[str.charAt(left)]--;
                 left++;
             }

             int windowLength = right - left + 1;

             if(windowLength > maxLen) {
                 maxLen = windowLength;
             }
        }
        System.out.println(maxLen);

         */

        // BRUTE FORCE
        String longestSub = "";
        int maxLen = 0;

        for(int i = 0; i < str.length(); i++) {
            String currsubstr = "";
            for(int j = i; j < str.length(); j++) {
                char ch = str.charAt(j);
                if(currsubstr.indexOf(ch) == -1) {
                    currsubstr+=ch;
                } else {
                    break;
                }
            }
            if(currsubstr.length() > maxLen) {
                maxLen = currsubstr.length();
            }
        }

        System.out.println("Longest substr length wihtout repeating charcater is: " + maxLen);
    }
}
