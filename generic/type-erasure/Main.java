/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * type erasure adalah menghilangkan informasi generic
         * ini berbahaya dilakukan, karena biasanya akan mengakibatkan error konversi tipe data
         * kode dibawah memang tidak error saat kompilasi, namun ketika runtime akan mengakibatkan error
         */

        Data data = new Data("Eko");

        Data<Integer> integerData = (Data<Integer>) data;
        Integer integer = integerData.getData();

        System.out.println(integer);

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