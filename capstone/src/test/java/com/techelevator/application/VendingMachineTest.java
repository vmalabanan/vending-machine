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
        String expected = mainMenu_output_if_option_equals_1().trim();

        //Act
        vendingMachine.mainMenu();
        String actual = outputStreamCaptor.toString().trim();

        expected = removeWhiteSpace(expected);
        actual = removeWhiteSpace(actual);

        //Assert
        assertEquals("Because the inventory screen should display if you select option 1", expected, actual);

    }

    private String removeWhiteSpace(String original){
        original = original.replaceAll("\n", "");
        original = original.replaceAll("\r", "");
        original = original.replaceAll(" ", "");
        return original;
    }

    private String mainMenu_output_if_option_equals_1() {

        return "[H\u001B[2J\r\n" +
                "\r\n" +
                "**********************\r\n" +
                "Home\r\n" +
                "**********************\r\n" +
                "\r\n" +
                "1) Display Vending Machine Items\r\n" +
                "2) Purchase\r\n" +
                "3) Exit\r\n" +
                "\r\n" +
                "Please make a selection: \u001B[H\u001B[2J\r\n" +
                "\r\n" +
                "**********************\r\n" +
                "Products\r\n" +
                "**********************\r\n" +
                "\r\n" +
                "A1) Potato Crisps $3.05 - 5 in stock\r\n" +
                "A2) Stackers $1.45 - 5 in stock\r\n" +
                "A3) Grain Waves $2.75 - 5 in stock\r\n" +
                "A4) Cloud Popcorn $3.65 - 5 in stock\r\n" +
                "B1) Moonpie $1.80 - 5 in stock\r\n" +
                "B2) Cowtales $1.50 - 5 in stock\r\n" +
                "B3) Wonka Bar $1.50 - 5 in stock\r\n" +
                "B4) Crunchie $1.75 - 5 in stock\r\n" +
                "C1) Cola $1.25 - 5 in stock\r\n" +
                "C2) Dr. Salt $1.50 - 5 in stock\r\n" +
                "C3) Mountain Melter $1.50 - 5 in stock\r\n" +
                "C4) Heavy $1.50 - 5 in stock\r\n" +
                "D1) U-Chews $0.85 - 5 in stock\r\n" +
                "D2) Little League Chew $0.95 - 5 in stock\r\n" +
                "D3) Chiclets $0.75 - 5 in stock\r\n" +
                "D4) Triplemint $0.75 - 5 in stock\r\n" +
                "\r\n" +
                "Press enter to continue \u001B[H\u001B[2J\r\n" +
                "\u001B[H\u001B[2J\r\n" +
                "\r\n" +
                "**********************\r\n" +
                "Home\r\n" +
                "**********************\r\n" +
                "\r\n" +
                "1) Display Vending Machine Items\r\n" +
                "2) Purchase\r\n" +
                "3) Exit\r\n" +
                "\r\n" +
                "Please make a selection: \u001B[H\u001B[2J\r\n" +
                "\r\n" +
                "Thank you for shopping with Umbrella Corp.";


    }

}
