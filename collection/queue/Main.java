import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * Queue mempunyai perlakuan FIFO (First In First Out)
         */

        Queue<String> queue = new ArrayDeque<>();
        // Queue<String> queue = new PriorityQueue<>(); // PriorityQueue data otomatis terurut
        // Queue<String> queue = new LinkedList<>();
        
        queue.offer("Eko");
        queue.offer("Pedamaran");
        queue.offer("Muliyo");
        
        for(String next = queue.poll(); next != null; next = queue.poll()){
            System.out.println(next);
        }

        System.out.println(queue.size()); // 0, karna kita menampilkan data mengguakan poll(), mengeluarkan dan menghapus data
    }
    
}