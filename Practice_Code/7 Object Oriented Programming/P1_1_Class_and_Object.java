/* 1. Class and Object
* Q1. Create a Student class with fields name, roll, and grade.
* Create 2 objects and print their details.*/

public class P1_1_Class_and_Object {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();

        std1.insert("Yash",53,"A");
        std2.insert("Phalguni",54,"A");

        std1.print();
        std2.print();

    }

    static class Student{
        String name;
        int roll;
        String grade;

        void insert(String name, int roll, String grade){
            this.name = name;
            this.roll = roll;
            this.grade = grade;
        }

        void print(){
            System.out.println(name+" "+roll+" "+grade);
        }
    }
}
