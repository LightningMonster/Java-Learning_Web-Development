package com.calculator;
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.print("Enter operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            int result = calculate(a, b, op); 
            System.out.println("Result: " + result);

            System.out.println("Code completed!");
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error: " + e);
        } 
        catch (CustomException e) {
            System.out.println(e);
        }
        catch (Exception e) {
            System.out.println("Unexpected error: " + e);
        }        sc.close();
    }

    
    public static int calculate(int a, int b, char op) throws CustomException{
        int result = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0)
                    throw new ArithmeticException("Division by zero");
                result = a / b;
                break;
            default:
                throw new CustomException("Wrong Operator");
        }

        return result;
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

