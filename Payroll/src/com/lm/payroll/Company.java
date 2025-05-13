package com.lm.payroll;

import java.util.Scanner;

class Company {
    String tradeLicenseNo;
    String companyName;
    String typeOfOperation;

    void getCompanyDetails(Scanner sc) {
        System.out.print("Enter Trade License Number: ");
        tradeLicenseNo = sc.nextLine();
        System.out.print("Enter Company Name: ");
        companyName = sc.nextLine();
        System.out.print("Enter Type of Operation: ");
        typeOfOperation = sc.nextLine();
    }

    void displayCompanyDetails() {
        // Manually added spaces for centering
        System.out.println("\n                    --- Company Details ---");
        
        // Printing the company details with space formatting
        System.out.printf("                    %-25s : %s\n", "Trade License No", tradeLicenseNo);
        System.out.printf("                    %-25s : %s\n", "Company Name", companyName);
        System.out.printf("                    %-25s : %s\n", "Type of Operation", typeOfOperation);
        
        // Adding a line separator
        System.out.println("                    ==================================================");
    }
}
