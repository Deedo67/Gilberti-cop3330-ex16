package MPE16.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Derek Gilberti
 */

//class begin
public class ex16 {
    //main method begin
    public static void main(String[] args) {
        //scanner
        Scanner in = new Scanner(System.in);

        //input
        System.out.print("What is your age? ");
        String strage = in.nextLine();

        //string convert
        int age = Integer.parseInt(strage);

        //known variable
        int legal = 16;

        //output and check
        if(age >= 16)
        {
            System.out.print("You are old enough to legally drive.");
        }
        else
        {
            System.out.print("You are not old enough to legally drive.");
        }
    }
}
