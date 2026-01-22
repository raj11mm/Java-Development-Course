public class EvenDigits {
    public static void main(String [] args) {
        int[] nums = {15,1,123,1116,1718};
        System.out.println(findNumbers(nums));

    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (even(num)) {
                count++;
            }

        }
        return count;
    }
   //function to check weather a number contains even digits or not
     static boolean even(int num) {
        int numberOfDigits = digits(num);
        /*if (numberOfDigits % 2 == 0) {
            return true;
        }
        return false;
*/
        return numberOfDigits % 2 == 0;
    }
    // count number of digits in a number
    static int digits(int num) {
         int count = 0;

         while (num > 0) {
             count++;
             num = num/10;
         }
         return count;
    }
}
