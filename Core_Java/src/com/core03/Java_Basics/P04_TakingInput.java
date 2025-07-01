package src.com.core03.Java_Basics;

import java.util.Scanner;

public class P04_TakingInput {
    public static void main(String[] args){
        System.out.println("Taking input from user:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("You entered: "+a);
    }
}
