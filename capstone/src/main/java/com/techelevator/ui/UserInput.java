package com.techelevator.ui;
import java.util.Scanner;

public class UserInput {
    private static Scanner input = new Scanner(System.in);

    public static String getInput(String message) {
        System.out.print("\n" + message);

        return input.nextLine();
    }

    public static void getInputNoReturn(String message) {
        System.out.print("\n" + message);

        input.nextLine();
    }

    public static String getSelection() {
        return getInput("Please make a selection: ");
    }

    public static String getPayment() {
        return getInput("Please enter the dollar amount you wish to add: $");
    }

    public static String addMoreMoneyPrompt() {
        return getInput("Add more money? (Y/N): ");
    }

    public static String buyAnotherItemPrompt() {
        return getInput("Buy another item? (Y/N): ");
    }

    public static String getUserItemId(){
        return getInput("Enter the ID of the item you wish to buy: ");
    }

    public static void pressEnterToContinuePrompt() {
        getInputNoReturn("Press enter to continue ");
    }

    public static void noMoneyInMachineMessage() {
        getInputNoReturn("Please input funds. Press enter to return to previous screen.");
    }
}
