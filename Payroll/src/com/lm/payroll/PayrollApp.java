package com.lm.payroll;
import java.util.Scanner;

public class PayrollApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select Employee Type:");
        System.out.println("1. Permanent Employee");
        System.out.println("2. Outsourced Employee");
        int choice = sc.nextInt();
        sc.nextLine();

        if (choice == 1) {
            PermanentEmployee p = new PermanentEmployee();
            p.getEmployeeDetails(sc);
            p.generatePaySlip();
        } else if (choice == 2) {
            OutsourcedEmployee o = new OutsourcedEmployee();
            o.getOutsourcedDetails(sc);
            o.generatePaySlip();
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}
