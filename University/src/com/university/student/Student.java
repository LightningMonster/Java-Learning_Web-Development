package com.university.student;
import java.util.Scanner;

class Student extends College {
    String htNo;
    String sName;
    String course;

    void getStudentDetail(Scanner sc) {
        getCollegeDetail(sc); 
        System.out.print("Enter Hall Ticket No: ");
        htNo = sc.nextLine();
        System.out.print("Enter Student Name: ");
        sName = sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
    }

    void displayStudentDetails() {
        displayCollegeDetail();
        System.out.println("Hall Ticket No: " + htNo);
        System.out.println("Student Name: " + sName);
        System.out.println("Course: " + course);
    }
}
