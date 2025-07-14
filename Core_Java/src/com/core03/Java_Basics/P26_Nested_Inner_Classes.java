// 13. Nested/Inner Classes

package src.com.core03.Java_Basics;

public class P26_Nested_Inner_Classes {

    // Outer class
    static class Outer {

        // 1. Static Nested Class
        static class StaticNested {
            void msg() {
                System.out.println("Static Nested");
            }
        }

        // 2. Non-static Inner Class
        class Inner {
            void msg() {
                System.out.println("Non-static Inner");
            }
        }

        // 3. Local Inner Class (inside method)
        void outerMethod() {
            class LocalInner {
                void msg() {
                    System.out.println("Local Inner");
                }
            }

            LocalInner li = new LocalInner();
            li.msg();
        }
    }

    public static void main(String[] args) {
        // Call Static Nested Class
        Outer.StaticNested staticNested = new Outer.StaticNested();
        staticNested.msg();

        // Call Non-static Inner Class (via Outer object)
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.msg();

        // Call Local Inner Class (via method)
        outer.outerMethod();
    }
}
