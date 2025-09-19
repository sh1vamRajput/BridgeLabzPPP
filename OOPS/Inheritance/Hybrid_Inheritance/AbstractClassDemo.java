package OOPS.Inheritance.Hybrid_Inheritance;
// Abstract superclass with partial implementation
abstract class Shape {
    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    // Abstract method (must be implemented by subclasses)
    abstract double area();

    // Concrete method (shared by all subclasses)
    void displayColor() {
        System.out.println("Color of shape: " + color);
    }
}

// Subclass providing complete implementation
class Circle extends Shape {
    double radius;

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Another subclass
class Rectangle extends Shape {
    double length, width;

    Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Shape circle = new Circle("Red", 5);
        Shape rectangle = new Rectangle("Blue", 4, 6);

        circle.displayColor();
        System.out.println("Circle area: " + circle.area());

        rectangle.displayColor();
        System.out.println("Rectangle area: " + rectangle.area());
    }
}
