/*
3. Non-Primitive Array Handling
👉 Problem:
Create an integer array of size 5. Initialize it and print all elements using a loop.

🔸 Expected Output:
Array Elements: 10 20 30 40 50
*/

public class P3_Non_Primitive_Array_Handling {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        System.out.print("Array Elements:");
        for(int num:arr){
            System.out.print(" "+num);
        }
    }
}
