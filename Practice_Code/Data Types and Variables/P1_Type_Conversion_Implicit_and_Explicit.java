/*1. Type Conversion (Implicit and Explicit)
👉 Problem:
Write a program that performs:
Implicit conversion from int to double
Explicit casting from double to int

🔸 Expected Output:
Implicit Conversion: int to double = 100.0
Explicit Casting: double to int = 99
*/

public class P1_Type_Conversion_Implicit_and_Explicit {
    public static void main(String[] args) {

        int num1 = 100;
        double num2 = num1;
        System.out.println("Implicit Conversion: Before: "+ num1 +" After: "+num2);

        double num3 = 99;
        int num4 = (int) num3;
        System.out.println("Explicit Casting: Before: "+ num3 +" After: "+num4);
    }
}
