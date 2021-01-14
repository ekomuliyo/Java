/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        Data<String> stringData = new Data<String>("Eko");
        Data<Integer> integerData = new Data<Integer>(10);
        
        System.out.println(stringData.getData());
        System.out.println(integerData.getData());

        Pair<String, Integer> pair = new Pair<String, Integer>("Eko", 1000);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        
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

class Pair<T, U> {

    private T first;

    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public U getSecond() {
        return second;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}