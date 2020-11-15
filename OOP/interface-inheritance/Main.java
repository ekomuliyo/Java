public class Main {
    public static void main(String[] args) {
        
        Car car = new Avanza();
        System.out.println(car.getTier());
        car.drive();
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());
        System.out.println(car.isBig());
    }
}

interface Car extends HasBrand, Maintenance {
    void drive();
    
    int getTier();

    default boolean isBig() {
        return false;
    }
}

interface HasBrand {
    String getBrand();
}

interface Maintenance {
    boolean isMaintenance();
}

class Avanza implements Car {

    public void drive() {
        System.out.println("Avanza drive");
    }

    public int getTier() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}

class Bus implements Car {

    public String getBrand() {
        return "Hino";
    }

    public boolean isMaintenance() {
        return false;
    }

    public void drive() {
        System.out.println("Bus drive");
    }

    public int getTier() {
        return 8;
    }
    
    public boolean isBig() {
        return true;
    }
}