// 11. final Keyword

package src.com.core03.Java_Basics;

public class P24_final_Keyword {
    public static void main(String[] args) {
        final int MAX = 100;
//        MAX = 1;  Error
    }

    final class A {}
// class B extends A {} // Error
}
