package com.techelevator.ui;

import com.techelevator.models.products.Product;

public class ProductGrid {
    public static void printProductGridLine1() {
        System.out.println("\t  ++++++++++++++++++++ \t\t ++++++++++++++++++++ \t\t ++++++++++++++++++++ \t\t ++++++++++++++++++++");
    }

    public static void printProductGridLine2(Product product1, Product product2, Product product3, Product product4) {
        System.out.println("\t | " + product1.getId() + "                 |\t\t| " + product2.getId() + "                 |\t\t| " + product3.getId() + "                 |\t\t| " + product4.getId() + "                 |");
    }

    public static void printProductGridLine3() {
        System.out.println("\t |--------------------|\t\t|--------------------|\t\t|--------------------|\t\t|--------------------|");
    }

    public static void printProductGridLine7() {
        printProductGridLine1();
    }



}
