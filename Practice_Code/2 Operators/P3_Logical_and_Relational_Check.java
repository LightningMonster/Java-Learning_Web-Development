/*3. Logical and Relational Check
👉 Problem:
Take two integers x = 10 and y = 20. Write a condition using logical operators to print:

        "Both are even"

        "One is odd"

        "Neither are odd"

        🔸 Use: &&, ||, and % operator for even/odd detection.*/

public class P3_Logical_and_Relational_Check {
    public static void main(String[] args) {
        int x = 10, y = 20;

        if((x%2 == 0) && (y%2 == 0)){
            System.out.println("Both are even");
        } else if ((x%2 != 0) || (y%2 != 0)) {
            System.out.println("One is odd");
        } else {
            System.out.println("Neither are odd");
        }
    }
}
