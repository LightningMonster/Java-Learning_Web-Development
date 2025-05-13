package com.university.student;
import java.util.Scanner;

class College extends University {
    String cCode;
    String cName;
    String cLocation;

    void getCollegeDetail(Scanner sc) {
        getUniversityDetail(sc); 
        System.out.print("Enter College Code: ");
        cCode = sc.nextLine();
        System.out.print("Enter College Name: ");
        cName = sc.nextLine();
        System.out.print("Enter College Location: ");
        cLocation = sc.nextLine();
    }

    void displayCollegeDetail() {
        displayUniversityDetail(); 
        System.out.println("College Code: " + cCode);
        System.out.println("College Name: " + cName);
        System.out.println("College Location: " + cLocation);
    }
}