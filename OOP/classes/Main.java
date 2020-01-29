/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        Bike bike1, bike2;

        bike1 = new Bike();
        bike2 = new Bike();
        
        bike1.start();
        bike1.start();

        bike1.accelerate(100);
        bike2.accelerate(200);

        bike1.printState();
        bike2.printState();
    }
}

class Bike {
    // Data or attributes
    boolean power;
    int speed;

    // Operator or Methods Or Behavior
    void start(){
        power = true;
        speed = 0;
    }

    void stop(){
        power = false;
        speed = 0;
    }

    void accelerate(int newSpeed){
        speed = newSpeed;
    }

    void printState(){
        System.out.println("Current state");
        System.out.println("Power - " + power);
        System.out.println("Speed - " + speed);
    }
}