/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        String name = "Eko Muliyo";

        String nameLowerCase = name.toLowerCase();
        String nameUpperCase = name.toUpperCase();

        System.out.println(nameLowerCase);
        System.out.println(nameUpperCase);
        System.out.println(name.length());
        System.out.println(name.startsWith("E"));
        System.out.println(name.endsWith("o"));

        String[] names = name.split(" ");
        for(var value: names) {
            System.out.println(value);
        }
        
        System.out.println(" ".isBlank()); // true
        System.out.println(" ".isEmpty()); // false

        System.out.println(name.charAt(0)); // false
        
        char[] chars = name.toCharArray();
        for(var value: chars) {
            System.out.println(value);
        }


    }
}