import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * List dapat menyimpan data duplikasi / sama di list datanya
         * List mempunyai 2 implementasi yaitu ArrayList dan LinkedList
         * ArrayList cocok digunakan untuk memanipulasi data seperti menambah, menghapus, mengambil data
         * LinkedList cocok digunakan jika hanya menambah dan menampilkan data
         */

        List<String> strings = new ArrayList<>(); // default panjang (size) arraylist adalah 10, apabila ingin mengeset panjang cukup masukan seperti berikut ArrayList<>(1000)

        strings.add("Eko");
        strings.add("Muliyo");
        strings.add("Pedamaran");

        strings.set(0, "Andi");
        strings.remove(2);
        System.out.println(strings.get(0));

        for(var value : strings) {
            System.out.println(value);
        }

    }
    
}