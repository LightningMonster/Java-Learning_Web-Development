package com.yash.shape;

public class Circle extends Shape {
    double radius;

    public Circle(String color, double radius) {
        this.color = color;  
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


