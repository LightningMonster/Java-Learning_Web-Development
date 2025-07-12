/*
2. Unary Operator Evaluation
👉 Problem:
What is the output of the following code?

int a = 5;
int b = ++a + a++ + --a;
System.out.println("a = " + a);
System.out.println("b = " + b);
🔸 Practice Focus: Pre/post increment behavior and how values change step-by-step.
*/

public class P2_Unary_Operator_Evaluation {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a + a++ + --a;
        //        6(pre increment) + 6(post increment) + 6(7-1 bcoz of post increment a = 7)
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
