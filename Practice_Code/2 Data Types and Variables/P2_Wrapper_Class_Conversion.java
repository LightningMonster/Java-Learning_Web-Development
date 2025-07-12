/*2. Wrapper Class Conversion
👉 Problem:
Take an integer value and:
Convert it into an Integer object (Boxing)
Then extract primitive back (Unboxing)

🔸 Expected Output:
Boxed Integer: 50
Unboxed int: 50
*/

public class P2_Wrapper_Class_Conversion {
    public static void main(String[] args) {
        int num = 10;

        Integer obj = Integer.valueOf(num); // Boxing
        System.out.println("Convert it into an Integer object: "+obj);

        int value = obj.intValue();         // Unboxing
        System.out.println("Then extract primitive back: "+value);

    }
}
