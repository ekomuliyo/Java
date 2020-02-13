/**
 * Main
 */

class Sample{
    private int value;

    public void set(int value){
        this.value = value;
    }

    public void print(){
        System.out.println(this.value);
    }
}

public class Main {

    public static void main(String[] args) {
        Sample sample;

        sample = new Sample();
        sample.set(10);
        sample.print();
    }
}