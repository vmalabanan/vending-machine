package com.techelevator.ui;

import com.techelevator.models.CurrencyController;
import com.techelevator.models.Inventory;
import com.techelevator.models.exceptions.SoldOutException;
import com.techelevator.models.products.Product;
import com.techelevator.ui.asciiArt.*;
import com.techelevator.view.Colors;
import com.techelevator.view.Console;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class UserOutput {
    //Formatting price as a local currency number
    private static NumberFormat currency = NumberFormat.getCurrencyInstance();
    public static void displayWelcomeScreen() {
        System.out.println();
        System.out.println("*****************************");
        System.out.println("Welcome to our totally normal");
        System.out.println("non-criminal vending machine!");
        System.out.println("*****************************");
        Umbrella.printUmbrellaWithColor();
        System.out.println();
        UmbrellaCorpLogo.printUmbrellaCorpLogo();
    }


    public static void displayHomeScreenMenu() {
        VendingMachineImg.printVendingMachineArtWithColor();
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
        for (Product product : Inventory.getOrganizedProducts()) {

            String id = product.getId();
            String name = product.getName();
            String price = currency.format(product.getPrice());
            int quantity = inventory.getQuantity(product);
            String displayQuantity = quantity == 0 ? "Out of stock" : quantity + " in stock";

            System.out.println(id + ") " + name + " " + price + " - " + displayQuantity);
        }

    }

    public static void displayInventoryAsGrid(Inventory inventory) {
        System.out.println();
        System.out.println("**********************");
        System.out.println("Products");
        System.out.println("**********************");
        System.out.println();

        // so each row has its own color
        String[] colors = new String[]{Colors.GREEN, Colors.CYAN, Colors.PURPLE, Colors.YELLOW};
        int colorCount = 0;
        for (int i = 0; i < Inventory.getOrganizedProducts().size(); i+=4) {
            System.out.print(colors[colorCount]);
            ProductGrid.printProductGrid(Inventory.getOrganizedProducts().get(i), Inventory.getOrganizedProducts().get(i + 1), Inventory.getOrganizedProducts().get(i + 2), Inventory.getOrganizedProducts().get(i + 3), inventory);
            System.out.println();
            colorCount++;

        }
        System.out.print(Colors.RESET);

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

    public static void clearScreen() {
        System.out.println(Console.CLEAR_SCREEN);
    }

    public static void vendingMachineSuccessMessage(Product product) {
        String price = currency.format(product.getPrice());
        System.out.print("\n\tDispensing " + product.getName() + " - " + price + "... ");


        if (product.getType().equalsIgnoreCase("chip")) {
            System.out.print(Colors.YELLOW + "Crunch Crunch, Yum!" + Colors.RESET);
            System.out.println();
            ChipBag.printChipBagWithColor();
            System.out.println();
        }
        else if (product.getType().equalsIgnoreCase("candy")) {
            System.out.print(Colors.GREEN + "Munch Munch, Yum!" + Colors.RESET);
            System.out.println("\n");
            Candy.printCandyWithColor();
            System.out.println();
        }
        else if (product.getType().equalsIgnoreCase("drink")) {
            System.out.print(Colors.RED + "Glug Glug, Yum!" + Colors.RESET);
            System.out.println("\n");
            Soda.printSodaWithColor();
            System.out.println();

        }
        else {
            System.out.print(Colors.PURPLE + "Chew Chew, Yum!" + Colors.RESET);
            System.out.println();
            Gum.printGumWithColor();
            System.out.println();

        }

    }

    public static void dispenseChange(CurrencyController currencyController) {
        String money = currency.format(currencyController.getMoneyInMachine());

        // dispense change only if there is money in the machine
        if (currencyController.getMoneyInMachine().compareTo(BigDecimal.ZERO) > 0) {
            MoneyStack.printMoneyStackWithColor();
            System.out.println("\nHere's your change!");
            System.out.println(currencyController.dispenseChange());
            System.out.println("------------\n" + "Total change: " + money);
        }
    }
    public static void printMoneyStack() {
        MoneyStack.printMoneyStackWithColor();
    }

    public static void goodbye() {
        HandWave.printHandWave();
        System.out.println();
        System.out.println("\nThank you for shopping with Umbrella Corporation.");
        System.out.println(Colors.RED + "\"Our Business Is Life Itself.\"" + Colors.RESET);
    }

    public static void invalidSelection() {
        System.out.println("\nInvalid selection. Please try again");
    }


}
