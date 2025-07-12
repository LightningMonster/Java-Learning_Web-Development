/*
2. Matrix Addition (2D Arrays)
🔸 Problem:
Create two 2D arrays of size 2x2, initialize them with values, and print the result of their addition.

🔸 Sample Input:

A = {{1, 2}, {3, 4}}
B = {{5, 6}, {7, 8}}

🔸 Expected Output:
Result Matrix =
6 8
10 12
*/
public class P2_Matrix_Addition_2D_Arrays {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {3, 4}};
        int[][] arr2 = {{5, 6}, {7, 8}};

        System.out.println("Result Matrix = ");
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                int temp = arr2[i][j]+arr1[i][j];
                System.out.print(temp+" ");
            }
            System.out.println();
        }


    }
}
