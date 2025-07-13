// 4. Inheritance (Single, Multilevel, Hierarchical)

package src.com.core03.Java_Basics;

public class P17_Inheritance {
    public static void main(String[] args) {
        dog dog = new dog();
        cat cat = new cat();

        dog.voice();
        dog.eat();
        cat.voice();
        cat.eat();
    }

    static class Animal {

        void eat(){
            System.out.println("Eating ");
        }
    }

    static class dog extends Animal {
        void voice(){
            System.out.println("Barking!");
        }
    }

    static class cat extends Animal{
        void voice(){
            System.out.println("Meow!");
        }

        @Override
        void eat() {
            super.eat();
            System.out.println("Fish");
        }
    }
}
