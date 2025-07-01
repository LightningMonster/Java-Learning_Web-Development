package src.com.core03.Java_Basics;

public class P06_AssociativityOfOperators {
    public static void main(String[] args) {

        System.out.println("🔹 1. Left to Right Associativity (Arithmetic)");
        int result1 = 10 - 5 + 2;  // (10 - 5) + 2 = 5 + 2 = 7
        System.out.println("10 - 5 + 2 = " + result1);

        System.out.println("\n🔹 2. Right to Left Associativity (Assignment)");
        int a, b, c;
        a = b = c = 20;  // a = (b = (c = 20))
        System.out.println("a = b = c = 20 → a: " + a + ", b: " + b + ", c: " + c);

        System.out.println("\n🔹 3. Left to Right Associativity (Relational)");
        boolean relational = 10 > 5 && 5 > 2; // (10 > 5) && (5 > 2) → true && true → true
        System.out.println("10 > 5 && 5 > 2 = " + relational);

        System.out.println("\n🔹 4. Right to Left Associativity (Ternary)");
        int age = 20;
        String message = (age < 18) ? "Minor" : (age >= 18 && age < 60) ? "Adult" : "Senior";
        // evaluates: age >= 18 && age < 60 → true → returns "Adult"
        System.out.println("age = 20 → Result: " + message);

        System.out.println("\n🔹 5. Left to Right Associativity (Bitwise)");
        int bitResult = 12 & 5 | 2;  // (12 & 5) | 2 → (4) | 2 → 6
        System.out.println("12 & 5 | 2 = " + bitResult);
    }
}
