import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Eko", "Eko");
        map.put("Rudi", "Rudi");
        map.put("Budi", "Budi");
        map.put("Tuti", "Tuti");

        for(var key : map.keySet()) {
            System.out.println(key);
        }
        
        System.out.println("----lower (kurang dari)----");
        System.out.println(map.lowerKey("Eko"));
        System.out.println("----higher (lebih dari)----");
        System.out.println(map.higherKey("Eko"));
        System.out.println("----floor (kurang dari sama dengan)----");
        System.out.println(map.floorKey("Aan"));
        System.out.println("----ceiling (lebih dari sama dengan)----");
        System.out.println(map.ceilingKey("Aan"));
        
        System.out.println("----descending----");
        NavigableMap<String, String> mapDesc = map.descendingMap();
        for(var key : mapDesc.keySet()) {
            System.out.println(key);
        }
        
        System.out.println("----immutable----");
        NavigableMap<String, String> emptyMap = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(map);
        // immutable.put("Budi", "Budi") // error

    }
    
}