import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Eko", "Muliyo", "Pedamaran", "Palembang", "Eko"));

        System.out.println(list);
        
        Collections.shuffle(list);
        
        System.out.println(list);
        
        // mengambil berapa banyak data yang sama dengan object (filter)
        int index = Collections.frequency(list, "Eko");
        System.out.println(index);
        
    }
    
}