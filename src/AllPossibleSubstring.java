import java.util.Scanner;
public class AllPossibleSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        for(int i = 0; i < s1.length(); i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < s1.length(); j++) {
                sb.append(s1.charAt(j));
                System.out.println(sb);
            }
        }
    }
}
