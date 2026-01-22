public class Practice {
    public static void main(String[] args) {

        // HALF PYRAMID
        int n = 5;

      /*  for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }  */

        // INVERTED HALF PYRAMID

      /*
      for(int i = n ; i > 0; i--) {
            for( int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

        // FLOYDS TRIANGLE
     /*   int num = 0;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                num++;
                System.out.print(num);
            }
            System.out.println();
        }
        */

        // 0 - 1 Triangle
     /*
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0 ) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
     */

  // INVERTED RIGHT ANGLE TRIANGLE
        /*
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */

     // NUMBER PYRAMID
         /*
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        */

        //BUTTERFLY PATTERN
/*
             //for upper part

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
          // for lower part (just reverse the logic for i):

        for(int i = n; i > 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j<=2*(n-i); j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
*/
        // SOLID RHOMBUS
/*
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
*/
        // DIAMOND PATTERN
   /*            //FOR UPPER HALF
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j <= (2*i)-1; j++ ) {
                System.out.print("* ");
            }
            System.out.println();
        }
            // for lower half (just reverse the logic for i):
        for(int i = n; i > 0; i--) {
            for(int j = 1; j<= n-i; j++) {
                System.out.print("  ");
            }
            for(int j = 1; j<=2*i-1; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
*/
   /*     // PALLINDROMIC PYRAMID

        for(int i = 1; i<=n ; i++) {
            for(int j =1; j<= n-i; j++) {
                System.out.print(" ");
            }
            for(int j = i; j>=1; j--) {
                System.out.print(j);
            }
            for(int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    */
        // CHECKBOARD PATTERM
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if((i + j )% 2 != 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
