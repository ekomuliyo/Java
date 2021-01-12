import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        // mengambil nilai dari file .properties
        try {
            Properties properties = new Properties();
            
            properties.load(new FileInputStream("./properties/application.properties"));

            String host = properties.getProperty("database.host");
            String user = properties.getProperty("database.user");
            String password = properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(user);
            System.out.println(password);
        } catch (FileNotFoundException e) {
            System.out.println("Filed tidak ditemukan : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Gagal load data dari file : " + e.getMessage());
        }

        // mengisi nilai dari file .properties
        try {
            Properties properties = new Properties();
            properties.put("name.first", "Eko");
            properties.put("name.last", "Muliyo");
            
            properties.store(new FileOutputStream("./properties/name.properties"), "konfigurasi nama");
        } catch (FileNotFoundException e) {
            System.out.println("Filed tidak ditemukan : " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Gagal load data dari file : " + e.getMessage());
        }
    }
    
}