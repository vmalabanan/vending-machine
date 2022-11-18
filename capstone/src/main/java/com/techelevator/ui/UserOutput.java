package com.techelevator.ui;

import com.techelevator.models.CurrencyController;
import com.techelevator.models.Inventory;
import com.techelevator.models.products.Product;
import com.techelevator.view.Console;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Map;

public class UserOutput {
    //Formatting price as a local currency number
    private static NumberFormat currency = NumberFormat.getCurrencyInstance();
    public static void displayWelcomeScreen() {
        System.out.println();
        System.out.println("**********************");
        System.out.println("Welcome to my vending machine!");
        System.out.println("**********************");
    }

    public static void displayHomeScreenMenu() {
        System.out.println();
        System.out.println("**********************");
        System.out.println("Home");
        System.out.println("**********************");
        System.out.println();
        System.out.println("1) Display Vending Machine Items");
        System.out.println("2) Purchase");
        System.out.println("3) Exit");

    }

    public static void displayInventory(Inventory inventory) {
        System.out.println();
        System.out.println("**********************");
        System.out.println("Products");
        System.out.println("**********************");
        System.out.println();

        // loop through and display products
        for (Map.Entry<Product,Integer> product : inventory.getProducts().entrySet()) {


            String id = product.getKey().getId();
            String name = product.getKey().getName();
            String price = currency.format(product.getKey().getPrice());
            int quantity = product.getValue();
            String displayQuantity = quantity == 0 ? "Out of stock" : quantity + " in stock";

            System.out.println(id + ") " + name + " " + price + " - " + displayQuantity);
        }

    }

    public static void displayMoneyInMachine(CurrencyController currencyController) {
        String str = "\nBalance: ";
        String money = currency.format(currencyController.getMoneyInMachine());

        System.out.println(str + money);
    }

    public static void displayPurchaseMenu() {
        System.out.println();
        System.out.println("1) Feed Money");
        System.out.println("2) Select Product");
        System.out.println("3) Finish Transaction");
    }

    public static void displayFeedMoneyScreen(CurrencyController currencyController) {
        displayMoneyInMachine(currencyController);
    }

    public static void clearScreen() {
        System.out.println(Console.CLEAR_SCREEN);
    }

    public static void vendingMachineSuccessMessage(Product product) {
        String message = "\n";
        if (product.getType().equalsIgnoreCase("chip")) message += "Crunch Crunch, Yum!";
        else if (product.getType().equalsIgnoreCase("candy")) message += "Munch Munch, Yum!";
        else if (product.getType().equalsIgnoreCase("drink")) message += "Glug Glug, Yum!";
        else message += "Chew Chew, Yum!";

        System.out.println(message);
    }

    public static void dispenseChange(CurrencyController currencyController) {
        String money = currency.format(currencyController.getMoneyInMachine());

        // dispense change only if there is money in the machine
        if (currencyController.getMoneyInMachine().compareTo(BigDecimal.ZERO) > 0) {
            System.out.println("\nHere's your change!");
            System.out.println(currencyController.dispenseChange());
            System.out.println("\n------------\n" + money);
        }
    }

    public static void goodbye() {
        System.out.println("\nThank you for shopping with Umbrella Corp.");
    }

    public static void invalidSelection() {
        System.out.println("\nInvalid selection. Please try again");
    }


}
