import java.util.Scanner;

public class StringbUilder {
    public static void main(String[] args) {
        System.out.println("Enter the first string");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        System.out.println("Enter the 2nd string");
        String s2 = sc.nextLine();
        System.out.println("Enter the third string");
        String s3 = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        System.out.println(sb);
        sb.append(s2);
        System.out.println(sb);
        sb.append(s3);
        System.out.println(sb);
        System.out.println(s1);

    }
}
