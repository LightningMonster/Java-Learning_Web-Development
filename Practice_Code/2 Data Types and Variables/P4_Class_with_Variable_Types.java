/*
4. Class with Variable Types (local, instance, static)
👉 Problem:
Define a class Student with:
static variable: school name
instance variable: student name
a method that has a local variable for marks
Print all three.

🔸 Expected Output:

School: ABC Public School
Name: Yash
Marks: 95*/

public class P4_Class_with_Variable_Types {
    public static void main(String[] args) {
       Student student = new Student();
       student.display();
    }

    static class Student {
        static String school_name = "ABC School";
        String std_name = "Yash Dhadve";


        void display(){
            int marks = 100;
            System.out.println("School: "+school_name);
            System.out.println("Student name: "+std_name);
            System.out.println("Marks: "+marks);
        }
    }
}


