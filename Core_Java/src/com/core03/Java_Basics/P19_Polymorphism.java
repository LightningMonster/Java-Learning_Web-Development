// 6. Polymorphism (Compile-time & Runtime)
package src.com.core03.Java_Basics;

public class P19_Polymorphism {
    public static void main(String[] args) {
        //
        calculator cal = new calculator();
        System.out.println("int add: "+ cal.add(2,4));
        System.out.println("double add: "+ cal.add(2.4,4.4));

        parent obj = new child();
        obj.greet();
    }

    static class calculator{
        int add(int a, int b){
            return a+b;
        }

        double add(double a, double b){
            return a+b;
        }
    }

    static class parent{
        void greet() {
            System.out.println("Hello from Parent");
        }
    }

    static class child extends parent{
        void greet() {
            System.out.println("Hello from Child");
        }
    }
}
