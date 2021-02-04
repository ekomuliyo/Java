/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        // cara biasa memanggil anonymous class 
        SimpleAction simpleAction = new SimpleAction(){
            @Override
            public String action() {
                return "Eko Muliyo";
            }
        };

        System.out.println(simpleAction.action());
        
        // memanggil anonymous class dengan lamda expression 
        SimpleAction simpleAction2 = () -> "Palembang";

        System.out.println(simpleAction2.action());


    }
    
}

@FunctionalInterface
interface SimpleAction {

    String action();
}