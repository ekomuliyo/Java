package belajar.unit.test;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("a queue")
public class QueueTest {

    private Queue<String> queue;

    @Nested
    @DisplayName("when new")
    public class WhenNew {

        @BeforeEach
        void setUp() {
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("when offer 1, size must be 1")
        void offerOneData() {
            queue.offer("Eko");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName("when offer 2, size must be 2")
        void offerTwoData() {
            queue.offer("Eko");
            queue.offer("Muliyo");
            Assertions.assertEquals(2, queue.size());
        }


    }
}
