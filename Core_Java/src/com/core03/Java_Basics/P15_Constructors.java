// 2. Constructors (Default, Parameterised, Overloading)
package src.com.core03.Java_Basics;

public class P15_Constructors {
    public static void main(String[] args) {

        Student s = new Student("Yash",21);

        System.out.println(s.name);
        System.out.println(s.age);
    }

    static class Student{
        String name;
        int age;
        Student(String n, int a){
            name = n;
            age = a;
        }
    }
}
