package com.lm.payroll;
import java.util.Scanner;

class PermanentEmployee extends Company {
    String empName, designation;
    double empNumber, basicSalary;

    void getEmployeeDetails(Scanner sc) {
        getCompanyDetails(sc);
        System.out.print("Enter Employee Number: ");
        empNumber = sc.nextDouble(); sc.nextLine();
        System.out.print("Enter Employee Name: ");
        empName = sc.nextLine();
        System.out.print("Enter Designation: ");
        designation = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    void generatePaySlip() {
        double DA = 0.20 * basicSalary;
        double TA = 0.10 * basicSalary;
        double CCA = 5000;
        double MED = 0.10 * basicSalary;

        double PF = 0.05 * basicSalary;
        double GPF = 0.05 * basicSalary;
        double LIC = 0.02 * basicSalary;

        double grossSalary = basicSalary + DA + TA + CCA + MED;
        double totalDeductions = PF + GPF + LIC;
        double netSalary = grossSalary - totalDeductions;

        displayCompanyDetails();
        System.out.println("\n                   --- Permanent Employee Pay Slip ---");
        System.out.printf("                    %-25s : %.0f\n", "Employee Number", empNumber);
        System.out.printf("                    %-25s : %s\n", "Name", empName);
        System.out.printf("                    %-25s : %s\n", "Designation", designation);
        System.out.printf("                    %-25s : %.2f\n", "Basic Salary", basicSalary);
        System.out.printf("                    %-25s : %.2f\n", "DA", DA);
        System.out.printf("                    %-25s : %.2f\n", "TA", TA);
        System.out.printf("                    %-25s : %.2f\n", "CCA", CCA);
        System.out.printf("                    %-25s : %.2f\n", "Medical Allowance", MED);
        System.out.println("                    --------------------------------------------------");
        System.out.printf("                    %-25s : %.2f\n", "PF", PF);
        System.out.printf("                    %-25s : %.2f\n", "GPF", GPF);
        System.out.printf("                    %-25s : %.2f\n", "LIC", LIC);
        System.out.println("                    --------------------------------------------------");
        System.out.printf("                    %-25s : %.2f\n", "Gross Salary", grossSalary);
        System.out.printf("                    %-25s : %.2f\n", "Total Deductions", totalDeductions);
        System.out.printf("                    %-25s : %.2f\n", "Net Salary", netSalary);
        System.out.println("                    ==================================================");
    }
}
