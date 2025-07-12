import java.util.Arrays;

/*
4. Use Arrays.sort() and Arrays.copyOf()
🔸 Problem:
Create an array {9, 2, 5, 1} and:
Sort the array using Arrays.sort()
Copy the sorted array to a new array with size 6 using Arrays.copyOf()
Print both arrays

🔸 Expected Output:

Sorted Array: [1, 2, 5, 9]
Copied Array (size 6): [1, 2, 5, 9, 0, 0]
*/
public class P5_Use_Arrays_sort_and_Arrays_copyOf {
    public static void main(String[] args) {
        int[] arr = {9, 2, 5, 1};

        Arrays.sort(arr);

        int[] arr2 = {0,0,0,0,0,0};
        int[] copy = Arrays.copyOf(arr,6);

        System.out.println("Sorted Array: "+Arrays.toString(arr));
        System.out.println("Copied Array (size 6): "+Arrays.toString(copy));
    }
}
