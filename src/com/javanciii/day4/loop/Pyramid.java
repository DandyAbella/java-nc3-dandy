package com.javanciii.day4.loop;

public class Pyramid {
    public static void main(String[] args) {

        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //full pyramid
        for (int k = 1; k <= 5; k++) {
            for (int l = 1; l <= 5 - k; l++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= (2 * k - 1); m++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
