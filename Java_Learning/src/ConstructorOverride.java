class A1 {
    A1() {
    	super();
        System.out.println("Constructor of A");
    }

    void config() {
        System.out.println("In A config");
    }
}

class B1 extends A1 {
    B1() {
        this(100);  // Calls the parameterized constructor of B1
        System.out.println("Constructor of B");
    }

    B1(int x) {
        super();  // Calls constructor of A1
        System.out.println("Constructor of B with value: " + x);
    }

    @Override
    void config() {
        System.out.println("In B config");
    }
}

public class ConstructorOverride {
    public static void main(String[] args) {
        A1 obj = new B1();  // Calls constructors in order using this() and super()
        obj.config();       // Calls overridden method
    }
}
