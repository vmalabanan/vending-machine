package com.techelevator.models.exceptions;

import com.techelevator.view.Colors;

public class InvalidProductFileException extends Exception {

    public InvalidProductFileException(String message) {
        super(Colors.RED_BACKGROUND +
                "Product file must include id, name, price, and type for each item. Invalid format for item: " +
                message + ". Item will be skipped." + Colors.RESET);

    }
}
