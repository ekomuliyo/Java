import java.util.Iterator;
import java.util.List;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        /**
         * Iterable adalah super dari semua interface collection yang bukan map
         */
        
        // Iterable
        Iterable<String> names = List.of("Eko", "Muliyo");
        System.out.println("-----Iterable-----");
        for(var name : names) {
            System.out.println(name);
        }

        // Iterator
        System.out.println("-----Iterator-----");
        Iterator<String> iterator = names.iterator();
        while(iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

    }
    
}