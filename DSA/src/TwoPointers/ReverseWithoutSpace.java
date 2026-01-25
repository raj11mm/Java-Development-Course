import java.util.*;
public class ReverseWithoutSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] ch = str.toCharArray();
        char[] ch2 = new char[ch.length];

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] == ' ') {
                ch2[i] = ch[i];
            }
        }

        int j = ch.length-1;

        for(int i = 0; i < ch.length; i++) {
            if(ch[i] != ' ') {
             while(j >= 0 && ch2[j] == ' ') {
                 j--;
             }
                ch2[j] = ch[i];
                j--;

            }
        }

        System.out.println(new String(ch2));
    }
}
