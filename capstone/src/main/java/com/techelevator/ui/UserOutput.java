package com.techelevator.ui;

import com.techelevator.models.Inventory;
import com.techelevator.models.products.Product;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Map;

public class UserOutput {
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

        //Formatting price as a local currency number
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // loop through and display products
        for (Map.Entry<Product,Integer> product : inventory.getProducts().entrySet()) {


            String id = product.getKey().getId();
            String name = product.getKey().getName();
            String price = currency.format(product.getKey().getPrice());
            System.out.println(id + ") " + name + " " + price);
        }
//        displayBackToMainScreenMessage();

    }
}
