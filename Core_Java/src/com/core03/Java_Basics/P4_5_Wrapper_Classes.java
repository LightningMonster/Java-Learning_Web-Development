// Wrapper classes convert primitive data types into objects

package src.com.core03.Java_Basics;

public class P4_5_Wrapper_Classes {
    public static void main(String[] args) {
        int num = 100;
        Integer obj = Integer.valueOf(num); // Boxing
        int value = obj.intValue();         // Unboxing

        System.out.println("num: "+ num + ", obj: "+ obj + ", value: " + value);

    }
}
