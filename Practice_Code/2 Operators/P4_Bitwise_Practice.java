/*4. Bitwise Practice
👉 Problem:
Print the result of:

int a = 5;   // 0101
int b = 3;   // 0011

System.out.println("a & b = ?");
System.out.println("a | b = ?");
System.out.println("a ^ b = ?");

🔸 Expected Output:
a & b = 1
a | b = 7
a ^ b = 6*/

public class P4_Bitwise_Practice {
    public static void main(String[] args) {
        int a = 5;   // 0101
        int b = 3;   // 0011

        System.out.println("a & b = "+ (a & b));
        System.out.println("a | b = "+ (a | b));
        System.out.println("a ^ b = "+ (a ^ b));
    }
}
