/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        
        Data<Manager> managerData = new Data<>(new Manager());
        Data<VicePresident> vicePresidentData = new Data<>(new VicePresident());

        System.out.println(managerData);
        System.out.println(vicePresidentData);
    }

    public static interface CanSayHello {
        void sayHello(String name);
    }

    public static abstract class Employee {

    }

    public static class Manager extends Employee implements CanSayHello{

        @Override
        public void sayHello(String name) {
            System.out.println("hello " + name);
        }

    }

    public static class VicePresident extends Employee implements CanSayHello {

        @Override
        public void sayHello(String name) {
            System.out.println("Haii " + name);
        }
    }
    
    public static class Data<T extends Employee & CanSayHello> {

        private T data;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Data(T data) {
            this.data = data;
            this.data.sayHello(data.getClass().getSimpleName());
        }
    }
}