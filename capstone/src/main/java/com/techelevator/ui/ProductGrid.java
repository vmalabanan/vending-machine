package com.techelevator.ui;

import com.techelevator.models.Inventory;
import com.techelevator.models.products.Product;
import com.techelevator.view.Colors;

import java.awt.*;
import java.text.NumberFormat;

public class ProductGrid {
    private static final int NUM_OF_SPACES_IN_CELL = 19;
    private static final int NUM_OF_CHARS_ON_SYMBOL_LINES = 20;
    private static final int NUM_OF_SPACES_BEFORE_EACH_ROW = 6;
    private static final String LEFT_SPACING = "       ";
    private static final String[] colors = new String[]{Colors.GREEN, Colors.CYAN, Colors.PURPLE, Colors.YELLOW};
    public static int colorCount = 0;
    public static String[] productColors = new String[]{Colors.GREEN, Colors.CYAN, Colors.PURPLE, Colors.YELLOW};


    public static void printProductGrid(Product product1, Product product2, Product product3, Product product4, Inventory inventory) {

        //Checks for out of stock items and colors them black
        getColorsForProducts(product1, product2, product3, product4, inventory);
        // line 1
        System.out.println(lineBuilder(" ", "+", 4));
        // line 2
        System.out.println(productColors[0] + LEFT_SPACING + lineBuilder(product1, "id", inventory) + productColors[1] + lineBuilder( product2, "id", inventory) + productColors[2] + lineBuilder(product3, "id", inventory) + productColors[3] + lineBuilder(product4, "id", inventory));
        // line 3
        System.out.println(lineBuilder("|", "-", 4));
        // line 4
        System.out.println(colors[colorCount] + getRowNamePlusSpaces(product1) + productColors[0] + lineBuilder(product1, "name", inventory) + productColors[1] + lineBuilder(product2, "name", inventory) + productColors[2] + lineBuilder(product3, "name", inventory) + productColors[3] + lineBuilder(product4, "name", inventory));
        // line 5
        System.out.println(productColors[0] + LEFT_SPACING + lineBuilder(product1, "price", inventory) + productColors[1] + lineBuilder(product2, "price", inventory) + productColors[2] + lineBuilder(product3, "price", inventory) + productColors[3] + lineBuilder(product4, "price", inventory));
        // line 6
        System.out.println(productColors[0] + LEFT_SPACING + lineBuilder(product1, "quantity", inventory) + productColors[1] + lineBuilder(product2, "quantity", inventory) + productColors[2] + lineBuilder(product3, "quantity", inventory) + productColors[3] + lineBuilder(product4, "quantity", inventory));
        // line 17
        System.out.println(lineBuilder(" ", "+", 4));
        // Advanced the colors to the next for the next row of items
        colorCount++;

    }

    private static String lineBuilder(Product product, String attribute, Inventory inventory) {

        String textToDisplay = getAttribute(product, attribute, inventory);
        int difference = NUM_OF_SPACES_IN_CELL - textToDisplay.length();
        String line = "| " + textToDisplay;
        for (int j = 0; j < difference; j++) line += " ";
        line += "|\t\t";

        return line;
    }


//    private static String lineBuilder(List<Product> products, String attribute, Inventory inventory) {
//        String textToDisplay = "";
//        int difference = 0;
//        String line = "\t ";
//
//        String productType = products.get(0).getType();
//
//        // for all products
//        for (int i = 0; i < products.size(); i++) {
//            // while product type matches
//            while (productType.equals(products.get(i).getType())) {
//                textToDisplay = getAttribute(products.get(i), attribute, inventory);
//                difference = NUM_OF_SPACES_IN_CELL - textToDisplay.length();
//                line += "| " + textToDisplay;
//                for (int j = 0; j < difference; j++) line += " ";
//                line += "|\t\t";
//                productType = products.get(i).getType();
//                i++;
//            }
//        }
//
//        return line;
//    }

    private static String lineBuilder(String edgeChar, String innerChar, int numberOfCells) {


        String line = LEFT_SPACING;

        for (int i = 0; i < numberOfCells; i++) {
            line += productColors[i];
            line += edgeChar;
            for (int j = 0; j < NUM_OF_CHARS_ON_SYMBOL_LINES; j++) {
                line += innerChar;
            }
            line += edgeChar + "\t\t";
        }

        return line;
    }

    private static String getAttribute(Product product, String attribute, Inventory inventory) {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        int quantity = inventory.getQuantity(product);

        switch (attribute) {
            case "id":
                return product.getId();
            case "name":
                return product.getName();
            case "price":
                return currency.format(product.getPrice());
            case "quantity":
                return quantity == 0 ? "Out of stock" : quantity + " in stock";
            default:
                return "";
        }
    }

    private static String getRowNamePlusSpaces(Product product) {
        String line = " " + product.getType().toUpperCase();
        int difference = NUM_OF_SPACES_BEFORE_EACH_ROW - product.getType().length();
        for (int i = 0; i < difference; i++) {
            line += " ";
        }
        return line;
    }

    public static void getColorsForProducts(Product product1, Product product2, Product product3, Product product4, Inventory inventory){

        if (inventory.getProducts().get(product1) <= 0){
            productColors[0] = Colors.BLACK;
        } else {
            productColors[0] = colors[colorCount];
        }
        if (inventory.getProducts().get(product2) <= 0){
            productColors[1] = Colors.BLACK;
        } else {
            productColors[1] = colors[colorCount];
        }
        if (inventory.getProducts().get(product3) <= 0){
            productColors[2] = Colors.BLACK;
        } else {
            productColors[2] = colors[colorCount];
        }
        if (inventory.getProducts().get(product4) <= 0){
            productColors[3] = Colors.BLACK;
        } else {
            productColors[3] = colors[colorCount];
        }


    }


    // resets the color counter to 0 at the end of every display products
    public static void resetCounter(){
        colorCount = 0;
    }
}
