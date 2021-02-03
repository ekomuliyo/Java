import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        

        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i <= 100; i++) {
            numbers.add(i);
        }

        System.out.println(numbers);

        System.out.println("----replaceAll----");
        numbers.replaceAll(new UnaryOperator<Integer>(){
            @Override
            public Integer apply(Integer t) {
                return t * 2;
            }
        });
        System.out.println(numbers);
        
        System.out.println("----forEach----");
        numbers.forEach(new Consumer<Integer>(){
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println("----removeIf----");
        numbers.removeIf(new Predicate<Integer>(){
			@Override
			public boolean test(Integer integer) {
                return integer > 40;
			}
        });
        System.out.println(numbers);

        // Default Method Map
        System.out.println("----Default Method Map----");
        Map<String, String> map = new HashMap<>();
        map.put("Eko", "Eko Value");
        map.put("Budi", "Budi Value");
        map.put("Rudi", "Rudi Value");

        System.out.println("----forEach----");
        map.forEach(new BiConsumer<String, String>(){
            @Override
            public void accept(String key, String value) {
                System.out.println("Key : " + key + " Value : " + value);
            }
        });
    }
    
}