package com.techelevator.application;

import com.techelevator.models.CurrencyController;
import com.techelevator.models.Inventory;
import com.techelevator.models.exceptions.InsufficientFundsException;
import com.techelevator.models.exceptions.InvalidIDException;
import com.techelevator.models.exceptions.SoldOutException;
import com.techelevator.models.products.Product;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;

import java.math.BigDecimal;



public class VendingMachine
{
    private Inventory inventory = new Inventory();
    private CurrencyController currencyController = new CurrencyController();
        public void run()
    {
        // display a welcome screen
        UserOutput.displayWelcomeScreen();

        // prompt user to press enter to continue
        UserInput.pressEnterToContinuePrompt();

        // clear screen
        UserOutput.clearScreen();

        while(true)
        {
            // display main menu
            UserOutput.displayHomeScreenMenu();
            String option = UserInput.getSelection();

            // clear screen
            UserOutput.clearScreen();

            if(option.equals("1"))
            {
                // display inventory
                UserOutput.displayInventory(inventory);

                // prompt user to press enter to continue
                UserInput.pressEnterToContinuePrompt();

                // clear screen
                UserOutput.clearScreen();

            }
            else if(option.equals("2"))
            {
                // make purchase
                purchase();

            }
            else if(option.equals("3"))
            {
                // just break to exit the application
                break;
            }
            else
            {
                // invalid option try again
            }
        }
    }
    // TO DO - FINISH purchase METHOD
    public void purchase(){
        while (true) {
            // clear screen
            UserOutput.clearScreen();

            // show current money provided
            UserOutput.displayMoneyInMachine(currencyController);

            // display three menu options
            UserOutput.displayPurchaseMenu();

            // get user input
            String option = UserInput.getSelection();

            while (true) {

                if(option.equals("1"))
                {
                    // clear screen
                    UserOutput.clearScreen();

                    // display feed money screen
                    UserOutput.displayMoneyInMachine(currencyController);

                    // get user input
                    String payment = UserInput.getPayment();

                    // add money to currencyController
                    currencyController.addMoneyToMachine(payment);

                    // show current money provided
                    UserOutput.displayMoneyInMachine(currencyController);

                    // prompt user if they want to add more money or return to previous screen
                    String choice = UserInput.addMoreMoneyPrompt();

                    // break if they want to return to prev screen
                    if (choice.equalsIgnoreCase("n")) break;

                }
                else if(option.equals("2"))
                {
                    // clear screen
                    UserOutput.clearScreen();

                    // display inventory
                    UserOutput.displayInventory(inventory);

                    // show current money provided
                    UserOutput.displayMoneyInMachine(currencyController);

                    // get user input
                    String id = UserInput.getUserItemId();

                    try {
                        if (!inventory.isIDValid(id)) throw new InvalidIDException();
                        Product product = inventory.getProductByID(id);

                        // attempt to make purchase
                        boolean wasPurchaseSuccessful = purchaseItem(product);

                        // if purchase was successful, output vending machine success message
                        if(wasPurchaseSuccessful) UserOutput.vendingMachineSuccessMessage(product);

                    } catch (InvalidIDException ex) {
                        System.out.println("\nThe ID you entered is invalid");
                    } finally {
                        // show current money provided
                        UserOutput.displayMoneyInMachine(currencyController);

                        // if money in machine <= 0, break
                        if (currencyController.getMoneyInMachine().compareTo(BigDecimal.ZERO) <= 0) break;

                        String choice = UserInput.buyAnotherItemPrompt();

                        // break if they want to return to prev screen
                        if (choice.equalsIgnoreCase("n")) break;
                    }

                }
                else if(option.equals("3"))
                {
                    // finish transaction


                    // just break to exit the application
                    break;

                }
            }

        }

    }


    public boolean purchaseItem(Product product){
        // Charges customer the cost of the item
        BigDecimal price = product.getPrice();

        try {
            // subtract price from money in machine
            currencyController.subtractMoney(price);
            // decrements quantity in inventory
            inventory.decrementQuantity(product);
            // if successful, return true
            return true;
        } catch (InsufficientFundsException ex) {
            System.out.println("You have insufficient funds for this purchase");
        } catch (SoldOutException ex) {
            System.out.println("That item is sold out and unavailable for purchase");
        }

        return false;
    }

}


