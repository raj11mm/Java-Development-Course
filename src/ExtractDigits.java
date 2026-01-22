import java.util.*;
public class ExtractDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(char ch: str.toCharArray()) {
            if("0123456789".indexOf(ch) != -1) {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());
    }
}
