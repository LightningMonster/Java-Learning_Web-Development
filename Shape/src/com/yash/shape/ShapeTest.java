package com.yash.shape;

import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle("Red", radius);
        System.out.println("Circle color: " + circle.getColor());
        System.out.println("Circle area: " + circle.area());

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        Rectangle rectangle = new Rectangle("Yellow", length, breadth);
        System.out.println("Rectangle color: " + rectangle.getColor());
        System.out.println("Rectangle area: " + rectangle.area());

        sc.close();
    }
}

