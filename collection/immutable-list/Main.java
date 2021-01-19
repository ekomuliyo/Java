import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Main
 */ 
public class Main {
    public static void main(String[] args) {
        
        /**
         * immutable list adalah memungkinkan sebuah list tidak dapat di ubah data-datanya
         * dimana maksdunya adalah kita tidak dapat mengubah data list,
         * akan tetapi kita bisa mengubah isi dari data tersebut,
         * misal ada data person 5, nah kita tidak bisa mengubah 5 data people tersebut
         * namun apabila kita ingin mengubah misal nama atau tanggal lahir dari salah satu data people tsb, hal tersebut dapat dilakukan
         */

        Person person = new Person("Eko");

        person.addHobby("Game");
        person.addHobby("Bola");
        // doSomethingWithHobbies(person.getHobbies());

        for(var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }


        System.out.println("-------Contoh ke 2-------");

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Eko");
        mutable.add("Muliyo");

        List<String> immutable = Collections.unmodifiableList(mutable); // mengubah dari mutable ke immutable
        // immutable.add("Budi");

        // contoh immutable
        List<String> elements = List.of("Eko", "Muliyo");
        // elements.add("Eko");
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan Hobbi");
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

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

}