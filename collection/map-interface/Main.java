import java.util.HashMap;
import java.util.Map;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Eko");
        map.put("name.last", "Muliyo");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.last"));
    }
    
}