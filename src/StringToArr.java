public class StringToArr {
    public static void main(String[] args) {
        String str1 = "Kodnest Technologies";

        char ch[] = str1.toCharArray();

        for(char i : ch) {
            System.out.println(i);
        }
    }
}
