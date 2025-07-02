//KM to miles
//Miles=Kilometers×0.621371
package src.com.practice.Set1;
import java.util.Scanner;

public class Q4_KM_to_Miles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;

        System.out.print("Miles : "+miles);
    }
}
