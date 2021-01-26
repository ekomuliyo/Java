import java.util.Map;
import java.util.WeakHashMap;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * WeakHashMap merupakan implementasi dari Map.
         * mirip seperti HashMap, namun WeakHashMap akan otomatis menghapus data yang jarang digunakan
         * ketika Garbage Collector berjalan
         */

        Map<Integer, Integer> map = new WeakHashMap<>();
        for(int i = 0; i < 1_000_000; i++) {
            map.put(i, i);
        }

        System.gc();

        System.out.println(map.size());
    }
    
}