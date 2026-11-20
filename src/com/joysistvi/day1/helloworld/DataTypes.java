package com.joysistvi.day1.helloworld;

public class DataTypes {
    public static void main(String[] args) {
        boolean a = true;   //stores only true or false value
        byte b = 127;       //stores small whole number -128 to 127
        short c = 32767;     // -32,768 to 32767
        int d = 2_147_483_67; // most commonly used integer type
        long e = 400000L;   //stores very large number, notice the L at the end
        float f = 4.5f;     //stores decimal numbers, notice the f at the end
        double g = 99.9;    //stores decimal numbers with higher precision than float
        char h = 'A';       //store single character, enclose with single quotes 'X'
        String name = "Dandy"; //stores sequence of characters, use double quotes "x"

        System.out.println("name = " + name);
        System.out.println("boolean = " + a);
        System.out.println("byte = " + b);
        System.out.println("short = " + c);


    }
}
//Objective: Gain hands-on experience with different data types in Java.
//
//Instructions:
//        1. Create a file and name it "Activity1_(your lastName).
//        2. Inside the class, declare/initialize variables of the following data types:
//        ● boolean
//● byte
//● short
//● int
//● long
//● float
//● double
//● char
//● String
//
//3. Assign sample values to each variable, ensuring that the assigned values are appropriate for the respective data type.
//
//        4. Print out the values of each variable using the System.out.println() statement. Include an appropriate message or
//label to identify the data type associated with each value.