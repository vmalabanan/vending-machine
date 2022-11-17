package com.techelevator.models;

import com.techelevator.models.products.Product;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Inventory {

    // Properties
    private Map<Product, Integer> inventory;


    // Constructor
    public Inventory() {

        loadInventory();
    }

    // Methods

    private void loadInventory(){

        inventory = new HashMap<>();

        File productsFile = new File("data/vendingmachine.csv");
        try(Scanner reader = new Scanner(productsFile))
        {

            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                String[] columns = line.split("\\|");

                String id = columns[0];
                String name = columns[1];
                BigDecimal price = new BigDecimal(columns[2]);
                String type = columns[3];

                Product product = new Product(id, name, price, type);

                // Loads 5 of the product everytime the vending machine initializes
                inventory.put(product, 5);
            }
        }
        catch (IOException ex)
        {
            // TO DO - Logger
            ex.getMessage();
        }
    }

    public Map<Product,Integer> getProducts(){
        return inventory;
    }
}

