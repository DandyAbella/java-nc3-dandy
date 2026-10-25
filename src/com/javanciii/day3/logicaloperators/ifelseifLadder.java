package com.javanciii.day3.logicaloperators;

public class ifelseifLadder {
    public static void main(String[] args) {

        //age = 0 - 100
        //0-2 baby, 3-12 child, 13-19 teenager, 20-29 young adult, 30-59 adult, 60-100 senior

        int age = -101;

        if (age <= 2) {
            System.out.println("baby");
        } else if (age <= 12) {
            System.out.println("child");
        } else if (age <= 19) {
            System.out.println("teenager");
        } else if (age <= 29) {
            System.out.println("young adult");
        } else if (age <= 59) {
            System.out.println("adult");
        } else if (age <= 100) {
            System.out.println("senior");
        } else {
            System.out.println("invalid age");
        }


    }
}
