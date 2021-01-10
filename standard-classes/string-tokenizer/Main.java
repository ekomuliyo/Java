import java.util.StringTokenizer;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        String value = "Eko Muliyo";

        StringTokenizer stringTokenizer = new StringTokenizer(value, " ");

        while(stringTokenizer.hasMoreElements()) {
            String result = stringTokenizer.nextToken();
            System.out.println(result);
        }
    }
}
