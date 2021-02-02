import java.util.EmptyStackException;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.Vector;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * Vector mirip seperti ArrayList, namun perilaku nya syncronized thread safe
         * artinya adalah proses akan aman apabila ada 2 proses dalam 1 waktu
         * namun performance akan lambat
         */
        List<String> list = new Vector<>();

        list.add("Eko");
        list.add("Budi");
        list.add("Rudi");
        System.out.println("---Vector---");
        for (var key : list) {
            System.out.println(key);
        }

        /**
         * Hashtable mirip seperti Hashmap, namun perilaku nya syncronized thread safe
         * artinya adalah proses akan aman apabila ada 2 proses dalam 1 waktu
         * namun performance akan lambat
         */
        Map<String, String> list2 = new Hashtable<>();
        System.out.println("---Hashtable---");
        list2.put("Eko", "Eko");
        list2.put("Budi", "Budi");
        list2.put("Rudi", "Rudi");

        for (var key : list2.keySet()) {
            System.out.println(key);
        }

        /**
         * Stack mirip seperti Queue, namun perilaku nya syncronized thread safe
         * artinya adalah proses akan aman apabila ada 2 proses dalam 1 waktu
         * namun performance akan lambat
         */
        Stack<String> stack = new Stack<>();
        stack.push("Eko");
        stack.push("Budi");
        stack.push("Rudi");
        
        System.out.println("---Stack---");
        for (var value = stack.pop(); value != null; value = stack.pop()) {
            try {
                System.out.println(value);
            }catch(EmptyStackException e) {
            }
        }

    }
    
}