/*
5. Count Even and Odd Numbers
🔸 Problem:
Take a 1D array of size 10 (manual or user input) and print:

Count of even numbers
Count of odd numbers

🔸 Output Example:

Even: 6
Odd: 4
*/
public class P4_Count_Even_and_Odd_Numbers {
    public static void main(String[] args) {

        int[] arr = {9, 2, 5, 1, 10};
        int even = 0;
        int odd = 0;

        for(int num:arr){
            if (num % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Even: "+ even);
        System.out.println("Odd: "+ odd);

    }
}
