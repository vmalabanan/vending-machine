package com.techelevator.ui;

import com.techelevator.models.CurrencyController;
import com.techelevator.models.Inventory;
import com.techelevator.models.products.Product;
import com.techelevator.ui.asciiArt.*;
import com.techelevator.view.Colors;
import com.techelevator.view.Console;
import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.List;


public class UserOutput {
    //Formatting price as a local currency number
    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    public static void printHeader(String message) {
        System.out.println();
        System.out.println("*****************************");
        System.out.println(message);
        System.out.println("*****************************");
    }

    public static void printMenu(String item1, String item2, String item3) {
        System.out.println();
        System.out.println("1) " + item1);
        System.out.println("2) " + item2);
        System.out.println("3) " + item3);
    }

    public static void clearScreen() {
        System.out.println(Console.CLEAR_SCREEN);
    }

    public static void printVendingMachine() {
        VendingMachineImg.printVendingMachineArtWithColor();
    }

    public static void printMoneyStack() {
        MoneyStack.printMoneyStackWithColor();
    }

    public static void printSorryMessage() {
        SorryText.printSorry();
        System.out.println();
    }

    public static void goodbye() {
        HandWave.printHandWave();
        System.out.println();
        System.out.println("\nThank you for shopping with Umbrella Corporation.");
        System.out.println(Colors.RED + "\"Our Business Is Life Itself.\"" + Colors.RESET);
    }

    public static void displayWelcomeScreen() {
        printHeader("Welcome to our totally normal\n" +
                "non-criminal vending machine!");

        Umbrella.printUmbrellaWithColor();
        System.out.println();
        UmbrellaCorpLogo.printUmbrellaCorpLogo();
    }

    public static void displayHomeScreenMenu() {
        printVendingMachine();
        printHeader("Home");
        printMenu("Display Vending Machine Items", "Purchase", "Exit");
    }

    public static void displayInventoryAsGrid(Inventory inventory) {
        printHeader("Products");
        System.out.println();

        for (int i = 0; i < Inventory.getOrganizedProducts().size(); i+=4) {
            ProductGrid.printProductGrid(Inventory.getOrganizedProducts().get(i), Inventory.getOrganizedProducts().get(i + 1), Inventory.getOrganizedProducts().get(i + 2), Inventory.getOrganizedProducts().get(i + 3), inventory);
            System.out.println();
        }
        // After printing out the entire machine, resets the color counter to 0
        ProductGrid.resetCounter();
        System.out.print(Colors.RESET);

    }

    public static void displayMoneyInMachine(CurrencyController currencyController) {
        String str = "\nBalance: ";
        String money = currency.format(currencyController.getMoneyInMachine());

        System.out.println(str + money);
    }

    public static void displayPurchaseMenu() {
        printMenu("Feed Money", "Select Product", "Finish Transaction");
    }

    private static String getDispenseItemMessage(Product product) {
        if (product.getType().equalsIgnoreCase("chip")) {
            return (Colors.YELLOW + "Crunch Crunch, Yum!" + Colors.RESET);
        }

        else if (product.getType().equalsIgnoreCase("candy")) {
            return (Colors.GREEN + "Munch Munch, Yum!" + Colors.RESET);
        }

        else if (product.getType().equalsIgnoreCase("drink")) {
           return(Colors.RED + "Glug Glug, Yum!" + Colors.RESET);
        }

        else {
           return(Colors.PURPLE + "Chew Chew, Yum!" + Colors.RESET);
        }
    }

    private static void printDispenseItemImage(Product product) {
        if (product.getType().equalsIgnoreCase("chip")) {
          ChipBag.printChipBagWithColor();
        }
        else if (product.getType().equalsIgnoreCase("candy")) {
           Candy.printCandyWithColor();
        }
        else if (product.getType().equalsIgnoreCase("drink")) {
        Soda.printSodaWithColor();
        }
        else {
          Gum.printGumWithColor();
        }

    }

    public static void vendingMachineSuccessMessage(Product product) {
        String price = currency.format(product.getPrice());
        String message = getDispenseItemMessage(product);

        System.out.print("\n\tDispensing " + product.getName() + " - " + price + " ");

        try {
            sleepMessage(List.of(".", ".", ".", " " + message, " "));
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        printDispenseItemImage(product);
        System.out.println();

        }

    private static void sleepMessage(List<String> message) throws InterruptedException {
        for (String s : message) {
            Thread.sleep(500);
            System.out.print(s);
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

    public static void invalidSelection() {
        System.out.println("\nInvalid selection. Please try again");
    }

    public static void salesReportMessage() {
        System.out.println("Generating sales report...");
    }

}
