package src.com.core03.Java_Basics;

public class P08_Strings {
    public static void main(String[] args) {

        // 1. String Declaration
        String name = "Yash";
        String greeting = new String("Welcome");

        // 2. String Concatenation
        String fullMessage = greeting + ", " + name + "!";
        System.out.println("Concatenated String: " + fullMessage);

        // 3. String Length
        System.out.println("Length of greeting: " + greeting.length());

        // 4. charAt(index)
        System.out.println("First character of name: " + name.charAt(0));

        // 5. toUpperCase() and toLowerCase()
        System.out.println("Upper: " + name.toUpperCase());
        System.out.println("Lower: " + name.toLowerCase());

        // 6. equals() and equalsIgnoreCase()
        String anotherName = "yash";
        System.out.println("name.equals(anotherName): " + name.equals(anotherName));             // false
        System.out.println("name.equalsIgnoreCase(anotherName): " + name.equalsIgnoreCase(anotherName)); // true

        // 7. substring(start, end)
        System.out.println("Substring of greeting (0-4): " + greeting.substring(0, 4)); // "Welc"

        // 8. contains(), startsWith(), endsWith()
        System.out.println("greeting contains 'come': " + greeting.contains("come"));
        System.out.println("greeting starts with 'Wel': " + greeting.startsWith("Wel"));
        System.out.println("greeting ends with 'me': " + greeting.endsWith("me"));

        // 9. trim()
        String spaced = "   Hello Java   ";
        System.out.println("Trimmed string: '" + spaced.trim() + "'");

        // 10. replace()
        System.out.println(" Replace 'Java' with 'World': " + spaced.replace("Java", "World"));
    }
}
