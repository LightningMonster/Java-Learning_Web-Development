/*
🔸 Problem:
Given a string "100", convert it to integer and add 50 to it.

🔸 Expected Output:

Result: 150
🧠 Use Integer.parseInt()

*/
public class P6_Parse_String_to_Integer {
    public static void main(String[] args) {
        String str = "100";
        int num = Integer.parseInt(str);
        int result = num + 50;
        System.out.println("Result: " + result);
    }
}
