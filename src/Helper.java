import java.util.Comparator;

public class Helper implements Comparator<Student2> {
    public int compare(Student2 obj1, Student2 obj2) {
       // return obj1.roll - obj2.roll; // for sorting in ascending order
        return obj2.roll - obj1.roll; // for sorting in descending order
    }
}
