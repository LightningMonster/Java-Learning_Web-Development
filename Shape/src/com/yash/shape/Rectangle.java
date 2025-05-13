package com.yash.shape;

public class Rectangle extends Shape {
    double length, breadth;

    public Rectangle(String color, double length, double breadth) {
        this.color = color; 
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


