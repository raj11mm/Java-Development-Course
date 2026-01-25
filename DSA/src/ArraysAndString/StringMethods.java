public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("Codnest");
        String s2 = new String("Kodnest");

        System.out.println(s2.compareTo(s1));

        String str1 = new String(" Kodnest techn pvt ltd ");
        System.out.println(str1.trim());
        System.out.println(str1.substring(4));
        System.out.println(str1.substring(3,12));
        System.out.println(str1.substring(str1.length() - 4));
        System.out.println(str1.substring(4, str1.length()-5));

        String Str2 = new String("Raja Rama Mohan Roy");
        System.out.println(Str2.replace('R', 'A'));
        System.out.println(Str2.replaceAll("R", "A"));
        System.out.println(Str2.replaceAll("Ra", "Ju"));

        String[] arr = Str2.split(" ", 3);
        for(String s : arr) {
            System.out.println(s);
        }

        String name = new String("Raj Shekhar");
        char [] arr2 = name.toCharArray();
        for(char x : arr2) {
            System.out.println(x);
        }
    }
}
