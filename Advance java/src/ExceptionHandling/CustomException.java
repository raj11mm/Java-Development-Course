package ExceptionHandling;
import java.util.*;
class UnderAgeException extends Exception {
    UnderAgeException() {
        super("You are too young....pls wait");
    }
}

class OverAgeException extends Exception {
    OverAgeException() {
        super("You are too old... Take rest");
    }
}
class DrivingLicense {
int age;
void takeUserAge() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter you age");
    age = sc.nextInt();
}

void verify() throws UnderAgeException, OverAgeException {
    if(age < 18) {
       throw  new UnderAgeException();

    }
    else if(age > 65) {
        OverAgeException oae = new OverAgeException();
        throw oae;
    }

    else {
        System.out.println("Driving license is issued");
    }
}
}

public class CustomException {
    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();
        dl.takeUserAge();

        try {
            dl.verify();
        }/* catch (UnderAgeException u) {
            u.printStackTrace();
        } catch (OverAgeException o) {
            o.printStackTrace();
        } */

        catch (UnderAgeException | OverAgeException e) {
            e.printStackTrace();
        }
    }

}
