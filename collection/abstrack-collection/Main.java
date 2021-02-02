import java.util.AbstractQueue;
import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new SingleQueue<>();

        System.out.println(queue.size());
        
        System.out.println(queue.offer("Eko"));
        System.out.println(queue.offer("Budi"));

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        
        System.out.println(queue.size());
    }

}

class SingleQueue<E> extends AbstractQueue<E> {

    private E data;

    @Override
    public boolean offer(E e) {
        if(data == null) {
            data = e;
            return true;
        }
        return false;
    }

    @Override
    public E poll() {
        E temp = data;
        data = null;
        return temp;
    }

    @Override
    public E peek() {
        return data;
    }

    @Override
    public Iterator<E> iterator() {
        return Collections.singleton(data).iterator();
    }

    @Override
    public int size() {
        return data == null ? 0 : 1;
    }

}