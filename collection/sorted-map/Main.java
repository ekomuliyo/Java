import java.util.Collections;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        // Comparator 
        Comparator<String> stringComparator = new Comparator<String>(){

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1); // descending
            }
            
        };
        
        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);

        sortedMap.put("Rudi", "Rudi");
        sortedMap.put("Eko", "Eko");
        sortedMap.put("Budi", "Budi");

        for(var key : sortedMap.keySet()) {
            System.out.println(key);
        }

        // immutable SortedMap
        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutablSortedMap = Collections.unmodifiableSortedMap(sortedMap);
        // immutablSortedMap.put("Eko", "Eko");
    }
    
}