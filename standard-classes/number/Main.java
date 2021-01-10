/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();
        Short shortValue = intValue.shortValue();

        System.out.println(longValue);
        System.out.println(doubleValue);
        System.out.println(shortValue);

        String stringValue = "100.10";
        Double double1 = Double.valueOf(stringValue);
        System.out.println(double1);
    }
    
}
