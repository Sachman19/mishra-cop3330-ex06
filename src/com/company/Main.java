/*
 *  UCF COP3330 Summer 2021 Assignment 6 Solution
 *  Copyright 2021 Sachin Mishra
 */

package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your current age? ");
        int age = input.nextInt();

        System.out.print("What age would you like to retire? ");
        int retire = input.nextInt();

       // String outAdd = num1 + " + " + num2 + " = " + (num1 + num2);
       // String outSub = num1 + " - " + num2 + " = " + (num1 - num2);
       // String outMul = num1 + " * " + num2 + " = " + (num1 * num2);
       // String outDiv = num1 + " / " + num2 + " = " + (num1 / num2);

        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retYears = retire - age;

        System.out.printf("You have %d years until you can retire.%n", retYears);
        System.out.printf("The current year is %d, you can retire in %d.", year, year + retYears);
    }
}
