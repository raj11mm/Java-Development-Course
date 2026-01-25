import java.util.*;
public class StringBuilderandBuffer {
    public static void main(String[] args) {

        StringBuffer str1 = new StringBuffer("Kodnest");
      str1.append("Tech");
        System.out.println(str1);
        System.out.println(str1.capacity());
        System.out.println(str1.indexOf("t"));
        System.out.println(str1.charAt(7));
        System.out.println(str1.length());
        System.out.println(str1.insert(7, " R"));
        System.out.println(str1.reverse());
        System.out.println(str1.reverse());
        System.out.println(str1.delete(8, 11));
        System.out.println(str1.deleteCharAt(8));

    }
}
