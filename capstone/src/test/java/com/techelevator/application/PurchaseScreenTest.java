package com.techelevator.application;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

//public class PurchaseScreenTest {
//    private final PrintStream standardOut = System.out;
//    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
//    private final InputStream standardIn = System.in;
//    private VendingMachine vendingMachine;
//
//
//    @Before
//    public void setup(){
//        vendingMachine = new VendingMachine();
//        System.setOut(new PrintStream(outputStreamCaptor));
//    }
//
//    @After
//    public void tearDown(){
//        System.setOut(standardOut);
//        System.setIn(standardIn);
//    }
//
//    @Test
//    public void purchase_should_display_feedMoney_screen_if_option_equals_1() {
//        //Arrange
//        ByteArrayInputStream in = new ByteArrayInputStream("1\n10\nN\n3\n\n".getBytes());
//        System.setIn(in);
//        String expected = purchase_screen_option_1();
//
//        //Act
//        vendingMachine.purchase();
//        String actual = outputStreamCaptor.toString().trim();
//
//        expected = removeWhiteSpace(expected);
//        actual = removeWhiteSpace(actual);
//
//        //Assert
//        assertEquals("Because the Feed Money screen should display if you select option 1", expected, actual);
//
//    }
//
//    @Test
//    public void purchase_should_display_purchase_product_screen_if_option_equals_2() {
//        //Arrange
//        ByteArrayInputStream in = new ByteArrayInputStream("2\n\n3\n\n".getBytes());
//        System.setIn(in);
//        String expected = purchase_screen_option_2();
//
//        //Act
//        vendingMachine.purchase();
//        String actual = outputStreamCaptor.toString().trim();
//
//        expected = removeWhiteSpace(expected);
//        actual = removeWhiteSpace(actual);
//
//        //Assert
//        assertEquals("Because the Purchase Item screen should display if you select option 1", expected, actual);
//
//    }
//
//    @Test
//    public void purchase_should_display_dispense_change_screen_if_option_equals_3() {
//        //Arrange
//        ByteArrayInputStream in = new ByteArrayInputStream("3\n\n".getBytes());
//        System.setIn(in);
//        String expected = purchase_screen_option_3();
//
//        //Act
//        vendingMachine.purchase();
//        String actual = outputStreamCaptor.toString().trim();
//
//        expected = removeWhiteSpace(expected);
//        actual = removeWhiteSpace(actual);
//
//        //Assert
//        assertEquals("Because the Main Menu screen should display if you select option 3", expected, actual);
//
//    }
//
//    @Test
//    public void purchase_should_display_invalid_selection_error_if_option_equals_error() {
//        //Arrange
//        ByteArrayInputStream in = new ByteArrayInputStream("G\n\n3\n\n".getBytes());
//        System.setIn(in);
//        String expected = purchase_screen_option_error();
//
//        //Act
//        vendingMachine.purchase();
//        String actual = outputStreamCaptor.toString().trim();
//
//        expected = removeWhiteSpace(expected);
//        actual = removeWhiteSpace(actual);
//
//        //Assert
//        assertEquals("Because invalid selection error should display if you select option 3", expected, actual);
//
//    }
//
//
//    // Helper Methods
//    private String removeWhiteSpace(String original){
//        original = original.replaceAll("\n", "");
//        original = original.replaceAll("\r", "");
//        original = original.replaceAll(" ", "");
//        return original;
//    }
//
//    public String purchase_screen_option_1(){
//        return "[H\u001B[2JBalance:$0.001)FeedMoney2)SelectProduct3)FinishTransactionPleasemakeaselection:\u001B[H\u001B[2JBalance:$0.00Pleaseenterthedollaramountyouwishtoadd:$Balance:$10.00Addmoremoney?(Y/N):\u001B[H\u001B[2JBalance:$10.001)FeedMoney2)SelectProduct3)FinishTransactionPleasemakeaselection:\u001B[H\u001B[2JHere'syourchange!1x$10------------Totalchange:$10.00Pressentertocontinue";
//    }
//
//    public String purchase_screen_option_2(){
//        return "[H\u001B[2JBalance:$0.001)FeedMoney2)SelectProduct3)FinishTransactionPleasemakeaselection:\u001B[H\u001B[2J**********************Products**********************A1)PotatoCrisps$3.05-5instockA2)Stackers$1.45-5instockA3)GrainWaves$2.75-5instockA4)CloudPopcorn$3.65-5instockB1)Moonpie$1.80-5instockB2)Cowtales$1.50-5instockB3)WonkaBar$1.50-5instockB4)Crunchie$1.75-5instockC1)Cola$1.25-5instockC2)Dr.Salt$1.50-5instockC3)MountainMelter$1.50-5instockC4)Heavy$1.50-5instockD1)U-Chews$0.85-5instockD2)LittleLeagueChew$0.95-5instockD3)Chiclets$0.75-5instockD4)Triplemint$0.75-5instockBalance:$0.00Pleaseinputfunds.Pressentertoreturntopreviousscreen.\u001B[H\u001B[2JBalance:$0.001)FeedMoney2)SelectProduct3)FinishTransactionPleasemakeaselection:\u001B[H\u001B[2JPressentertocontinue";
//    }
//
//    public String purchase_screen_option_3(){
//        return "[H\u001B[2JBalance:$0.001)FeedMoney2)SelectProduct3)FinishTransactionPleasemakeaselection:\u001B[H\u001B[2JPressentertocontinue";
//    }
//
//    public String purchase_screen_option_error(){
//        return "[H\u001B[2JBalance:$0.001)FeedMoney2)SelectProduct3)FinishTransactionPleasemakeaselection:Invalidselection.PleasetryagainPressentertocontinue\u001B[H\u001B[2JBalance:$0.001)FeedMoney2)SelectProduct3)FinishTransactionPleasemakeaselection:\u001B[H\u001B[2JPressentertocontinue";
//    }
//}
