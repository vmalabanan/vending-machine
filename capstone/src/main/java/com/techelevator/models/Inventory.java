package com.techelevator.models;
import com.techelevator.models.exceptions.InvalidIDException;
import com.techelevator.models.exceptions.InvalidProductFileException;
import com.techelevator.models.exceptions.SoldOutException;
import com.techelevator.models.products.Product;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

public class Inventory {
    // Properties
    private Map<Product, Integer> inventory;
    private static List<Product> organizedProducts;
    private static Map<String, Integer> productTypeAndQuantity;

    // Constructor
    public Inventory() {

        loadInventory();
    }

    // Methods
    private void loadInventory() {
        inventory = new HashMap<>();
        organizedProducts = new ArrayList<>();
        productTypeAndQuantity = new HashMap<>();

        File productsFile = new File("data/vendingmachine.csv");
        try (Scanner reader = new Scanner(productsFile)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();

                // ignore empty lines in productsFile
                if (line.isEmpty()) continue;

                try {
                    String[] columns = line.split("\\|");

                    // throw an exception if all four columns are not present
                    if (columns.length != 4) {
                        throw new InvalidProductFileException(line);
                    }

                    String id = columns[0];
                    String name = columns[1];
                    BigDecimal price = new BigDecimal(columns[2]);
                    String type = columns[3];

                    Product product = new Product(id, name, price, type);

                    // Loads 5 of the product every time the vending machine initializes
                    inventory.put(product, 5);

                    // Add the products to a list for display purposes
                    organizedProducts.add(product);

                    // Add product type and count of items of each product type to map (for display purposes - we will use this to print ProductGrid)
                    productTypeAndQuantity.put(product.getType(), productTypeAndQuantity.getOrDefault(product.getType(), 0) + 1);
                } catch (InvalidProductFileException e) {
                    System.out.println(e.getMessage());

                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Sort the product list by product id (in case productsFile is not already sorted)
        Collections.sort(organizedProducts);

    }

    public Map<Product, Integer> getProducts() {
        return inventory;
    }

    public static List<Product> getOrganizedProducts() { return organizedProducts; }

    public static Map<String, Integer> getProductTypeAndQuantity() { return productTypeAndQuantity; }

    public void decrementQuantity(Product product) throws SoldOutException {
        int quantity = inventory.get(product);

        if (quantity > 0) {
            quantity--;
            inventory.put(product, quantity);
        } else {
            throw new SoldOutException("SOLD OUT", product);
        }
    }

    public boolean isIDValid(String id) {
        //Loops through our entire inventory, and finds the product matching the input ID
        for (Map.Entry<Product, Integer> product : getProducts().entrySet()) {

            // Validates the given ID
            if (product.getKey().getId().equalsIgnoreCase(id)) {
                return true;
            }
        }
        return false;
    }
    public Product getProductByID(String id) {
       try {
        //Loops through our entire inventory, and finds the product matching the input ID
        for (Map.Entry<Product, Integer> product : getProducts().entrySet()) {

            // Validates the given ID
            if (product.getKey().getId().equalsIgnoreCase(id)) {
                return product.getKey();
            }
        }
            throw new InvalidIDException("\nThe ID you have entered is invalid", id);
        } catch (InvalidIDException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    public Integer getQuantity(Product product) {
        return inventory.get(product);
    }


}

