package com.university.student;

import java.util.Scanner;

class University {
    String uName;
    String uLocation;

    void getUniversityDetail(Scanner sc) {
        System.out.print("Enter University Name: ");
        uName = sc.nextLine();
        System.out.print("Enter University Location: ");
        uLocation = sc.nextLine();
    }

    void displayUniversityDetail() {
        System.out.println("University Name: " + uName);
        System.out.println("University Location: " + uLocation);
    }
}
