import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        Integer[] numbers1 = {
            1, 3, 5, 7, 2, 10, 28, 17, 19
        };

        Integer[] numbers2 = {
            90, 10, 20, 30, 50
        };

        // mengurutkan ascending 
        Arrays.sort(numbers1);

        // mengurutkan descending 
        Arrays.sort(numbers2, Comparator.reverseOrder());

        System.out.println(Arrays.toString(numbers1));
        System.out.println(Arrays.toString(numbers2));

        Integer[] result = Arrays.copyOf(numbers1, 5);
        Integer[] result2 = Arrays.copyOfRange(numbers1, 5, 7);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result2));

        System.out.println(Arrays.equals(numbers1, numbers2));

    }
    
}