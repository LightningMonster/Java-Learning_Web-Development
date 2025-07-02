package src.com.core03.Java_Basics;

public class P10_Relational_and_Logical_Operators {
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Relational Operators
        System.out.println("a == b: " + (a == b));  // false
        System.out.println("a != b: " + (a != b));  // true
        System.out.println("a < b: " + (a < b));    // true
        System.out.println("a > b: " + (a > b));    // false

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("x && y: " + (x && y));  // false
        System.out.println("x || y: " + (x || y));  // true
        System.out.println("!x: " + (!x));          // false
    }
}
