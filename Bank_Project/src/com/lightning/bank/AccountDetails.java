package com.lightning.bank;

import java.util.Scanner;

public class AccountDetails {
    long accNo;
    double balance;
    String cusName;
    Scanner sc = new Scanner(System.in);

    public void getDetails() {
        System.out.println("Enter account holder name: ");
        cusName = sc.next();

        System.out.println("Enter account number: ");
        accNo = sc.nextLong();

        System.out.println("Enter balance in account: ");
        balance = sc.nextDouble();
    }

    public void viewDetails() {
        System.out.println("Account holder Name: " + cusName);
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance in account: " + balance);
    }

    public void checkBalance() {
        System.out.println("Balance in account: " + balance);
    }
}
