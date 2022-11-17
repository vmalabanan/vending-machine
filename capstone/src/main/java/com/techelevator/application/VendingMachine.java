package com.techelevator.application;

import com.techelevator.models.Inventory;
import com.techelevator.ui.UserInput;
import com.techelevator.ui.UserOutput;
import com.techelevator.view.Colors;
import com.techelevator.view.Console;

import java.util.Scanner;

public class VendingMachine
{
    private Inventory inventory = new Inventory();
        public void run()
    {
        // display a welcome screen
        UserOutput.displayWelcomeScreen();

        while(true)
        {
            // display main menu
            UserOutput.displayHomeScreenMenu();
            String option = UserInput.getSelection();

            if(option.equals("1"))
            {
                // do add item task
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
    // TO DO - FINISH PURCHASE METHOD
    public void purchase() {
        // show inventory
        UserOutput.displayInventory(inventory);
        // get user selection

        // process payment

        // display message to user, etc
    }

}
