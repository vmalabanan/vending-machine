package com.techelevator.models.products;

import java.math.BigDecimal;

public class Product implements Comparable<Product> {

    // Properties
    private String id;
    private String name;
    private BigDecimal price;
    private String type;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    // Constructor
    public Product(String id, String name, BigDecimal price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public String toString(){
        return id + ": " + name + " - price: $" + price;
    }

    @Override
    public int compareTo(Product product) {
        return getId().compareTo(product.getId());
    }
}
