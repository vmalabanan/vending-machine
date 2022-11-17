package com.techelevator.ui;

import com.techelevator.models.Inventory;
import com.techelevator.models.products.Product;

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

//        // loop through and display products
//        for (Product product : inventory.getProducts()) {
//            System.out.println(product.getId() + ") " + product.getName() + "  $" + product.getPrice());
//        }
//        displayBackToMainScreenMessage();

    }
}
