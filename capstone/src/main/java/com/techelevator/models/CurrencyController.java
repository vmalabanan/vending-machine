package com.techelevator.models;

import com.techelevator.application.VendingMachine;
import com.techelevator.models.exceptions.AmountLessThanOneException;
import com.techelevator.models.exceptions.InsufficientFundsException;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class CurrencyController {
    private BigDecimal moneyInMachine = BigDecimal.ZERO;

    public BigDecimal getMoneyInMachine() {
        return moneyInMachine;
    }

    public void addMoneyToMachine(String amount) throws AmountLessThanOneException{

        try {
            // make sure amount is a whole number
            int amountInt = Integer.parseInt(amount);
            // make sure amount is at least 1
            if (amountInt < 1)
                throw new AmountLessThanOneException("\nPlease enter a whole dollar amount greater than or equal to $1", amountInt);
            moneyInMachine = moneyInMachine.add(new BigDecimal(amount));
        } catch (NumberFormatException ex){
            System.out.println("\nPlease enter a whole dollar amount only");
        }


    }

    public void subtractMoney(BigDecimal price) throws InsufficientFundsException {
        // if money in machine is greater than or equal to price, subtract price
        if (moneyInMachine.compareTo(price) >= 0) {
            moneyInMachine = moneyInMachine.subtract(price);
        }
        // otherwise throw exception
        else throw new InsufficientFundsException();
    }

    public String dispenseChange() {
        BigDecimal balance = moneyInMachine;
        String change = "";
        int quantity = 0;

        // create array of money denominations
        BigDecimal[] denominations = new BigDecimal[]{
                new BigDecimal("100"),
                new BigDecimal("50"),
                new BigDecimal("20"),
                new BigDecimal("10"),
                new BigDecimal("5"),
                new BigDecimal("1"),
                new BigDecimal("0.25"),
                new BigDecimal("0.10"),
                new BigDecimal("0.05")
        };

        // iterate through the array
        for (BigDecimal denomination : denominations) {
            // divide moneyInMachine by each denomination to get quantity of each denomination to be dispensed
            quantity = moneyInMachine.divide(denomination, RoundingMode.FLOOR).intValue();

            // if quantity > 0
            if (quantity > 0) {
                // update change string
                change += "\n" + quantity + " x $" + denomination;
                // update moneyInMachine
                moneyInMachine = moneyInMachine.subtract(denomination.multiply(BigDecimal.valueOf(quantity)));
                // if balance = 0, break
                if (moneyInMachine.equals(BigDecimal.ZERO)) break;
            }

        }
        return change;
    }
}
