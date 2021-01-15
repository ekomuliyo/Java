/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * covariant subtitut parameter type dari child ke parent (super)
         * bersifat read only, tidak bisa di set datanya
         */

        Data<String> stringData = new Data<>("Eko");
        process(stringData);

        Data<? extends Object> data = stringData;
        System.out.println(data.getData());
    }

    public static void process(Data<? extends Object> data) {
        System.out.println(data.getData());

        // data.setData("Budi"); // error
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