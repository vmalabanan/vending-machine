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

    // TO DO - FINISH GETPAYMENT FUNCTION
    public static BigDecimal getPayment() {

        System.out.print("Please enter : $ ");
        String amount = input.nextLine().toLowerCase();

        return new BigDecimal(amount);
    }
}
