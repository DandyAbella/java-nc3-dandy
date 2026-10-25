package com.javanciii.day4.loop;

public class forLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Multilication of " + i);
            for (int j = 1; j <=5; j++) {
                System.out.println( i + " x " + j + " = " + i * j);
            }
        }
    }
}
