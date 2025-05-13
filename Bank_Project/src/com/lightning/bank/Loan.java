package com.lightning.bank;

interface LoanApproval {
    void approveLoan();
}

interface LoanInterest {
    void calculateInterest();
}

public class Loan implements LoanApproval, LoanInterest {
    double loanAmount = 200000; 
    double interestRate = 0.02; 
    int months = 12;

    @Override
    public void approveLoan() {
        System.out.println("Loan of ₹" + loanAmount + " approved for 12 months.");
    }

    @Override
    public void calculateInterest() {
        double totalInterest = loanAmount * interestRate * (months / 12.0);
        double totalPayable = loanAmount + totalInterest;
        System.out.println("Interest @ 2% yearly: ₹" + totalInterest);
        System.out.println("Total Payable after 12 months: ₹" + totalPayable);
        System.out.println();
    }
}
