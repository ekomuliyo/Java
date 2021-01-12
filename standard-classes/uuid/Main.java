import java.util.UUID;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        for(var i = 0; i < 100; i++) {
            UUID uuid = UUID.randomUUID();

            String key = uuid.toString();
            System.out.println(key);
        }
    }
}