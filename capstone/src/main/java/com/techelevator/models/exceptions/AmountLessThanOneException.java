package com.techelevator.models.exceptions;

import com.techelevator.models.file_io.Logger;

public class AmountLessThanOneException extends Exception {

    private int amountEntered;

    public AmountLessThanOneException(String message, int amountEntered){

        super(message);
        this.amountEntered = amountEntered;
    }

    @Override
    public String getMessage(){

        String message = super.getMessage();

        return message + ": Illegal amount entered: $" + amountEntered;
    }

}
