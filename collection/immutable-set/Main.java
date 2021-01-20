import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * Immutable Set mirip seperti Immutable List
         * memungkinkan sebuah Set tidak dapat di ubah data-datanya
         */

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Eko");

        Set<String> mutable = new HashSet<>();
        mutable.add("Eko");
        mutable.add("Muliyo");
        mutable.add("Pedamaran");
        System.out.println("----Mutable----");
        for(var value : mutable) {
            System.out.println(value);
        }

        // mengubah dari mutable ke immutable
        Set<String> immutable = Collections.unmodifiableSet(mutable);
        // immutable.add("Eko"); // error

        // membuat set immutable langsung mengisi datanya
        Set<String> sets = Set.of("Eko", "Muliyo", "Palembang");
        // set.add("Budi"); // error
        // set.remove("Budi"); // error
        System.out.println("----Immutable----");
        for(var value : sets) {
            System.out.println(value);
        }
    }
    
}