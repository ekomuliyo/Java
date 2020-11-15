public class Main {
    public static void main(String[] args) {
        
        Employee employee = new Employee("Eko");
        employee.sayHello("Andi");

        employee = new Manager("Eko");
        employee.sayHello("Sudarsono");

        employee = new VicePresident("Eko");
        employee.sayHello("Bambang");

        sayHello(new Employee("Eko"));
        sayHello(new Manager("Joko"));
        sayHello(new VicePresident("Budi"));
    }

    static void sayHello(Employee employee) {
        if(employee instanceof VicePresident) {
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + vicePresident.name);
        }
        else if(employee instanceof Manager) {
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + manager.name);
        }
        else {
            System.out.println("Hello " + employee.name);
        }
    }
}


class Employee {
    String name;
    Employee(String name) {
        this.name = name;
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is Employee " + this.name);
    }
}

class Manager extends Employee {
    Manager(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is Manager " + this.name);
    }
}

class VicePresident extends Manager {
    VicePresident(String name) {
        super(name);
    }

    void sayHello(String name) {
        System.out.println("Hi " + name + ", My Name is VP " + this.name);
    }
}