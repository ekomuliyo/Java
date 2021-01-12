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
            1, 3, 5, 7, 2, 10, 28, 17, 19
        };

        // membandingkan array
        System.out.println(Arrays.compare(numbers1, numbers2)); // 0 (array sama), 1 (array tidak sama)

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