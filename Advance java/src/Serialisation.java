import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Serialisation {
    public static void main(String[] args) {
        String path = "D:\\kodnest\\textFile.txt";
    try {
        Student s1 = new Student(101, "Raj", 24);
        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream pos = new ObjectOutputStream(fos);
        pos.writeObject(s1);

        pos.close();
        fos.close();

        System.out.println("Object saved in file");

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
}
