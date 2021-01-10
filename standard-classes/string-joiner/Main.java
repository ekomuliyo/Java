import java.util.StringJoiner;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        StringJoiner stringJoiner = new StringJoiner(", ", "{", "}");

        stringJoiner.add("Eko");
        stringJoiner.add("Muliyo");

        String value = stringJoiner.toString();
        System.out.println(value);
    }
}