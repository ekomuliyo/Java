import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        NavigableSet<String> names = new TreeSet<>();
        names.addAll(List.of("Eko", "Muliyo", "Pedamaran"));
        for(var name : names) {
            System.out.println(name);
        }

        System.out.println("------Reverse------");
        NavigableSet<String> namesReverse = names.descendingSet();
        for(var name : namesReverse) {
            System.out.println(name);
        }

        System.out.println("------head set------");
        NavigableSet<String> muliyo = namesReverse.headSet("Muliyo", true); // nilai parameter true, memungkin nilai parameter pertama "Muliyo", juga ter include
        for(var name : muliyo){
            System.out.println(name);
        }

        System.out.println("-----tail set-----");
        NavigableSet<String> muliyo2 = namesReverse.tailSet("Muliyo", true);
        for(var name : muliyo2){
            System.out.println(name);
        }

        System.out.println("-----immutable navigable set-----");
        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
        // immutable.add("Budi");

        NavigableSet<String> immutableEmpty = Collections.emptyNavigableSet();

    }
    
}