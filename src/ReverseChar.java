import java.util.Scanner;
public class ReverseChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }
        System.out.println(rev);
        System.out.println(rev.toString().toUpperCase());


        String reverse = rev.toString();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < reverse.length(); i++) {
            char ch = reverse.charAt(i);
            if("aeiouAEIOU".indexOf(ch) != -1) {
                sb.append('*');
            }
            else {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
