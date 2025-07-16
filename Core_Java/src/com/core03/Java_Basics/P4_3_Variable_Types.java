package src.com.core03.Java_Basics;

public class P4_3_Variable_Types {
    public static void main(String[] args) {

        types t = new types();

        System.out.println("Instance variable: "+t.instanceVar );
        System.out.println("Instance variable: "+t.staticVar );

        t.show();
    }

    static class types{
        int instanceVar = 10;
        static int staticVar = 20;

        void show(){
            int localVar = 5;
            System.out.println("Local variable: "+localVar);
        }
    }
}
