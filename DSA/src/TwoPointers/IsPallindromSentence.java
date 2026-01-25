import java.util.*;
public class IsPallindromSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println(isPallindrome(s1));
    }

    public static boolean isPallindrome(String s1) {
        int left = 0;
        int right = s1.length() - 1;

        while (left < right) {
            if (!Character.isLetterOrDigit(s1.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s1.charAt(right))) {
                right--;
            } else if(Character.toLowerCase(s1.charAt(left)) != Character.toLowerCase(s1.charAt(right))) {
                return false;
            } else{
                left++;
                right--;
            }
        }
        return true;
    }

}
