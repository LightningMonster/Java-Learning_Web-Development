// 8.2 try, catch, finally, throw, throws
package src.com.core03.Java_Basics;

public class P27_Exceptions {
    public static void main(String[] args) {
        try{
            int a = 5/0;
        } catch (ArithmeticException e){
            System.out.println("Division by zero!");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}
