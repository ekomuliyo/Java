import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        Map<String, String> map = new HashMap<>();

        map.put("Eko", "Eko value");
        map.put("Budi", "Budi value");
        map.put("Andi", "Andi value");
        map.put("Rudi", "Rudi value");

        // mengambil key dan value di map
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(var entry : entries) {
            System.out.println("Key : " + entry.getKey() +  " Value : " + entry.getValue());
        }
    }
    
}