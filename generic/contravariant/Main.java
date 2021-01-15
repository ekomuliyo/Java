/**
 * Main
 */
public class Main {

    /**
     * covariant subtitut parameter type dari parent (super) ke child
     * bersifat read and write, namun read tetap dilakukan dengan hati-hati
     */

    public static void main(String[] args) {

        Data<Object> objectData = new Data<>("Eko");
        // objectData.setData(1000); test error

        Data<? super String> data = objectData;
        process(data);

        System.out.println(objectData.getData());
    }

    public static void process(Data<? super String> data) {

        String value = (String) data.getData();
        Object value2 = data.getData(); 
        System.out.println("Proses parameter 1 : " + value);
        System.out.println("Proses parameter 2 : " + value2);

        data.setData("Eko Muliyo");
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