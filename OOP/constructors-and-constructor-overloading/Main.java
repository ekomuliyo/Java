/**
 * Main
 */
class Sample{
    private int value;

    Sample(){
        value = 10;
    }

    Sample(int x){
        value = x;
    }

    public void print(){
        System.out.println(value);
    }
}

class Complex{
    private double real, img;

    public Complex() {
        real = img = 0;
    }

    public Complex(double r){
        real = r;
        img = 0;
    }

    public Complex(double r, double i){
        real = r;
        img = i;
    }

    public void print(){
        System.out.printf("real = %.2f, img = %.2f\n", real, img);
    }
    
}

public class Main {

    public static void main(String[] args) {
        Sample sample1 = new Sample();
        sample1.print();

        Sample sample2 = new Sample(100);
        sample2.print();

        Complex complex1, complex2, complex3;

        complex1 = new Complex();
        complex2 = new Complex(10.2);
        complex3 = new Complex(10.3, 20.10);

        complex1.print();
        complex2.print();
        complex3.print();
    }
}