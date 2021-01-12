import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        String name = "Eko Muliyo";

        Pattern pattern = Pattern.compile("[a-zA-z]*[i][a-zA-Z]*");
        Matcher matcher = pattern.matcher(name);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }

    }
    
}