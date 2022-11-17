package com.techelevator.application;

import com.techelevator.models.CurrencyController;
import com.techelevator.models.Inventory;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;
import com.techelevator.view.Console;


public class VendingMachine
{
    private Inventory inventory = new Inventory();
    private CurrencyController currencyController = new CurrencyController();
        public void run()
    {
        // display a welcome screen
        UserOutput.displayWelcomeScreen();

        while(true)
        {
            // clear screen
            System.out.println(Console.CLEAR_SCREEN);

            // display main menu
            UserOutput.displayHomeScreenMenu();
            String option = UserInput.getSelection();

            if(option.equals("1"))
            {
                // display inventory
                UserOutput.displayInventory(inventory);
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
    public void purchase() {
        // show current money provided
        UserOutput.displayMoneyInMachine(currencyController);

        // display three menu options
        UserOutput.displayPurchaseMenu();

        // get user input
        String option = UserInput.getSelection();

        while (true) {
            if(option.equals("1"))
            {
                // display feed money screen
                UserOutput.displayMoneyInMachine(currencyController);
                currencyController.addMoneyToMachine(UserInput.getPayment());

            }
            else if(option.equals("2"))
            {
                // make purchase
                purchase();

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
