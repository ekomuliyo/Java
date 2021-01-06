import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    
    public static void main(String[] args) {
        
        try(BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {

            while(true) {
                String lineText = reader.readLine();

                if(lineText == null) {
                    break;
                }
                System.out.println(lineText);
            }
        }catch (Throwable throwable) {
            System.out.println("Error membaca file : " + throwable.getMessage());
        }
    }
}
