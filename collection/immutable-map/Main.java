import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        Map<String, String> empty = Collections.emptyMap(); // map kosong
        Map<String, String> singleton = Collections.singletonMap("name", "Eko"); // satu data
        
        // mengubah dari mutable ke immutable
        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Eko");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
        // immutable.put("address", "Pedamaran"); // error

        // membuat langsung mengisi data immutable
        Map<String, String> map = Map.of(
            "first", "Eko",
            "last", "Muliyo"
        );

        // map.put("address", "Pedamaran"); error
    }
    
}