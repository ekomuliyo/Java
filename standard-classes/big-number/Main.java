import java.math.BigInteger;

/**
 * Main
 */
public class Main { 
    public static void main(String[] args) {
        
        BigInteger a = new BigInteger("1000000000000000000000000");
        BigInteger b = new BigInteger("3000000000000000000000000");

        BigInteger c = a.multiply(b);
        System.out.println(c);
    }
}