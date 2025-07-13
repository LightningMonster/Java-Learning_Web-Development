// 3. this Keyword
package src.com.core03.Java_Basics;

public class P16_this_Keyword {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Phalguni");
        s.setAge(21);
        s.print();
    }

    static class Student{
        String name;
        int age;

        void setName(String name){
            this.name = name;
        }

        void setAge(int age){
            this.age = age;
        }

        void print(){
            System.out.println(name);
            System.out.println(age);
        }
    }
}
