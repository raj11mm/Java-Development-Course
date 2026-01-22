import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char cr[] = str.toCharArray();
        char revArr[] = new char[cr.length];
        int j = cr.length - 1;

        for(int i = 0; i < cr.length; i++) {
            revArr[j] = cr[i];
            j--;
        }
        String revstr = new String(revArr);
        if(str.equals(revstr)) {
            System.out.println(str + " is pallindrome");
        } else {
            System.out.println(str + " is not pallindrome");
        }
    }
}
