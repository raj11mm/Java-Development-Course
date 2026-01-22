public class ClassAssign {
static int n;
   static  {
        int n = 0;
    }
     {
       System.out.println("No of objects created: ");
    }
    {

        n++;
        System.out.print(n);
    }


}

class Mainnn {
    public static void main(String[] args) {

        ClassAssign a1 = new ClassAssign();
        ClassAssign a2 = new ClassAssign();
    }
}
