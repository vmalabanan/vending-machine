package com.techelevator.ui;

import com.techelevator.models.CurrencyController;
import com.techelevator.models.Inventory;
import com.techelevator.models.products.Product;

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

    // TO DO - FINISH displayInventory METHOD
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
//        displayBackToMainScreenMessage();

    }

    public static void displayMoneyInMachine(CurrencyController currencyController) {
        String str = "Current money provided: ";
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
}
