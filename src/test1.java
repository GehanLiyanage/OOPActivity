abstract class shape {

    abstract public int getArea();
}

class Rectangle extends shape {
    int length, width;
    @Override
    public int getArea() {
        return (length * width);
    }
}

class Circle extends shape {
    int radius;
    @Override
    public int getArea() {
        return (int)(3.14 * radius * radius);
    }
}

public class test1 {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();

        rectangle.width = 25;
        rectangle.length= 12;

        circle.radius = 14;

        System.out.println("Area Rectangle : " + rectangle.getArea());
        System.out.println("Area Circle : " + circle.getArea());

    }
}


