import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * LinkedHashMap memungkinkan menyimpan data secara berurutan
         * namun akan lambat jika ingin mengambil data di posisi tertentu
         * karena harus dilakukan iterasi satu persatu sampai datanya ketemu
         */

        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Eko");
        map.put("last", "Muliyo");
        map.put("address", "Pedamaran");

        Set<String> keys = map.keySet();
        for(var key : keys) {
            System.out.println(key);
        }
    }
}