// 12. Static Members (variable, method, block)

package src.com.core03.Java_Basics;

public class P25_Static_Members {
    public static void main(String[] args) {
        Demo d = new Demo();

        d.show();
    }

    static class Demo {
        static int count = 0;

        static void show() {
            System.out.println("Static Method");
        }

        static {
            System.out.println("Static block executed");
        }
    }
}
