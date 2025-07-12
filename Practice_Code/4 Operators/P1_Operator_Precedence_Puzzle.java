/*Problem:
What will be the output of the following code? Justify your answer based on operator precedence and associativity.

int result = 10 + 20 * 2 - 5 / 5;
System.out.println("Result = " + result);
🔸 Expected Steps:

Multiplication and division first
Then addition and subtraction
All evaluated left to right*/

public class P1_Operator_Precedence_Puzzle {
    public static void main(String[] args) {
        int result = 10 + 20 * 2 - 5 / 5;
        System.out.println("Result = " + result);
    }
}
