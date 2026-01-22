import java.util.Scanner;

public class Nestedswitch {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

       //* switch (empID) {
           // case 1 :
             //   System.out.println("Raj shekhar");
               // break;
            //case 2 :
              //  System.out.println("Akash Shekhar");
                //break;
            //case 3 :
              //  System.out.println("Employee number 3");
                //switch (department) {
               // case "CSE" :
                 //   System.out.println("Cse department");
                   // break;
                //case "IT":
                  //  System.out.println("IT department");
                    //break;
                //default :
                  //  System.out.println("No department entered");

            //}
            //break;
            //default:
              //  System.out.println("Enter valid employe ID");
        //}
        switch (empID) {
            case 1 -> System.out.println("Raj shekhar");
            case 2 -> System.out.println("Akash shekhar");
            case 3 -> {
                System.out.println("employe number 3");

                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "CSE" -> System.out.println("Cse department");
                    default -> System.out.println("No department entered");

                }
            }
            default -> System.out.println("Enter valid emp id");
        }
    }
}
