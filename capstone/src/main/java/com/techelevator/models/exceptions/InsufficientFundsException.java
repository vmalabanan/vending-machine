package com.techelevator.models.exceptions;

import java.math.BigDecimal;

public class InsufficientFundsException extends Exception{

    private BigDecimal balance;
    private BigDecimal price;

    public InsufficientFundsException(String message, BigDecimal balance, BigDecimal price){

        super(message);
        this.balance = balance;
        this.price = price;
    }

    @Override
    public String getMessage(){

        String message = super.getMessage();

        message += " --> Your current balance: $" + balance + " --> Price of item: $" + price;
        message += " --> Amount needed to feed machine in order to purchase: $" + price.subtract(balance);

        return message;
    }

}

