public class Main {
    public static void main(String[] args) {
        
        Child child = new Child();
        child.name = "eko";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);
    }
}

class Parent {
    String name;
    void doIt() {
        System.out.println("Do it in parent");
    }
}

class Child extends Parent {
    String name;
    void doIt() {
        System.out.println("Do it in child");
        System.out.println("Parent name is " + super.name);
    }
}