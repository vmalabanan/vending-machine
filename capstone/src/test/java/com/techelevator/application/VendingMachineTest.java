package com.techelevator.application;

import com.techelevator.models.CurrencyController;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;


import static org.junit.Assert.*;

public class VendingMachineTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final InputStream standardIn = System.in;
    private VendingMachine vendingMachine;


    @Before
    public void setup(){
        vendingMachine = new VendingMachine();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown(){
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

    @Test
    public void mainMenu_should_display_inventory_screen_if_option_equals_1() {
        //Arrange
        ByteArrayInputStream in = new ByteArrayInputStream("1\n\n3\n".getBytes());
        System.setIn(in);
        String expected = mainMenu_output_if_option_equals_1();

        //Act
        vendingMachine.mainMenu();
        String actual = outputStreamCaptor.toString().trim();

        //Assert
        assertEquals("Because the inventory screen should display if you select option 1", expected, actual);

    }

    private String mainMenu_output_if_option_equals_1() {

        return "[H\u001B[2J\n" +
                "\n" +
                "**********************\n" +
                "Home\n" +
                "**********************\n" +
                "\n" +
                "1) Display Vending Machine Items\n" +
                "2) Purchase\n" +
                "3) Exit\n" +
                "\n" +
                "Please make a selection: \u001B[H\u001B[2J\n" +
                "\n" +
                "**********************\n" +
                "Products\n" +
                "**********************\n" +
                "\n" +
                "C2) Dr. Salt $1.50 - 5 in stock\n" +
                "B2) Cowtales $1.50 - 5 in stock\n" +
                "A2) Stackers $1.45 - 5 in stock\n" +
                "A4) Cloud Popcorn $3.65 - 5 in stock\n" +
                "D1) U-Chews $0.85 - 5 in stock\n" +
                "D4) Triplemint $0.75 - 5 in stock\n" +
                "D2) Little League Chew $0.95 - 5 in stock\n" +
                "D3) Chiclets $0.75 - 5 in stock\n" +
                "C1) Cola $1.25 - 5 in stock\n" +
                "B3) Wonka Bar $1.50 - 5 in stock\n" +
                "B4) Crunchie $1.75 - 5 in stock\n" +
                "A1) Potato Crisps $3.05 - 5 in stock\n" +
                "C3) Mountain Melter $1.50 - 5 in stock\n" +
                "A3) Grain Waves $2.75 - 5 in stock\n" +
                "C4) Heavy $1.50 - 5 in stock\n" +
                "B1) Moonpie $1.80 - 5 in stock\n" +
                "\n" +
                "Press enter to continue \u001B[H\u001B[2J\n" +
                "\u001B[H\u001B[2J\n" +
                "\n" +
                "**********************\n" +
                "Home\n" +
                "**********************\n" +
                "\n" +
                "1) Display Vending Machine Items\n" +
                "2) Purchase\n" +
                "3) Exit\n" +
                "\n" +
                "Please make a selection: \u001B[H\u001B[2J\n" +
                "\n" +
                "Thank you for shopping with Umbrella Corp.";
    }

}
