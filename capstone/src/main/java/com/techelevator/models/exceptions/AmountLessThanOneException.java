package com.techelevator.models.exceptions;

public class AmountLessThanOneException extends Exception {

    private int amountEntered;

    public AmountLessThanOneException(String message, int amountEntered){

        super(message);
        this.amountEntered = amountEntered;
    }

    @Override
    public String getMessage(){

        String message = super.getMessage();

        return message + " --> Illegal amount entered: " + amountEntered;
    }

}
