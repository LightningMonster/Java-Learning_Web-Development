/*5. Primitive Data Type Identification
👉 Problem:
Create a program that uses all 8 primitive data types, assigns sample values, and prints them.

🔸 Expected Output:
byte: 10
short: 200
int: 1000
long: 50000
float: 5.75
double: 123.456
char: A
boolean: true*/

public class P5_Primitive_Data_Type_Identification {
    public static void main(String[] args) {

        byte a = 10;
        short b = 200;
        int c = 1000;
        long d = 50000;
        float e = 5.75f;
        double f = 123.456;
        char g = 'A';
        boolean h = true;

        System.out.println("byte: "+a);
        System.out.println("short: "+b);
        System.out.println("int: "+c);
        System.out.println("long: "+d);
        System.out.println("float: "+e);
        System.out.println("double: "+f);
        System.out.println("char: "+g);
        System.out.println("boolean: "+h);
    }
}
