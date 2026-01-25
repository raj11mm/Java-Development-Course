import java.util.*;
public class Stringg {
    public static void main(String[] args) {
        String s1 = "Kodnest";
        String s2 = "Kodnest";
        char [] arr = {'k', 'o', 'd', 'n', 'e', 's', 't'};
        String s3 = new String(arr);
        String s4 = "Technologies";

         s1 = s2 + s4;
         s2 = s2.concat("Technologies");
         s4 = s2 + s4;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s4);
    }
}
