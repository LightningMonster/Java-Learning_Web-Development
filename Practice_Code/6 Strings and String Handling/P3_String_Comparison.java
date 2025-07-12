/*
3. String Comparison: equals() vs ==
🔸 Problem:
Create two string objects:

String s1 = "Hello";
String s2 = new String("Hello");
Compare using == and equals() and print the result.

🔸 Expected Output:

Using == : false
Using equals() : true
*/
public class P3_String_Comparison {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = new String("Hello");

        System.out.println("Using == : "+ (s1 == s2));
        System.out.println("Using equals() : "+ s1.equals(s2));
    }
}
