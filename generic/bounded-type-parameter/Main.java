/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        /**
         * bounded type parameter adalah membatasi type parameter hanya kelas turununan nya (child)
         * contoh Number, apabila ingin menurunkan generic nya hanya turunan Number saja, (Integer, Float, Long, dll) 
         */
        
        NumberData<Integer> integerNumberData = new NumberData<>(1);
        NumberData<Long> longNumberData = new NumberData<>(10L);

        System.out.println(integerNumberData);
        System.out.println(longNumberData);

        // NumberData<String> stringNumberData = new NumberData<>("Eok"); // error

    }
    
    public static class NumberData<T extends Number> {

        private T data;
    
        public NumberData(T data) {
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