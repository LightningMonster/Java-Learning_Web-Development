//Check int or not
package src.com.practice.Set1;
import java.util.Scanner;

public class Q5_Is_Int {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("You entered an integer: " + num);
        } else {
            System.out.println("Not an integer.");
        }

        sc.close();
    }
}
