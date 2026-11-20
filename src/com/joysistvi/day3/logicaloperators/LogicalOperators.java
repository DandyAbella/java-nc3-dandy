package com.joysistvi.day3.logicaloperators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean isWeekend = false;
        boolean isHoliday = true;

        //using logical operator AND &&, true if both conditions are true
        if (isWeekend && isHoliday) {
            System.out.println("yes, so no class");
        } else {
            System.out.println("we have class");
        }

        //using logical operator OR ||, true if at least one condition is true
        if (isWeekend || isHoliday) {
            System.out.println("yes, so no classes");
        } else {
            System.out.println("no, so we have classes");
        }

        int age = 17;
        boolean hasValidID = true;
        if (age >= 18 && hasValidID) {
            System.out.println("\nguest allowed to enter");
        } else {
            System.out.println("\nguest NOT allowed to enter");
        }

        //using ternary operator ? :
        int grade = 75;
        String result = (grade >= 75) ? "passed" : "failed";
        System.out.println("\nScore: " + grade);
        System.out.println("Result: " + result);


        }
    }