package com.techelevator.models.exceptions;

import com.techelevator.models.products.Product;

import java.math.BigDecimal;

public class SoldOutException extends Exception {

    private Product product;

    public SoldOutException(String message, Product product){

        super(message);
        this.product = product;
    }

    @Override
    public String getMessage(){

        String message = super.getMessage();
        String productName = product.getName();

        message += " --> Unfortunately " + productName + " are sold out at this machine.\n";
        message += "\nUmbrella corporation realizes that " + productName + " is a delicious snack\nfree from cutting edge research chemicals.\n";
        message += "\nPlease contact Umbrella Corporation at 555-555-1337 to re-stock this machine.";

        return message;
    }

}
