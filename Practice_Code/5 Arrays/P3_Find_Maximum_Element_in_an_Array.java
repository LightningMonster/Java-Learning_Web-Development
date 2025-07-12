/*
3. Find Maximum Element in an Array
🔸 Problem:
Create an integer array with values {15, 42, 7, 63, 28} and find the maximum element using:
Normal loop (without built-in functions)

🔸 Output:
Max Element: 63
*/
public class P3_Find_Maximum_Element_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {15, 42, 7, 63, 28};
        int max = 0;

        for(int num : arr){
            if(num>max){
                max = num;
            }
        }

        System.out.println("Max Element: "+max);
    }
}
