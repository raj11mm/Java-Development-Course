import java.util.Scanner;
public class PallindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        // BRUTE FORCE
        //char ch [] = name.toCharArray();
     /*   String rev = "";

        for(int i = name.length()-1; i >= 0; i--) {
            rev += name.charAt(i);
        }

        if(name.equals(rev)) {
            System.out.println("Pallindrome");
        } else {
            System.out.println("Not pallindrome");
        }

      */

        // TWO POINTER APPROACH
        int left = 0;
        int right = name.length() - 1;

        while (left < right) {
            if(name.charAt(left) != name.charAt(right)) {
                System.out.println("Not a pallindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Pallindrome");
    }
}
