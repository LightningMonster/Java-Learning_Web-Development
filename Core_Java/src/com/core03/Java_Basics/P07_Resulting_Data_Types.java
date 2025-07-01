package src.com.core03.Java_Basics;

public class P07_Resulting_Data_Types {
    public static void main(String[] args) {

        // 1. int + int → int
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("int + int = " + sum);  // 30

        // 2. int + float → float
        float f = 5.5f;
        float resultFloat = a + f;  // int is promoted to float
        System.out.println("int + float = " + resultFloat);  // 15.5

        // 3. int + double → double
        double d = 2.8;
        double resultDouble = a + d;
        System.out.println("int + double = " + resultDouble);  // 12.8

        // 4. char + int → int
        char ch = 'A';  // ASCII = 65
        int charSum = ch + 3;  // 65 + 3 = 68
        System.out.println("char + int = " + charSum);  // 68

        // 5. byte + byte → int (Always promoted to int)
        byte b1 = 10;
        byte b2 = 20;
        int byteSum = b1 + b2;
        System.out.println("byte + byte = " + byteSum);  // 30

        // 6. byte + short → int
        short s = 100;
        int mixSum = b1 + s;  // promoted to int
        System.out.println("byte + short = " + mixSum);  // 110

        // 7. float + double → double
        double fdSum = f + d;
        System.out.println("float + double = " + fdSum);  // 5.5 + 2.8 = 8.3

        // 8. boolean cannot be used in arithmetic
        boolean flag = true;
        // int result = flag + 1;  // Compile-time error
    }
}
