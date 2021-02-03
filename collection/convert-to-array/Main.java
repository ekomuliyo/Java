import java.util.Arrays;
import java.util.List;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        List<String> names = List.of("Eko", "Muliyo", "Palembang");

        Object[] objects = names.toArray();
        String[] strings = names.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));

    }
    
}