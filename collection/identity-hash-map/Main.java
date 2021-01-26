import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * IdentityHashMap mirip seperti HashMap
         * dimana data di dalamnya tidak bisa duplikasi
         * namun IdentityHashMap apabila ada data yang sama dimasukan, tapi berbeda alamat memori
         * data tersebut bisa dimasukan, karena pembanding nya menggunakan ==, bkn method equals() seperti di HashMap
         */

        Map<String, String> map = new IdentityHashMap<>();

        String key1 = "name.first";

        String name = "name";
        String dot = ".";
        String first = "first";

        String key2 = name + dot + first;

        map.put(key1, "Eko");
        map.put(key2, "Eko");

        System.out.println(map.size());
    }
    
}