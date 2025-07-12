/*2. Calculator using switch
🔸 Problem:
Accept two numbers and an operator (+, -, *, /) and perform the operation using a switch statement.

🔸 Input Example: num1 = 10, num2 = 5, op = '+'
🔸 Output: Result: 15

✅ Handle fall-through by omitting break and explain the behavior.*/

import java.util.Scanner;

public class P2_Calculator_using_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter choice +,-,*,/: ");
        String op = sc.next();

        switch(op){
            case "+":
                System.out.println(num1+" + "+num2+" = "+ (num1 + num2)); break;
            case "-":
                System.out.println(num1+" - "+num2+" = "+ (num1 - num2)); break;
            case "*":
                System.out.println(num1+" * "+num2+" = "+ (num1 * num2)); break;
            case "/":
                System.out.println(num1+" / "+num2+" = "+ (num1 / num2)); break;
            default:
                System.out.println("Wrong choice!"); break;
        }
    }
}
