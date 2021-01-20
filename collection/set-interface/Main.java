import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * Set tidak memiliki index, untuk mengakses datanya, harus dilakukan iterasi
         * Set memiliki 3 implementasi HashSet, LinkedHashSet, EnumSet
         * HashSet memiliki sifat data yang dimasukan tidak menjamin terurut
         * LinkedHashSet memiliki sifat data yang dimasukan terurut
         * EnumSet adalah Set element yang data nya berbentuk Enum
         */

        Set<String> names = new HashSet<>();
        names.add("Eko");
        names.add("Muliyo");
        names.add("Eko");
        names.add("Muliyo");
        System.out.println("----HashSet----");
        for(var name : names) {
            System.out.println(name);
        }

        Set<String> addresses = new LinkedHashSet<>();
        addresses.add("Palembang");
        addresses.add("Kayuagung");
        addresses.add("Pedamaran");
        System.out.println("----LinkedHashSet----");
        for(var address : addresses) {
            System.out.println(address);
        }

        Set<Gender> genders = EnumSet.allOf(Gender.class);
        System.out.println("----EnumSet----");
        for(var gender : genders) {
            System.out.println(gender);
        }

        Gender[] values = Gender.values();
        for(var value : values) {
            System.out.println(value);
        }

    }
    
    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }
}