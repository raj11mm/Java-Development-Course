public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Raj";
        String s2 = "Raj";
        String s3 = new String("RaJ");
        String s4 = new String("Raj");

        if(s1 == s2) {
            System.out.println("References are equal");
        } else {
            System.out.println("References are not equal");
        }

        if(s1.equals(s4)) {
            System.out.println("Values are equal");
        } else {
            System.out.println("Values are not equal");
        }
        System.out.println(s1.charAt(2));

        if(s1.equalsIgnoreCase(s3)) {
            System.out.println("s1 and s3 are equal");
        }
        }



    }

