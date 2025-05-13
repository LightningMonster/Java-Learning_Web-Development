// Base class
class A {
    void config() {
        System.out.println("In A config");
    }

    void show() {
        System.out.println("Show method in A");
    }
}

// Derived class
class B extends A {
    @Override
    void config() {
        System.out.println("In B config");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A obj = new B();  // Reference of A, object of B
        obj.config();     // Calls overridden method in B
        obj.show();       // Calls method from A (not overridden)
    }
}
