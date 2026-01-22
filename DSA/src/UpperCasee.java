import java.util.*;
public class UpperCasee {
    public static void main(String[] args) {
        String s1 = new String("Kodnest");
        String s2 = new String("Technologies");

        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());

        boolean x = s1.contains("Kod");
        System.out.println(x);

        boolean y = s2.contains("kod");
        System.out.println(y);
        System.out.println(s1.concat(" " +  s2));

        System.out.println(s1.charAt(2));
        System.out.println(s2.charAt(7));
       // System.out.println(s2.charAt(19));    // throw Exception StringIndexOutOfBoundsEception

        System.out.println(s1.indexOf("s"));  // will always gives the first occurence;
        System.out.println(s2.lastIndexOf("e"));

        System.out.println(s2.length());
        System.out.println(s1.startsWith("K"));
        System.out.println(s1.startsWith("Kod"));

        String s4 = " ";
        String s5 = new String("");

        System.out.println(s4.isEmpty()); // false
        System.out.println(s5.isBlank());  // true
        System.out.println(s4.isBlank());  // true
        System.out.println(s5.isEmpty());  // true
    }
}
