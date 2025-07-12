/*
5. Format String Output
🔸 Problem:
Given:
String name = "Yash";
int score = 95;

Use String.format() or System.out.printf() to display:
Student Yash scored 95 marks.
*/
public class P5_Format_String_Output {
    public static void main(String[] args) {
        String name = "Yash";
        int score = 95;

        System.out.printf("Student %s scored %d marks.\n", name, score);

        String result = String.format("Student %s scored %d marks.", name, score);
        System.out.println(result);

    }
}
