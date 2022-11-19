package com.techelevator.ui.asciiArt;

import com.techelevator.view.Colors;

public class MoneyStack {
    public static void printMoneyStack() {

        System.out.println(Colors.GREEN + "         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  ");
        System.out.println("       @&&&&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @  ");
        System.out.println("      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@* @ @  ");
        System.out.println("      @@@@@            *$/            &@@@@, @ @  ");
        System.out.println("      @@           *$$$# .#@@&           *@, @ @  ");
        System.out.println("      @@          %$$$  $$$$$$$           @, @ @  ");
        System.out.println("      @@          ($$$$$ , $$$$           @, @ @  ");
        System.out.println("      @@@           $$$$ $$$$#          @@@. @#@  ");
        System.out.println("      @@@@@                            @@@@@@@@    ");
        System.out.println("      *******-----------------------**********.    " + Colors.RESET);


    }

    public static void printMoneyStackWithColor() {
        System.out.println(Colors.GREEN + "         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  ");
        System.out.println("       @&&&&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @  ");
        System.out.println("      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@* @ @  ");
        System.out.println("      @@@@@            " + Colors.RESET + "*$/" + Colors.GREEN + "            &@@@@, @ @  ");
        System.out.println("      @@           " + Colors.RESET + "*$$$# .#@@&" + Colors.GREEN + "           *@, @ @  ");
        System.out.println("      @@          " + Colors.RESET + "%$$$  $$$$$$$" + Colors.GREEN + "           @, @ @  ");
        System.out.println("      @@          " + Colors.RESET + "($$$$$ , $$$$" + Colors.GREEN + "           @, @ @  ");
        System.out.println("      @@@           " + Colors.RESET + "$$$$ $$$$#" + Colors.GREEN + "          @@@. @#@  ");
        System.out.println("      @@@@@                            @@@@@@@@    ");
        System.out.println("      *******-----------------------**********.    " + Colors.RESET);

    }
}
