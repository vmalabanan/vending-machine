package com.techelevator.models;

import com.techelevator.models.exceptions.AmountLessThanOneException;
import com.techelevator.models.exceptions.InsufficientFundsException;

import java.math.BigDecimal;

public class CurrencyController {
    private BigDecimal moneyInMachine = BigDecimal.ZERO;

    public BigDecimal getMoneyInMachine() {
        return moneyInMachine;
    }

    public void addMoneyToMachine(String amount) {

        try {
            // make sure amount is a whole number
            int amountInt = Integer.parseInt(amount);
            // make sure amount is at least 1
            if (amountInt < 1) throw new AmountLessThanOneException();

        } catch (AmountLessThanOneException e) {
            System.out.println("Please enter a whole dollar amount greater than or equal to $1");
        } catch (Exception ex) {
        System.out.println("Please enter a whole dollar amount only");
    }

        moneyInMachine = moneyInMachine.add(new BigDecimal(amount));
    }

    public void subtractMoney(BigDecimal price) throws InsufficientFundsException {
        if (moneyInMachine.compareTo(price) >= 0) {
            moneyInMachine = moneyInMachine.subtract(price);
        } else {
            throw new InsufficientFundsException();
        }

    }
}
