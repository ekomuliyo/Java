/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * wildcard menerima semua parameter type
         * menggunakan keyword <?>
         */

        print(new Data<Integer>(1000));
        print(new Data<String>("Hello"));
        print(new Data<Double>(10.2));

    }

    public static void print(Data<?> data) {
        System.out.println(data.getData());
    }

    public static class Data<T> {
    
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
}