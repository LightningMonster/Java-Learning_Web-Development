// Base class
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

// Single Inheritance: AdvancedCalculator inherits Calculator
class AdvancedCalculator extends Calculator {
    int subtract(int a, int b) {
        return a - b;
    }
}

// Multi-Level Inheritance: ScientificCalculator inherits AdvancedCalculator
class ScientificCalculator extends AdvancedCalculator {
    double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}

public class SingleAndMulti_inheri {
    public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println("Add: " + ac.add(10, 5));
        System.out.println("Subtract: " + ac.subtract(10, 5));

        System.out.println("\nMulti-Level Inheritance:");
        ScientificCalculator sc = new ScientificCalculator();
        System.out.println("Add: " + sc.add(2, 3));
        System.out.println("Subtract: " + sc.subtract(10, 4));
        System.out.println("Power: " + sc.power(2, 3));
    }
}
