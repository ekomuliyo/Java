public class Main {
    public static void main(String[] args) {
        

        Animal animal = new Cat();
        animal.name = "Cetty";
        animal.run();
    }
}

abstract class Animal {
    public String name;

    public abstract void run();
} 

class Cat extends Animal {

    @Override
    public void run() {
        System.out.println("Cat name " + name + " is running.." );
    }
    
}