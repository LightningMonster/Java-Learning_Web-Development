/*
* 5. Skip Multiples of 3 and Stop at 50
🔸 Problem:
Using a while loop:

Print numbers from 1 to 100
Skip multiples of 3 using continue
Stop the loop completely if number reaches 50 using break

🔸 Output: Should print 1 to 50 excluding 3, 6, 9, etc.
*/

public class P5_Skip_Multiples_of_3_and_Stop_at_50 {
    public static void main(String[] args) {

        for(int i = 0; i <= 100; i++ ){
            if(i%3==0){
                continue;
            }
            if(i <= 50){
                break;
            }
            System.out.print(" "+i);
        }
    }
}
