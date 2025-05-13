package com.lm.payroll;
import java.util.Scanner;

class OutsourcedEmployee extends Company {
    String empName;
    int empNumber, noOfDays;
    double wagePerDay;

    void getOutsourcedDetails(Scanner sc) {
        getCompanyDetails(sc);
        System.out.print("Enter Employee Number: ");
        empNumber = sc.nextInt(); sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.print("Enter Number of Days Present: ");
        noOfDays = sc.nextInt();
        System.out.print("Enter Wage Per Day: ");
        wagePerDay = sc.nextDouble();
    }

    void generatePaySlip() {
        double totalSalary = noOfDays * wagePerDay;

        displayCompanyDetails();
        
        // Print the title
        System.out.println("\n                    --- Outsourced Employee Pay Slip ---");
        
        // Manually added spaces for centering
        System.out.printf("                    %-25s : %d\n", "Employee Number", empNumber);
        System.out.printf("                    %-25s : %s\n", "Name", empName);
        System.out.printf("                    %-25s : %d\n", "No. of Days Present", noOfDays);
        System.out.printf("                    %-25s : %.2f\n", "Wage Per Day", wagePerDay);
        
        // Adding a line separator
        System.out.println("                    --------------------------------------------------");
        
        // Printing total salary with space formatting
        System.out.printf("                    %-25s : %.2f\n", "Total Salary", totalSalary);
        
        // Adding the footer
        System.out.println("                    ==================================================");
    }
}
