import java.util.Arrays;
import java.util.Comparator;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        /**
         * comparator untuk membandingkan class yang tidak bisa di ubah 
         * misal class dari library lain 
         * anggap saja contoh class Person dibawah tidak bisa diubah
         */

        Person[] persons = { new Person("Rudi", "Indonesia"), new Person("Eko", "Indonesia"),
                new Person("Andi", "Indonesia") };

        Comparator<Person> comparator = new Comparator<Person>() {

            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
            
        };

        Arrays.sort(persons, comparator);

        System.out.println(Arrays.toString(persons));

    }
    
}

class Person{
    
    private String name;
    private String adderess;

    public Person(String name, String adderess) {
        this.name = name;
        this.adderess = adderess;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdderess() {
        return adderess;
    }

    public void setAdderess(String adderess) {
        this.adderess = adderess;
    }

    @Override
    public String toString() {
        return "Person [adderess=" + adderess + ", name=" + name + "]";
    }
}