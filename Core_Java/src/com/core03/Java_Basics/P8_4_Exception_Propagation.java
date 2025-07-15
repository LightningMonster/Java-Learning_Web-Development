package src.com.core03.Java_Basics;

public class P8_4_Exception_Propagation {
    static void method1() {
        int x = 5 / 0;
    }

    static void method2(){
        method1();
    }

    public static void main(String[] args) {
        try{
            method2();
        } catch (ArithmeticException e){
            System.out.println("Caught in main: " + e);
        }
    }
}
