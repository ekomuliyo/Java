public class Main {
    public static void main(String[] args) {
        
        var shape = new Shape();
        System.out.println(shape.getCorner());

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}

class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 5;
    }

    int getParentCorner() {
        return super.getCorner();
    }
}
