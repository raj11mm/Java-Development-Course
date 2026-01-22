public class StringsMethods {
    public static void main(String[] args) {
        String str1 = "Kodnest Technologies";
        String str2 = "   ";
        String str3 = "";
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.charAt(6));
        System.out.println(str1.endsWith("ies"));
        System.out.println(str1.startsWith("Kod"));
        System.out.println(str1.indexOf(" "));
        System.out.println(str1.lastIndexOf('e'));
        System.out.println(str2.isBlank());
        System.out.println(str3.isEmpty());
        System.out.println(str1.substring(0, 4));
    }
}
