package FileHandling;
import java.io.FileReader;
import java.io.FileWriter;

public class FileReadWrite {
    public static void main(String[] args) {
        String path1 = "C:\\KodAug\\Input.txt";
        String path2 = "C:\\KodAug\\Output.txt";

        FileReader fr= null;
        FileWriter fw = null;

        try{
           fr = new FileReader(path1);
           fw = new FileWriter(path2);
           int data;
           while((data = fr.read()) != -1) {
               fw.write(data);
           }
        } catch(Exception e) {
            e.printStackTrace();

        } finally {
            try{
                if(fr != null) fr.close();
                if(fw != null) fw.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
