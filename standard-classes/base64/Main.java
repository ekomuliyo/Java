import java.util.Base64;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        String originalText = "Eko Muliyo";

        // encoded
        String encoded = Base64.getEncoder().encodeToString(originalText.getBytes());
        System.out.println(encoded);

        // decoded
        byte[] bytes = Base64.getDecoder().decode(encoded);
        String resultDecoded = new String(bytes);
        System.out.println(resultDecoded);

    }
}