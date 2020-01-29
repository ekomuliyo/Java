/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.print(10);
        sample.print(10.5);
        sample.print("String");
    }
}

class Sample{
    
    public void print(int a){
        System.out.println("int  = " + a);
    }

    public void print(double a){
        System.out.println("double = " + a);
    }

    public void print(String a){
        System.out.println("String = " + a);
    }
}