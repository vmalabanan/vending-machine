package com.techelevator.ui;
import com.techelevator.models.Inventory;
import com.techelevator.models.products.Product;
import com.techelevator.view.Colors;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductGrid {
    private static final int NUM_OF_SPACES_IN_CELL = 19;
    private static final int NUM_OF_CHARS_ON_SYMBOL_LINES = 20;
    private static final int NUM_OF_SPACES_BEFORE_EACH_ROW = 6;
    private static final String LEFT_SPACING = "       ";
    private static final String[] COLORS = new String[]{Colors.GREEN, Colors.CYAN, Colors.PURPLE, Colors.YELLOW};
    private static Map<String, String> productColors = new HashMap<>();

    public static void printProductGrid(List<Product> products, Inventory inventory) {
        int count = 0;

        // for each product type, output a row
        for (int i = 0; i < Inventory.getProductTypeAndQuantity().keySet().size(); i++) {
            // count of items of the same type
            int quantity = Inventory.getProductTypeAndQuantity().get(products.get(count).getType());
            // add products to a list
            List<Product> productsOfSameType = new ArrayList<>();
            for (int j = count; j < count + quantity; j++) {
                productsOfSameType.add(products.get(j));
            }
            count += quantity;

            printRow(i, productsOfSameType, inventory);
        }
    }

    public static void printRow(int rowNumber, List<Product> products, Inventory inventory) {
        //Checks for out of stock items and colors them black
        getColorsForProducts(rowNumber, products, inventory);
        // line 1
        System.out.println(lineBuilder(products," ", "+"));
        // line 2
        System.out.println(lineBuilder(products, "id", inventory, true));
        // line 3
        System.out.println(lineBuilder(products, "|", "-"));
        // line 4
        System.out.println(COLORS[rowNumber % 4] + getRowNamePlusSpaces(products.get(0)) + lineBuilder(products, "name", inventory, false));
        // line 5
        System.out.println(lineBuilder(products, "price", inventory, true));
        // line 6
        System.out.println(lineBuilder(products, "quantity", inventory, true));
        // line 7
        System.out.println(lineBuilder(products, " ", "+"));

    }

    private static String lineBuilder(List<Product> products, String attribute, Inventory inventory, boolean includeSpacing) {
        String line = "";
        if (includeSpacing)
            line += LEFT_SPACING;

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            line += productColors.get(product.getId());
            String textToDisplay = getAttribute(product, attribute, inventory);
            int difference = NUM_OF_SPACES_IN_CELL - textToDisplay.length();
            line += "| " + textToDisplay;
            for (int j = 0; j < difference; j++) line += " ";
            line += "|\t\t";
        }

        return line;
    }


    private static String lineBuilder(List<Product> products, String edgeChar, String innerChar) {
        String line = LEFT_SPACING;

        for (int i = 0; i < products.size(); i++) {
            line += productColors.get(products.get(i).getId()) + edgeChar;
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
        String productType = product.getType().toUpperCase();
        String line = " " + productType;
        int difference = NUM_OF_SPACES_BEFORE_EACH_ROW - productType.length();
        for (int i = 0; i < difference; i++) {
            line += " ";
        }
        return line;
    }


    public static void getColorsForProducts(int rowNumber, List<Product> products, Inventory inventory) {
        for (Product product : products) {
            if (inventory.getProducts().get(product) <= 0) {
                productColors.put(product.getId(), Colors.BLACK);
            } else {
                productColors.put(product.getId(), COLORS[rowNumber % 4]);
            }

        }
    }


}
