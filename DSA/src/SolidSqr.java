public class SolidSqr {
    //solid square
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Hollow square
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j<=5; j++) {
                if (i == 1 || j == 1 || i == 5 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        //
        for(int i= 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                if(i == 5 || j == 1  || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }

        for(int i = 5; i > 0; i--) {
            for(int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // HOLLOW PYRAMID

        for(int i = 1; i <= 5; i++) {
            // FOR  INITIAL  SPACES
            for(int j = i; j < 5; j++) {
                System.out.print(" ");
            }

            //FOR STAR AND SPACES
            for(int j = 1; j <= i; j++) {
                if( j==1 || j==i|| i==5) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 5; i >= 1; i--) {
            for(int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 5; i >0; i--) {
            for(int j = i; j<5; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            for(int j = 1; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i <=4; i++) {
            for(int j=4; j>i; j--) {
                System.out.print(" ");
            }
            for(int j = 1; j<=i+1; j++) {
                System.out.print("*");
            }
            for(int j = 1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}





