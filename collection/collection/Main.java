import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Collection adalah parent dari semua collection yang ada di java
         */

        Collection<String> collection = new ArrayList<>();

        collection.add("Eko");
        collection.add("Muliyo");
        collection.addAll(List.of("Palembang", "Kayuagung", "Pedamaran"));

        for(var value : collection) {
            System.out.println(value);
        }

        System.out.println("---------Remove---------");
        collection.remove("Eko");
        collection.removeAll(List.of("Palembang"));

        for(var value : collection) {
            System.out.println(value);
        }

        System.out.println("---------Check Data---------");
        System.out.println(collection.contains("Muliyo"));
        System.out.println(collection.containsAll(List.of("Muliyo", "Pedamaran")));
        
        System.out.println(collection.size());
    }
    
}