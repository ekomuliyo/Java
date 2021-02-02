import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * binary search adalah sebuah algoritman untuk mencari data pada index tertentu dengan cepat
         * syaratnya adalah data sudah terurut (sort)
         * dibandingkan dengan cara biasa, atau melakukan pemeriksaan secara iterasi pada list data
         */

        List<Integer> list = new ArrayList<>(1000);

        for (int i = 0; i <= 1000; i++) {
            list.add(i);
        }

        int index = Collections.binarySearch(list, 333);
        System.out.println(index);

        Comparator<Integer> comparator = new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        // binary search dari belakang atau descending
        int index2 = Collections.binarySearch(list, 333, comparator);
        System.out.println(index2);
    }
    
}