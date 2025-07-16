package src.com.core03.Java_Basics;

public class P4_4_Type_Conversion_and_Casting {
    public static void main(String[] args) {

//      Implicit Type Conversion (Widening)
        int a = 10;
        double b = a;  // int → double
        System.out.println("Implicit Type Conversion: "+ b);

//      Explicit Type Casting (Narrowing):
        double x = 9.5;
        int y = (int) x;  // double → int
        System.out.println("Explicit Type Casting: "+ y);
    }
}
