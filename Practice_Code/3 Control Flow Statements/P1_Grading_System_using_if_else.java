/*1. Grading System using if-else
🔸 Problem:
Write a program that takes a student's percentage and prints the grade:

>=90: A
>=75: B
>=60: C
<60: Fail

🔸 Input: int marks = 82;
🔸 Output: Grade: B
*/

public class P1_Grading_System_using_if_else {
    public static void main(String[] args) {
        int marks = 100;

        System.out.println("Marks: "+ marks);
        if (marks >= 90){
            System.out.println("A");
        } else if (marks >= 75){
            System.out.println("B");
        } else if (marks >= 60){
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }
    }
}
