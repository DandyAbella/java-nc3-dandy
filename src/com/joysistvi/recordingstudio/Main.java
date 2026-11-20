package com.joysistvi.recordingstudio;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        DBConnection.getConnection(); //class DBConnection.java, connection

        System.out.println("\n*** User ***");
        Scanner ch = new Scanner(System.in);
        System.out.println("[1] Register");
        System.out.println("[2] Login");
        System.out.println("[0] Exit");
        System.out.print("\nEnter your choice: ");
        int choice = ch.nextInt();

        switch (choice) {
            case 1:
                Scanner reg = new Scanner(System.in);
                System.out.print("\nEnter full name: ");
                String full_name = reg.nextLine();
                System.out.print("Enter user name: ");
                String user_name = reg.nextLine();
                System.out.print("Enter user password: ");
                String user_password = reg.nextLine();
                boolean success = RegisterUser.registerUser(full_name, user_name, user_password);
                if (success) {
                    System.out.println("Registration Successful");
                } else {
                    System.out.println("Registration Failed");
                }
                break;

            case 2:
                Scanner log = new Scanner(System.in);

                System.out.print("User Name: ");
                String username = log.nextLine();
                System.out.print("Password: ");
                String password = log.nextLine();

                boolean correct = LoginUser.login(username, password);
                if (correct) {
                    System.out.println("Login Successful");
                } else {
                    System.out.println("Invalid user name or password");
                }
                break;

            case 120:
                System.out.println("** Welcome Admin **");
                System.out.println("[1] Artist Management");
                System.out.println("[2] Album Management");
                break;


            default:
                System.out.println("Thank you...");
                break;
        }



    }
}
