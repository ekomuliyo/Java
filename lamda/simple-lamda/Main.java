/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        // cara biasa memanggil anonymous class 
        SimpleAction simpleAction = new SimpleAction(){

            @Override
            public String action(String value) {
                return value;
            }
        };

        System.out.println(simpleAction.action("Andi"));
        
        // memanggil anonymous class dengan lamda expression 
        SimpleAction simpleAction2 = name ->  "Hello " + name;

        System.out.println(simpleAction2.action("Budi"));


    }
    
}

@FunctionalInterface
interface SimpleAction {

    String action(String value);
}