package src.com.Exercises;

//Percentage Calculator
import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter total subjects:");
        int total_sub = sc.nextInt();
        int total_marks = 0;
        double percentage = 0;

        System.out.println("\nEnter marks out of 100\n");
        for(int i = 0; i<total_sub; i++){
            System.out.println("Enter marks of Subject "+i+": ");
            total_marks = sc.nextInt() + total_marks;
        }

        System.out.println("Total Marks: "+total_marks);
        percentage = ((double) total_marks / (total_sub * 100)) * 100;

        System.out.println("Percentage = "+percentage);
    }
}
