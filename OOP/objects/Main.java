import java.util.LinkedList;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        ShoopingCart shoopingCart = new ShoopingCart();
        shoopingCart.addToCart("apple");
        shoopingCart.addToCart("orange");
        shoopingCart.addToCart("banana");
        shoopingCart.order();
    }
}

class ShoopingCart{
    private LinkedList products = new LinkedList<>();

    public void addToCart(String product){
        products.add(product);
    }

    public void order(){
        System.out.println("Ordered Products");
        System.out.println(products);
    }
}