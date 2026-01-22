import java.util.*;
public class RemovingSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        StringBuilder sb = new StringBuilder();

        for(char ch: s1.toCharArray()) {
            if(ch == ' ') continue;
            sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}
