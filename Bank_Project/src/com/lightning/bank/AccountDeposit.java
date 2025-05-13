package com.lightning.bank;

import java.util.Scanner;

public class AccountDeposit extends AccountDetails {
    int amountToDeposit;
    Scanner sc = new Scanner(System.in);

    public void deposit() {
        System.out.println("Enter balance to deposit in account: ");
        amountToDeposit = sc.nextInt();
        balance = balance + amountToDeposit;
    }
}
