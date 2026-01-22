public class Jump {
    public static void main(String[] args) {
        int n = 20;
        //BREAK:
      /*  for(int i = 1; i <= n; i++) {
            System.out.println(i);
            if(i == 15) {
                break;
            }
        }

       */
//
//           CONTINUE

        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }



        /*
        for(int i = 1; i <= 10; i++) {
            if (i == 2 || i == 7) {
                continue;
            }
            System.out.println(i);
        }

         */

    }
}
