public class CharHaldPyramid
{
    public static void main(String[] args) {
        char c;
        char d=67;
        char a;
        for(c=65;c<=d;c++) {
            for(a=65;a<=c;a++)
            {
                System.out.print(a);
            }
            System.out.println();
        }
    }

}