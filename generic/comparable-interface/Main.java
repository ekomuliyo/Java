import java.util.Arrays;

/**
 * Main
 */ 
public class Main {
    public static void main(String[] args) {
        
        Person[] persons = {
            new Person("Rudi", "Indonesia"),
            new Person("Eko", "Indonesia"),
            new Person("Andi", "Indonesia")
        };

        /**
         * mengurutkan data person
         * akan error jika class Person tidak implement Comparable
         */
        Arrays.sort(persons);
        System.out.println(Arrays.toString(persons));

        Person person1 = new Person("Rudi", "Indonesia");
        Person person2 = new Person("Rudi", "Indonesia");
        System.out.println(person1.compareTo(person2));


    }
    
}

class Person implements Comparable<Person>{
    
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
    public int compareTo(Person o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Person [adderess=" + adderess + ", name=" + name + "]";
    }
}