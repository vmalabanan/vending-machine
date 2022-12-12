package com.techelevator.application;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.*;



import static org.junit.Assert.*;

// These tests are a work in progress

public class MainMenuTest {
    private PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private InputStream standardIn = System.in;
    private VendingMachine vendingMachine;


    @Before
    public void setup(){
        System.setOut(new PrintStream(outputStreamCaptor));
        vendingMachine = new VendingMachine();
        System.setIn(new ByteArrayInputStream("".getBytes()));
    }

    @After
    public void tearDown() throws IOException {
        System.setOut(standardOut);
        System.setIn(standardIn);
    }

//    @Test
//    public void mainMenu_should_display_inventory_screen_if_option_equals_1() {
//        //Arrange
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
///* TODO: Figure out why we're losing bytes between integration tests */
//    @Test
//    public void mainMenu_should_display_purchase_screen_if_option_equals_2() {
//        //Arrange
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
    // Helper Methods

    private String removeWhiteSpace(String original){
        original = original.replaceAll("\n", "");
        original = original.replaceAll("\r", "");
        original = original.replaceAll(" ", "");
        return original;
    }

    private String mainMenu_output_if_option_equals_1() {

        return "[H\u001B[2J_____________________________________|||_________________________|||____________|||||\u001B[47m\u001B[0m||\u001B[41m\u001B[0m||\u001B[44m\u001B[0m||\u001B[46m\u001B[0m|||||'---''---''---''---'||||____________|---||||\u001B[45m\u001B[0m||\u001B[47m\u001B[0m||\u001B[43m\u001B[0m||\u001B[42m\u001B[0m||{ooo}|||'---''---''---''---'|{ooo}|||____________|{ooo}||||\u001B[42m\u001B[0m||\u001B[44m\u001B[0m||\u001B[45m\u001B[0m||\u001B[41m\u001B[0m||---|||'---''---''---''---'|\u001B[32m$$$\u001B[0m|||____________|||||\u001B[43m\u001B[0m||\u001B[46m\u001B[0m||\u001B[41m\u001B[0m||\u001B[44m\u001B[0m|||||'---''---''---''---'|||'_________________________'||___||===================={___}||||||====================|____________________________________**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:\u001B[H\u001B[2J**********************Products**********************\u001B[32m++++++++++++++++++++\t\t\u001B[32m++++++++++++++++++++\t\t\u001B[32m++++++++++++++++++++\t\t\u001B[32m++++++++++++++++++++\t\t\u001B[32m|A1|\t\t\u001B[32m|A2|\t\t\u001B[32m|A3|\t\t\u001B[32m|A4|\t\t\u001B[32m|--------------------|\t\t\u001B[32m|--------------------|\t\t\u001B[32m|--------------------|\t\t\u001B[32m|--------------------|\t\t\u001B[32mCHIP\u001B[32m|PotatoCrisps|\t\t\u001B[32m|Stackers|\t\t\u001B[32m|GrainWaves|\t\t\u001B[32m|CloudPopcorn|\t\t\u001B[32m|$3.05|\t\t\u001B[32m|$1.45|\t\t\u001B[32m|$2.75|\t\t\u001B[32m|$3.65|\t\t\u001B[32m|5instock|\t\t\u001B[32m|5instock|\t\t\u001B[32m|5instock|\t\t\u001B[32m|5instock|\t\t\u001B[32m++++++++++++++++++++\t\t\u001B[32m++++++++++++++++++++\t\t\u001B[32m++++++++++++++++++++\t\t\u001B[32m++++++++++++++++++++\t\t\u001B[36m++++++++++++++++++++\t\t\u001B[36m++++++++++++++++++++\t\t\u001B[36m++++++++++++++++++++\t\t\u001B[36m++++++++++++++++++++\t\t\u001B[36m|B1|\t\t\u001B[36m|B2|\t\t\u001B[36m|B3|\t\t\u001B[36m|B4|\t\t\u001B[36m|--------------------|\t\t\u001B[36m|--------------------|\t\t\u001B[36m|--------------------|\t\t\u001B[36m|--------------------|\t\t\u001B[36mCANDY\u001B[36m|Moonpie|\t\t\u001B[36m|Cowtales|\t\t\u001B[36m|WonkaBar|\t\t\u001B[36m|Crunchie|\t\t\u001B[36m|$1.80|\t\t\u001B[36m|$1.50|\t\t\u001B[36m|$1.50|\t\t\u001B[36m|$1.75|\t\t\u001B[36m|5instock|\t\t\u001B[36m|5instock|\t\t\u001B[36m|5instock|\t\t\u001B[36m|5instock|\t\t\u001B[36m++++++++++++++++++++\t\t\u001B[36m++++++++++++++++++++\t\t\u001B[36m++++++++++++++++++++\t\t\u001B[36m++++++++++++++++++++\t\t\u001B[35m++++++++++++++++++++\t\t\u001B[35m++++++++++++++++++++\t\t\u001B[35m++++++++++++++++++++\t\t\u001B[35m++++++++++++++++++++\t\t\u001B[35m|C1|\t\t\u001B[35m|C2|\t\t\u001B[35m|C3|\t\t\u001B[35m|C4|\t\t\u001B[35m|--------------------|\t\t\u001B[35m|--------------------|\t\t\u001B[35m|--------------------|\t\t\u001B[35m|--------------------|\t\t\u001B[35mDRINK\u001B[35m|Cola|\t\t\u001B[35m|Dr.Salt|\t\t\u001B[35m|MountainMelter|\t\t\u001B[35m|Heavy|\t\t\u001B[35m|$1.25|\t\t\u001B[35m|$1.50|\t\t\u001B[35m|$1.50|\t\t\u001B[35m|$1.50|\t\t\u001B[35m|5instock|\t\t\u001B[35m|5instock|\t\t\u001B[35m|5instock|\t\t\u001B[35m|5instock|\t\t\u001B[35m++++++++++++++++++++\t\t\u001B[35m++++++++++++++++++++\t\t\u001B[35m++++++++++++++++++++\t\t\u001B[35m++++++++++++++++++++\t\t\u001B[33m++++++++++++++++++++\t\t\u001B[33m++++++++++++++++++++\t\t\u001B[33m++++++++++++++++++++\t\t\u001B[33m++++++++++++++++++++\t\t\u001B[33m|D1|\t\t\u001B[33m|D2|\t\t\u001B[33m|D3|\t\t\u001B[33m|D4|\t\t\u001B[33m|--------------------|\t\t\u001B[33m|--------------------|\t\t\u001B[33m|--------------------|\t\t\u001B[33m|--------------------|\t\t\u001B[33mGUM\u001B[33m|U-Chews|\t\t\u001B[33m|LittleLeagueChew|\t\t\u001B[33m|Chiclets|\t\t\u001B[33m|Triplemint|\t\t\u001B[33m|$0.85|\t\t\u001B[33m|$0.95|\t\t\u001B[33m|$0.75|\t\t\u001B[33m|$0.75|\t\t\u001B[33m|5instock|\t\t\u001B[33m|5instock|\t\t\u001B[33m|5instock|\t\t\u001B[33m|5instock|\t\t\u001B[33m++++++++++++++++++++\t\t\u001B[33m++++++++++++++++++++\t\t\u001B[33m++++++++++++++++++++\t\t\u001B[33m++++++++++++++++++++\t\t\u001B[0mPressentertocontinue\u001B[H\u001B[2J\u001B[H\u001B[2J_____________________________________|||_________________________|||____________|||||\u001B[47m\u001B[0m||\u001B[41m\u001B[0m||\u001B[44m\u001B[0m||\u001B[46m\u001B[0m|||||'---''---''---''---'||||____________|---||||\u001B[45m\u001B[0m||\u001B[47m\u001B[0m||\u001B[43m\u001B[0m||\u001B[42m\u001B[0m||{ooo}|||'---''---''---''---'|{ooo}|||____________|{ooo}||||\u001B[42m\u001B[0m||\u001B[44m\u001B[0m||\u001B[45m\u001B[0m||\u001B[41m\u001B[0m||---|||'---''---''---''---'|\u001B[32m$$$\u001B[0m|||____________|||||\u001B[43m\u001B[0m||\u001B[46m\u001B[0m||\u001B[41m\u001B[0m||\u001B[44m\u001B[0m|||||'---''---''---''---'|||'_________________________'||___||===================={___}||||||====================|____________________________________**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:\u001B[H\u001B[2J\u001B[31m,,,,,,,////////,,,///////////////,,,,///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////**///////////////////////////////**///////////////////////////////////////*//////////////////////////////////////*//////////////////////////////////////*/////////////////////////////////////*///////////////,,/////////////////////////////////,,//////////////////////////////,,*,,,,,/////////////////////////,,.///////////////////,,,/////////////\u001B[0mThankyouforshoppingwithUmbrellaCorporation.\u001B[31m\"OurBusinessIsLifeItself.\"\u001B[0m";
    }

    private String mainMenu_output_if_option_equals_2() {
        return "[H\u001B[2J_____________________________________|||_________________________|||____________|||||\u001B[47m\u001B[0m||\u001B[41m\u001B[0m||\u001B[44m\u001B[0m||\u001B[46m\u001B[0m|||||'---''---''---''---'||||____________|---||||\u001B[45m\u001B[0m||\u001B[47m\u001B[0m||\u001B[43m\u001B[0m||\u001B[42m\u001B[0m||{ooo}|||'---''---''---''---'|{ooo}|||____________|{ooo}||||\u001B[42m\u001B[0m||\u001B[44m\u001B[0m||\u001B[45m\u001B[0m||\u001B[41m\u001B[0m||---|||'---''---''---''---'|\u001B[32m$$$\u001B[0m|||____________|||||\u001B[43m\u001B[0m||\u001B[46m\u001B[0m||\u001B[41m\u001B[0m||\u001B[44m\u001B[0m|||||'---''---''---''---'|||'_________________________'||___||===================={___}||||||====================|____________________________________**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:\u001B[H\u001B[2J\u001B[H\u001B[2J_____________________________________|||_________________________|||____________|||||\u001B[47m\u001B[0m||\u001B[41m\u001B[0m||\u001B[44m\u001B[0m||\u001B[46m\u001B[0m|||||'---''---''---''---'||||____________|---||||\u001B[45m\u001B[0m||\u001B[47m\u001B[0m||\u001B[43m\u001B[0m||\u001B[42m\u001B[0m||{ooo}|||'---''---''---''---'|{ooo}|||____________|{ooo}||||\u001B[42m\u001B[0m||\u001B[44m\u001B[0m||\u001B[45m\u001B[0m||\u001B[41m\u001B[0m||---|||'---''---''---''---'|\u001B[32m$$$\u001B[0m|||____________|||||\u001B[43m\u001B[0m||\u001B[46m\u001B[0m||\u001B[41m\u001B[0m||\u001B[44m\u001B[0m|||||'---''---''---''---'|||'_________________________'||___||===================={___}||||||====================|____________________________________Balance:$0.001)FeedMoney2)SelectProduct3)FinishTransactionPleasemakeaselection:\u001B[H\u001B[2JPressentertocontinue\u001B[H\u001B[2J_____________________________________|||_________________________|||____________|||||\u001B[47m\u001B[0m||\u001B[41m\u001B[0m||\u001B[44m\u001B[0m||\u001B[46m\u001B[0m|||||'---''---''---''---'||||____________|---||||\u001B[45m\u001B[0m||\u001B[47m\u001B[0m||\u001B[43m\u001B[0m||\u001B[42m\u001B[0m||{ooo}|||'---''---''---''---'|{ooo}|||____________|{ooo}||||\u001B[42m\u001B[0m||\u001B[44m\u001B[0m||\u001B[45m\u001B[0m||\u001B[41m\u001B[0m||---|||'---''---''---''---'|\u001B[32m$$$\u001B[0m|||____________|||||\u001B[43m\u001B[0m||\u001B[46m\u001B[0m||\u001B[41m\u001B[0m||\u001B[44m\u001B[0m|||||'---''---''---''---'|||'_________________________'||___||===================={___}||||||====================|____________________________________**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:\u001B[H\u001B[2J\u001B[31m,,,,,,,////////,,,///////////////,,,,///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////**///////////////////////////////**///////////////////////////////////////*//////////////////////////////////////*//////////////////////////////////////*/////////////////////////////////////*///////////////,,/////////////////////////////////,,//////////////////////////////,,*,,,,,/////////////////////////,,.///////////////////,,,/////////////\u001B[0mThankyouforshoppingwithUmbrellaCorporation.\u001B[31m\"OurBusinessIsLifeItself.\"\u001B[0m";
    }

    public String mainMenu_if_option_equals_3(){
        return "[H\u001B[2J**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:\u001B[H\u001B[2JThankyouforshoppingwithUmbrellaCorp.";
    }

    public String mainMenu_output_if_option_equals_error(){
        return "[H\u001B[2J**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:\u001B[H\u001B[2JInvalidselection.PleasetryagainPressentertocontinue\u001B[H\u001B[2J**********************Home**********************1)DisplayVendingMachineItems2)Purchase3)ExitPleasemakeaselection:\u001B[H\u001B[2JThankyouforshoppingwithUmbrellaCorp.";
    }
}
