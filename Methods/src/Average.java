
import java.util.Scanner;
public class Average {
    static float avg(float x, float y, float z) {
        return (x+y+z)/3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        float res = avg(a,b,c);
        System.out.printf("Average of numbers is: " +  res);
    }
}

