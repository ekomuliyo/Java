/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        String[] names = {"Andi", "Budi", "Rudi"};
        Integer[] numbers = {1, 10, 2, 3, 4, 8};

        System.out.println(ArrayHelper.count(names));
        System.out.println(ArrayHelper.count(numbers));

    }
    
}

class ArrayHelper {

    public static <T> int count(T[] data) {
        return data.length;
    }
}