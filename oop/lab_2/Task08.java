class Shape {
    public void displayType() {
        System.out.println("Type of shape: Unknown");
    }
}

class Circle extends Shape {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void displayType() {
        System.out.println("Type of shape: Circle");
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void displayType() {
        System.out.println("Type of shape: Rectangle");
    }
}

public class Task08 {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        circle.displayType();
        rectangle.displayType();
    }
}