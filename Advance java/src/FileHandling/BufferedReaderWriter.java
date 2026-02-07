package FileHandling;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.Buffer;

public class BufferedReaderWriter {
    public static void main(String[] args) {
        String path1 = "C:\\KodAug\\Input.txt";
        String path2 = "C:\\KodAug\\Output.txt";

        FileReader fr = null;
        FileWriter fw = null;
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            fr = new FileReader(path1);
            fw = new FileWriter(path2);
            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            String data;

            while((data = br.readLine()) != null) {
                bw.write(data);
            }

        } catch(Exception e) {
            e.printStackTrace();

        }

        finally {
            try {
                if(bw != null) bw.close();
                if(br != null) br.close();
                if(fw != null) fw.close();
                if(fr != null) fr.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}
