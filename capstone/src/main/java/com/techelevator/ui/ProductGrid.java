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
    private static int numOfSpacesInCell;
    private static int numOfCharsOnSymbolLines;
    private static int numOfSpacesBeforeEachRow;
    private static String leftSpacing;
    private static final String[] COLORS = new String[]{Colors.GREEN, Colors.CYAN, Colors.PURPLE, Colors.YELLOW};
    private static Map<String, String> productColors = new HashMap<>();

    public static void printProductGrid(List<Product> products, Inventory inventory) {
        int count = 0;

        setNumOfSpacesBeforeEachRow();
        setLeftSpacing();
        setNumOfSpacesInCell(products);
        setNumOfCharsOnSymbolLines();

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

        System.out.print(Colors.RESET);
    }

    private static String lineBuilder(List<Product> products, String attribute, Inventory inventory, boolean includeSpacing) {
        String line = "";
        if (includeSpacing)
            line += leftSpacing;

        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            line += productColors.get(product.getId());
            String textToDisplay = getAttribute(product, attribute, inventory);
            int difference = numOfSpacesInCell - textToDisplay.length();
            line += "| " + textToDisplay;
            for (int j = 0; j < difference; j++) line += " ";
            line += "|\t\t";
        }

        return line;
    }


    private static String lineBuilder(List<Product> products, String edgeChar, String innerChar) {
        String line = leftSpacing;

        for (int i = 0; i < products.size(); i++) {
            line += productColors.get(products.get(i).getId()) + edgeChar;
            for (int j = 0; j < numOfCharsOnSymbolLines; j++) {
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
        int difference = numOfSpacesBeforeEachRow - productType.length();
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

    private static void setNumOfSpacesBeforeEachRow() {
        String longestWord = "";
        for (String productType : Inventory.getProductTypeAndQuantity().keySet()) {
            if (productType.length() > longestWord.length()) {
                longestWord = productType;
            }
        }
        numOfSpacesBeforeEachRow = longestWord.length() + 1;
    }

    private static void setLeftSpacing() {
        String spacing = " ";
        for (int i = 0; i < numOfSpacesBeforeEachRow; i++) {
            spacing += " ";
        }
        leftSpacing = spacing;
    }

    private static void setNumOfSpacesInCell(List<Product> products) {
        String longestWord = "";
        String inStock = "XX in stock";
        int minimumNumOfSpaces = inStock.length(); // At a minimum, must be able to display in-stock message
        for (int i = 0; i < products.size(); i++) {
            String productName = products.get(i).getName();
            if (productName.length() > longestWord.length()) {
                longestWord = productName;
            }
        }
        numOfSpacesInCell = Math.max(longestWord.length(), minimumNumOfSpaces) + 1;
    }

    private static void setNumOfCharsOnSymbolLines() {
        numOfCharsOnSymbolLines = numOfSpacesInCell + 1;
    }

}
