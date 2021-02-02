import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;


/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();

        list.addAll(List.of("Eko", "Muliyo", "Pedamaran", "Palembang"));

        Collections.sort(list);

        Comparator<String> reverse = new Comparator<String>(){

			@Override
			public int compare(String o1, String o2) {
                return o2.compareTo(o1);
			}
        };

        Collections.sort(list, reverse);

        for (var value : list) {
            System.out.println(value);
        }
    }
    
}