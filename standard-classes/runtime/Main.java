/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        int dataSize = 1024 * 1024;

        Runtime runtime = Runtime.getRuntime();

        System.out.println(runtime.availableProcessors());
        
        // informasi memory yang di pakai oleh JVM
        System.out.println("Used Memory : " + (runtime.totalMemory() - runtime.freeMemory()) / dataSize + " MB");
        System.out.println("Free Memory   : " + Runtime.getRuntime().freeMemory()/dataSize + " MB");
        System.out.println("Total Memory  : " + Runtime.getRuntime().totalMemory()/dataSize + " MB");
        System.out.println("Max Memory    : " + Runtime.getRuntime().maxMemory()/dataSize + " MB");  
    }
}