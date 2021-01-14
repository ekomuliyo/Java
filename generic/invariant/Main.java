/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * secara default generic di java adalah invariant
         * yaitu sebuah parameter type tidak bisa subtitut ke child atau parent nya
         * 
         * contoh type paramater Object memiliki child String, Integer, Float dll
         * type Object tidak bisa disubtitut ke String, Integer, Float dll
         */

        //  contoh dari child ke parent
        Data<String> stringData = new Data<>("Eko"); // tanda <> boleh dikosongkan bagian new, karena secara default sudah menyesuaikan dengan deklarasi di awal
        // doItString(stringData); // error
        // Data<Object> objectData = stringData; // error
        System.out.println(stringData);

        // contoh dari parent ke child
        Data<Object> objectData = new Data<>(1000);
        // doItInteger(objectData); // error
        // Data<Integer> integerData = objectData; // error
        System.out.println(objectData);
    }

    public static void doItString(Data<Object> objectData) {
    }

    public static void doItInteger(Data<Integer> integerData){
    }

}

class Data<T> {
    
    private T data;

    public Data(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}