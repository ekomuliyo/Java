import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        /**
         * SortedSet otomatis datanya terurut, bukan terurut berdasarkan data dimasukan
         * data yang disimpan benar-benar terurut (asc, desc)
         * memiliki konkrit implementasi TreeSet
         */

        SortedSet<Person> persons = new TreeSet<>(new PersonComparator().reversed()); // reversed(), untuk membalik urutan data

        persons.add(new Person("Eko"));
        persons.add(new Person("Budi"));
        persons.add(new Person("Andi"));

        for(var person : persons) {
            System.out.println(person.getName());
        }

        // Immutable SortedSet
        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(persons);
        // sortedSet.add(new Person("Rudi")); error
    }
    
}

class PersonComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        /**
         * mengurutkan data nama secara ascending, 
         * jika ingin descending tinggal dibalik saja di method compareTo()
         */
        return o1.getName().compareTo(o2.getName()); 
    }
}

class Person {
    
    private String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}