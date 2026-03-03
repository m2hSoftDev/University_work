// Task3

abstract class Shape {
    abstract double area();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    boolean isSquare() {
        return length == width;
    }
}

class Triangle extends Shape {
    double base, height;
    double a, b, c;

    Triangle(double base, double height, double a, double b, double c) {
        this.base = base;
        this.height = height;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }

    boolean isRightAngled() {
        double x = a * a, y = b * b, z = c * c;
        return (x + y == z) || (x + z == y) || (y + z == x);
    }
}

public class task3 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rect.area());
        if (rect.isSquare())
            System.out.println("This Rectangle is a Square.");
        else
            System.out.println("This Rectangle is not a Square.");

        Triangle tri = new Triangle(13, 7, 9, 40, 41);
        System.out.println("\nTriangle Area: " + tri.area());
        if (tri.isRightAngled())
            System.out.println("This Triangle is a right-angled Triangle.");
        else
            System.out.println("This Triangle is not a right-angled Triangle.");
    }
}