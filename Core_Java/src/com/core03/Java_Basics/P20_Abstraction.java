package src.com.core03.Java_Basics;

public class P20_Abstraction {
    public static void main(String[] args) {

        Shape s = new Square();
        s.draw();

        Circle c = new Circle();
        c.draw();

    }

    // Abstract Class
    static abstract class Shape{
        abstract void draw();
    }

    static class Square extends Shape{
        @Override
        void draw() {
            System.out.println("Drawing Square...");
        }
    }

    // Interface
    interface Drawable {
        void draw();
    }

    static class Circle implements Drawable {
        public void draw(){
            System.out.println("Drawing Circle...");
        }
    }
}
