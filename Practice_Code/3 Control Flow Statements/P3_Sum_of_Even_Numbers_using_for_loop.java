/*3. Sum of Even Numbers using for loop
🔸 Problem:
Print the sum of even numbers between 1 and 100 using a for loop.

🔸 Output Example:

Sum of even numbers from 1 to 100 = 5050
*/
public class P3_Sum_of_Even_Numbers_using_for_loop {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i<=100; i++){
            sum += i;
        }
        System.out.println("Sum of even numbers from 1 to 100 = "+sum);
    }
}
