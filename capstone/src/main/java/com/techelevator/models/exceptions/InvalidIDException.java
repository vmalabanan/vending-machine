package com.techelevator.models.exceptions;

import java.math.BigDecimal;

public class InvalidIDException extends Throwable {

    private String invalidID;

    public InvalidIDException(String message, String invalidID){

        super(message);
        this.invalidID = invalidID;
    }

    @Override
    public String getMessage(){

        String message = super.getMessage();

        message += " --> Invalid ID entered: " + invalidID;

        return message;
    }

}
