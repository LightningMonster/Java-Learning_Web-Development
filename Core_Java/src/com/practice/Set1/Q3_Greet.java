//Greet user
package src.com.practice.Set1;
import java.util.Scanner;

public class Q3_Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter your name:");
        String name = sc.nextLine();
        System.out.printf("Hello %s!", name);
    }
}
