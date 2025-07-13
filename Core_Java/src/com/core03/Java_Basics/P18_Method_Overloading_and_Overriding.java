// 5. Method Overloading and Overriding

package src.com.core03.Java_Basics;

public class P18_Method_Overloading_and_Overriding {
    public static void main(String[] args) {

        B B = new B();

        B.show();
        B.show(21);
        B.show("Yash");
    }

    static class A {
        void show() { System.out.println("A"); }
    }

    static class B extends A {
        void show() { System.out.println("B"); }
        void show(int n) { System.out.println("Integer"); }
        void show(String s) { System.out.println("String"); }
    }
}
