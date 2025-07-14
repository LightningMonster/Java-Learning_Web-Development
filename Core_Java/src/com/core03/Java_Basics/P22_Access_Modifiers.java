//  9. Access Modifiers

package src.com.core03.Java_Basics;

public class P22_Access_Modifiers {
    // Base class
    static class AccessDemo{
        private int a = 1;              // Accessible only within this class
        int b = 2;                      // default: accessible within the package
        protected int c = 3;            // Accessible within package + subclass outside
        public int d = 4;               // Accessible from anywhere

        // Accessible here
        public void showAccess() {
            System.out.println("private a = " + a);
            System.out.println("default b = " + b);
            System.out.println("protected c = " + c);
            System.out.println("public d = " + d);
        }
    }

    // Subclass
    static class SubDemo extends AccessDemo{
        public void showFromSubclass() {
//          System.out.println("private a = " + a);     // private: not accessible
            System.out.println("default b = " + b);
            System.out.println("protected c = " + c);
            System.out.println("public d = " + d);
        }
    }
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();
        obj.showAccess();

        System.out.println("\n--- Access from subclass ---");
        SubDemo sub = new SubDemo();
        sub.showFromSubclass();
    }
}
