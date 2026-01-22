public class NumberPattern {
    public static void main(String[] args ) {
        System.out.println("Here is the pattern using numbers: ");
        for(int i = 7; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
