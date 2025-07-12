/*
1. Sum of Elements in 1D Array
🔸 Problem:
Write a Java program to:
Declare and initialize an array with values {10, 20, 30, 40, 50}
Calculate and print the sum of all elements.

🔸 Expected Output:
Sum of array elements: 150
*/
public class P1_Sum_of_Elements_in_1D_Array {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int sum=0;

        for(int num:arr){
            sum += num;
        }

        System.out.println("Sum of array elements: "+ sum);
    }
}
