package com.university.student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.println("--- Enter Student Full Details ---");
        s.getStudentDetail(sc);

        System.out.println("\n--- Displaying Student Details ---");
        s.displayStudentDetails();

        sc.close();
    }
}
