package src.com.core03.Java_Basics;

public class P05_Operators {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus

        // 2. Relational (Comparison) Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));   // Equal to
        System.out.println("a != b: " + (a != b));   // Not equal to
        System.out.println("a > b: " + (a > b));     // Greater than
        System.out.println("a < b: " + (a < b));     // Less than
        System.out.println("a >= b: " + (a >= b));   // Greater than or equal
        System.out.println("a <= b: " + (a <= b));   // Less than or equal

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));   // Logical AND
        System.out.println("x || y: " + (x || y));   // Logical OR
        System.out.println("!x: " + (!x));           // Logical NOT

        // 4. Bitwise Operators
        int m = 5, n = 3; // binary: 0101 & 0011
        System.out.println("\nBitwise Operators:");
        System.out.println("m & n = " + (m & n));    // Bitwise AND
        System.out.println("m | n = " + (m | n));    // Bitwise OR
        System.out.println("m ^ n = " + (m ^ n));    // Bitwise XOR
        System.out.println("~m = " + (~m));          // Bitwise Complement
        System.out.println("m << 1 = " + (m << 1));  // Left shift
        System.out.println("m >> 1 = " + (m >> 1));  // Right shift

        // 5. Assignment Operators
        int value = 10;
        System.out.println("\nAssignment Operators:");
        value += 5;  // value = value + 5
        System.out.println("value += 5: " + value);
        value -= 3;
        System.out.println("value -= 3: " + value);
        value *= 2;
        System.out.println("value *= 2: " + value);
        value /= 4;
        System.out.println("value /= 4: " + value);
        value %= 3;
        System.out.println("value %= 3: " + value);

        // 6. Unary Operators
        int num = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("++num = " + (++num));   // Pre-increment
        System.out.println("num++ = " + (num++));   // Post-increment
        System.out.println("--num = " + (--num));   // Pre-decrement
        System.out.println("num-- = " + (num--));   // Post-decrement
        System.out.println("Final num = " + num);

        // 7. Ternary Operator
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("\nTernary Operator:");
        System.out.println("age >= 18 ? \"Adult\" : \"Minor\" = " + result);
    }
}
