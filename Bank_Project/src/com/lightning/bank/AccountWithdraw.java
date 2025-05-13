package com.lightning.bank;

import java.util.Scanner;

public class AccountWithdraw extends AccountDeposit {
    int amountToWithdraw;
    Scanner sc = new Scanner(System.in);

    public void withdraw() {
        System.out.println("Enter balance to withdraw: ");
        amountToWithdraw = sc.nextInt();

        if (balance >= amountToWithdraw) {
            balance = balance - amountToWithdraw;
        } else {
            System.out.println("Insufficient balance in account");
        }
    }
}
