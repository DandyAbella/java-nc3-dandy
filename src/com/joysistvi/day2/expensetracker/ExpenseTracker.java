package com.joysistvi.day2.expensetracker;

public class ExpenseTracker {
    public static void main(String[] args) {
        System.out.println("**Expense tracker**");
        double income = 50_000;
        double foodAllowance = 15_000, transportation = 2500;
        double rent = 4500;
        double utilityBill = 3500;

        System.out.println("Income: " + income);
        System.out.println("Food Allowance: " + foodAllowance / income * 100 + "%");
        System.out.println("Transportation: " + transportation / income * 100 + "%");
        System.out.println("Rent: " + rent / income * 100 + "%");
        System.out.printf("Utility Bill: %.1f%%\n", (utilityBill / income * 100));
        System.out.println("Remaining Balance: " + (income - foodAllowance - transportation - rent - utilityBill));

    }
}
