public class Fibo {
    public static void main(String[] args) {
        int a =0;
        int b = 1;
        int fibo = a+b;

        for (int i = 1; i <= 3; i++) {
            fibo = fibo+i;
            System.out.print(fibo+" ");
        }
    }
}
