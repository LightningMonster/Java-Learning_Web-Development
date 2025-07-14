// 10. super Keyword

package src.com.core03.Java_Basics;

public class P23_super_Keyword {
    public static void main(String[] args) {

        B b = new B();
        b.print();
    }

    static class A {
        int x = 10;
    }
    static class B extends A {
        int x = 20;

        void print() {
            System.out.println(super.x); // prints 10
        }
    }
}
