package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {
    private static Scanner input = new Scanner(System.in);

    public static String getSelection() {
        System.out.print("Please make a selection: ");

        return input.nextLine();
    }

    // TO DO - FINISH getPayment FUNCTION
    public static String getPayment() {

        System.out.print("Please enter the dollar amount you wish to add: $");

        return input.nextLine();
    }

    public static String addMoreMoneyPrompt() {
        System.out.print("Add more money? (Y/N): ");

        return input.nextLine();

    }

    public static String returnToPrevScreenPrompt() {
        System.out.print("\nPress any key to return to previous screen: ");

        return input.nextLine();

    }

}
