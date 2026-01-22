public class NestedLoop {
    public static void main(String[] args) {
        int n = 4;
        // FOR LOOP
       /*

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                System.out.print(j);
            }
            System.out.println();
        } */

      /*  // WHILE LOOPint i = 1;

        while (i <= n) {

            int j = 1;
            while (j <= n) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        } */
/*
        // DO WHILE LOOP:
        int i = 1;

        do {

            int j =1;
            do{
                System.out.print(j);
                j++;
            } while (j<=n);
            System.out.println();
            i++;
        } while (i <= n);
    }
}
*/
        for (int i = 1; i <= n; i++) {
            int j = 1;
            while(j <= 3) {
                int k = 1;
                do {
                    System.out.println(i + " " + j + " " + " "+ k);
                    k++;
                } while(k <= 2);
                j++;
            }
        }
    }
}