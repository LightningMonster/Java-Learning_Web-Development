/*5. Ternary Challenge
👉 Problem:
Write a program that takes an integer n and prints:

 "Positive", "Negative", or "Zero" using nested ternary operators.

🔸 Example:

int n = -5;
String result = (n > 0) ? "Positive" : (n < 0) ? "Negative" : "Zero";
System.out.println(result);*/

public class P5_Ternary_Challenge {
    public static void main(String[] args) {

        int num = 5;
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result);
    }
}
