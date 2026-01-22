package maps;
import java.util.*;

public class GarbageCollection {
    public static void main(String[] args) {
        WeakHashMap<String, String> hm = new WeakHashMap();
        String key1 = new String("key1");
        String key2 = new String("key2");

        hm.put(key1, "Value1");
        hm.put(key2, "Value2");

        System.out.println(hm);

        key1 = null;
        System.gc(); 
        System.out.println(hm);


    }
}
