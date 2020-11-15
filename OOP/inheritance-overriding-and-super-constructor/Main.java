public class Main {
    public static void main(String[] args) {
        
        var manager = new Manager("Eko");
        manager.sayHello("Andi");

        var vp = new VicePresident("Budi");
        vp.sayHello("Budi Pratama");
    }
}

class Manager {
    String name;
    String company;

    Manager(String name) {
        this.name = name;
    }

    Manager(String name, String company) {
        this.name = name;
        this.company = company;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is Manager " + this.name);
    }
}

class VicePresident extends Manager{

    VicePresident(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is VP " + this.name);
    }
}

