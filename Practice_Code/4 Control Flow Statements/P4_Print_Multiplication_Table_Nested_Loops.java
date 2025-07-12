/*4. Print Multiplication Table (Nested Loops)
🔸 Problem:
Use nested loops to print the multiplication tables from 1 to 5.

🔸 Output:

1 x 1 = 1
1 x 2 = 2
...
5 x 10 = 50
*/
public class P4_Print_Multiplication_Table_Nested_Loops {
    public static void main(String[] args) {
        for (int i = 1; i<=5; i++){
            for (int j = 1; j<=10; j++){
                System.out.println(i +" x "+ j +" = "+ (i*j));
            }
            System.out.println();
        }
    }
}
