package com.lightning.bank;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        AccountWithdraw obj = new AccountWithdraw();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Enter Customer Details");
            System.out.println("2. View Customer Details");
            System.out.println("3. Check Balance");
            System.out.println("4. Amount Deposit");
            System.out.println("5. Amount Withdraw");
            System.out.println("6. Apply for Loan");
            System.out.println("7. Exit");

            System.out.print("Enter your Choice: ");
            int option = sc.nextInt();
            System.out.println();
            switch (option) {
                case 1:
                    obj.getDetails(); 
                    break;
                case 2:
                    obj.viewDetails();
                    break;
                case 3:
                    obj.checkBalance();
                    break;
                case 4:
                    obj.deposit(); 
                    break;
                case 5:
                    obj.withdraw(); 
                    break;
                case 6:
                	 Loan loan = new Loan();
                	 loan.approveLoan();
                	 loan.calculateInterest();
                	 break;
                case 7:
                    System.out.println("Thank you for using our service!");
                    sc.close(); 
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
