package com.techelevator.ui;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {
    private static Scanner input = new Scanner(System.in);

    public static String getSelection() {
        System.out.print("Please make a selection: ");
        String selection = input.nextLine();

        return selection;
    }

    // TO DO - FINISH getPayment FUNCTION
    public static String getPayment() {

        System.out.println("Please enter the dollar amount you wish to add: $");
        String amount = input.nextLine();

        return amount;
    }

}
