import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * Deque memiliki 2 sifat, FIFO dan LIFO
         */

        // LIFO 
        Deque<String> stack = new LinkedList<>();

        stack.offerLast("Eko");
        stack.offerLast("Muliyo");
        stack.offerLast("Pedamaran");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        
        // FIFO
        Deque<String> queue = new LinkedList<>();
        
        queue.offerLast("Eko");
        queue.offerLast("Muliyo");
        queue.offerLast("Pedamaran");
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());
        System.out.println(queue.pollFirst());

    }
    
}