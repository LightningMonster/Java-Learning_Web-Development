/*
1. String vs StringBuilder Demonstration
🔸 Problem:
Write a program to:
Declare a String and try to append using concat()
Declare a StringBuilder and append using .append()

🔸 Expected Output:

String after concat: Hello       // original string unchanged
StringBuilder after append: Hello World
*/
public class P1_String_vs_StringBuilder_Demonstration {
    public static void main(String[] args) {
        String s = "Hello";
        s.concat(" World!");
        System.out.println(s);

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World!");
        System.out.println("StringBuilder after append: " + sb);
    }
}
