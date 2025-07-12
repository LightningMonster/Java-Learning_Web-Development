/* 2. String Method Usage
🔸 Problem:
Given String str = "JavaProgramming";,
print:
Length of the string
Substring from index 4 to 15
Index of character 'g'
Replace "Java" with "CoreJava"

🔸 Expected Output:

Length: 15
Substring: Programming
Index of 'g': 7
Replaced String: CoreJavaProgramming */

public class P2_String_Method_Usage {
    public static void main(String[] args) {
        String str = "JavaProgramming";

        //length
        System.out.println("Length: "+ str.length());

        // Index of 'g'
        System.out.println("Index of 'g': "+ str.indexOf("g"));

        //Substring from index 4 to 11
        System.out.println("Substring from index 4 to 11: "+ str.substring(4,15));

        // Replace "Java" with "CoreJava"
        System.out.println("Replace \"Java\" with \"CoreJava\": "+ str.replaceAll("Java","CoreJava"));
    }
}
