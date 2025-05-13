import java.util.Scanner;

// Abstract class
abstract class Shape {
    String color;

    // Constructor
    Shape(String color) {
        this.color = color;
    }

    // Abstract methods
    abstract double area();
    abstract String getColor();
}

// Circle class
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

    @Override
    String getColor() {
        return color;
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(String color, double length, double breadth) {
        super(color);
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    double area() {
        return length * breadth;
    }

    @Override
    String getColor() {
        return color;
    }
}

// Main class to test the shapes
public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle("Red", radius);
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.area());
        System.out.println("");
        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        Rectangle rectangle = new Rectangle("Green", length, breadth);
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + rectangle.area());

        sc.close();
    }
}
