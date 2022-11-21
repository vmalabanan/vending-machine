package com.techelevator.application;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;



import static org.junit.Assert.*;

// This test is a work in progress

public class MainMenuTest {
//    private PrintStream standardOut = System.out;
//    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
//    private InputStream standardIn = System.in;
//
//
//
//
//    @Before
//    public void setup(){
//        System.setOut(new PrintStream(outputStreamCaptor));
//        System.setIn(standardIn);
//
//    }
//
//    @After
//    public void tearDown() throws IOException {
//        System.setOut(standardOut);
//        System.setIn(standardIn);
//    }
//
//    @Test
//    public void mainMenu_should_display_inventory_screen_if_option_equals_1() throws IOException {
//        //Arrange
//        VendingMachine vendingMachine = new VendingMachine();
//        ByteArrayInputStream inOne = new ByteArrayInputStream("1\n\n3\n".getBytes());
//        System.setIn(inOne);
//        String expected = mainMenu_output_if_option_equals_1().trim();
//
//        //Act
//        vendingMachine.mainMenu();
//        String actual = outputStreamCaptor.toString().trim();
//
//        expected = removeWhiteSpace(expected);
//        actual = removeWhiteSpace(actual);
//
//        //Assert
//        assertEquals("Because the inventory screen should display if you select option 1", expected, actual);
//
//    }
//
//    @Test
//    public void mainMenu_should_display_purchase_screen_if_option_equals_2() {
//        //Arrange
//        VendingMachine vendingMachine = new VendingMachine();
//        ByteArrayInputStream inTwo = new ByteArrayInputStream("2\n3\n\n3\n".getBytes());
//        System.setIn(inTwo);
//        String expected = mainMenu_output_if_option_equals_2().trim();
//
//        //Act
//        vendingMachine.mainMenu();
//        String actual = outputStreamCaptor.toString().trim();
//
//        expected = removeWhiteSpace(expected);
//        actual = removeWhiteSpace(actual);
//
//        //Assert
//        assertEquals("Because the purchaseMenu screen should display if you select option 2", expected, actual);
//
//    }
//
//    @Test
//    public void mainMenu_should_display_goodbye_screen_if_option_equals_3() {
//
//        //Arrange
//        VendingMachine vendingMachine = new VendingMachine();
//        ByteArrayInputStream inThree = new ByteArrayInputStream("3\n".getBytes());
//        System.setIn(inThree);
//        String expected = mainMenu_if_option_equals_3();
//
//        //Act
//        vendingMachine.mainMenu();
//        String actual = outputStreamCaptor.toString().trim();
//
//        expected = removeWhiteSpace(expected);
//        actual = removeWhiteSpace(actual);
//
//        //Assert
//        assertEquals("Because the goodbye screen should display if you select option 3", expected, actual);
//
//    }
//
//    @Test
//    public void mainMenu_should_invalid_selection_error_if_option_equals_invalid() {
//        //Arrange
//        VendingMachine vendingMachine = new VendingMachine();
//        ByteArrayInputStream inFour = new ByteArrayInputStream("G\n\n3\n".getBytes());
//        System.setIn(inFour);
//        String expected = mainMenu_output_if_option_equals_error();
//
//        //Act
//        vendingMachine.mainMenu();
//        String actual = outputStreamCaptor.toString().trim();
//
//        expected = removeWhiteSpace(expected);
//        actual = removeWhiteSpace(actual);
//
//        //Assert
//        assertEquals("Because the invalid selection error should display if you select invalid option", expected, actual);
//
//    }
//
//
//    // Helper Methods
//
//    private String removeWhiteSpace(String original){
//        original = original.replaceAll("\n", "");
//        original = original.replaceAll("\r", "");
//        original = original.replaceAll(" ", "");
//        return original;
//    }
//
//    private String mainMenu_output_if_option_equals_1() {
//
//        return "[H[2J**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:[H[2J**********************Products**********************A1)PotatoCrisps$3.05-5instockA2)Stackers$1.45-5instockA3)GrainWaves$2.75-5instockA4)CloudPopcorn$3.65-5instockB1)Moonpie$1.80-5instockB2)Cowtales$1.50-5instockB3)WonkaBar$1.50-5instockB4)Crunchie$1.75-5instockC1)Cola$1.25-5instockC2)Dr.Salt$1.50-5instockC3)MountainMelter$1.50-5instockC4)Heavy$1.50-5instockD1)U-Chews$0.85-5instockD2)LittleLeagueChew$0.95-5instockD3)Chiclets$0.75-5instockD4)Triplemint$0.75-5instockPressentertocontinue[H[2J[H[2J**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:[H[2JThankyouforshoppingwithUmbrellaCorp.";
//    }
//
//    private String mainMenu_output_if_option_equals_2() {
//        return "[H[2J**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:[H[2J[H[2JBalance:$0.001)FeedMoney2)SelectProduct3)FinishTransactionPleasemakeaselection:[H[2JPressentertocontinue[H[2J**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:[H[2JThankyouforshoppingwithUmbrellaCorp.";
//    }
//
//    public String mainMenu_if_option_equals_3(){
//        return "[H\u001B[2J**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:\u001B[H\u001B[2JThankyouforshoppingwithUmbrellaCorp.";
//    }
//
//    public String mainMenu_output_if_option_equals_error(){
//        return "[H\u001B[2J**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:\u001B[H\u001B[2JInvalidselection.PleasetryagainPressentertocontinue\u001B[H\u001B[2J**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:\u001B[H\u001B[2JThankyouforshoppingwithUmbrellaCorp.";
//    }
}
