/**
 * Main
 */

class Sample {
    static{
        System.out.println("static initializer");
    }
    static{
        System.out.println("static initializer 1");
    }

    {
        System.out.println("non static initializer");
    }
    {
        System.out.println("non static initializer 1");
    }
}
public class Main {

    public static void main(String[] args) {
        Sample sample1 = new Sample();
        Sample sample2 = new Sample();
    }
}