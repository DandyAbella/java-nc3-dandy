package com.javanciii.day3.logicaloperators;
import java.util.Scanner;
public class LoadRegistration {
    public static void main(String[] args) {
        Scanner ussdScanner = new Scanner(System.in);

        String ussd;

        //do-while syntax
//        do {
//            //code to execute
//        } while (condition);

        System.out.println("***Dial *143# to access Globe Services**");
        do {
            System.out.print("Enter USSD Code: ");
            ussd = ussdScanner.nextLine();
            if (!ussd.equals("*143#")) { //used .equals instead of != because is not recommended in String
                System.out.println("Invalid USSD code.");
                System.out.println("[1] Try again");
                System.out.println("[0] Exit");
                System.out.print("Choice: ");
                int choice = ussdScanner.nextInt();
                ussdScanner.nextLine();
                if (choice == 0){
                    System.out.println("Exiting");
                    return;
                } else {
                }
            }


        } while (!ussd.equals("*143#"));
        System.out.println("\n * Load Registration *");
        System.out.println("[1] Go+");
        System.out.println("[2] Go");
        System.out.println("[3] GoExtra");
        System.out.println("[4] Unli5G");
        System.out.println("[5] ALLNET");




        ussdScanner.close();
    }
}
