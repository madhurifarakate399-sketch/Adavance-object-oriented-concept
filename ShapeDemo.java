abstract class Shape {
    double length, height;

    Shape(double l, double h) {
        length = l;
        height = h;
    }
 
    abstract void area();
}

class Rectangle extends Shape {
    Rectangle(double l, double h) {
        super(l, h);
    }

    void area() {
        System.out.println("Area of Rectangle: " + (length * height));
    }
}

class Triangle extends Shape {
    Triangle(double l, double h) {
        super(l, h);
    }

    void area() {
        System.out.println("Area of Triangle: " + (0.5 * length * height));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 5);
        Triangle t = new Triangle(8, 6);

        r.area();
        t.area();
    }
}

