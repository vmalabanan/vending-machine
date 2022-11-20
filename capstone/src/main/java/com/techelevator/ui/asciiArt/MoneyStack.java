package com.techelevator.ui.asciiArt;

import com.techelevator.view.Colors;

public class MoneyStack {
    public static void printMoneyStack() {

        System.out.println(Colors.GREEN + "         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  ");
        System.out.println("       @&&&&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @  ");
        System.out.println("      @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@* @ @  ");
        System.out.println("      @@@@@            *$/            &@@@@, @ @  ");
        System.out.println("      @@             $$_||_@@            *@, @ @  ");
        System.out.println("      @@           $$$/  _/$$$            @, @ @  ");
        System.out.println("      @@          ($$$\\_  \\$$$)          @, @ @  ");
        System.out.println("      @@@           $$/_ _/$$#          @@@. @#@  ");
        System.out.println("      @@@@@            $||$             @@@@@@@@    ");
        System.out.println("      *******-----------------------**********.    " + Colors.RESET);

    }

    public static void printMoneyStackWithColor() {
        System.out.println("         " + Colors.GREEN_BACKGROUND + Colors.BLACK + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@" + Colors.RESET + Colors.BLACK);
        System.out.println("       " + Colors.GREEN_BACKGROUND + "@&&&&&&&&@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @" + Colors.RESET + Colors.BLACK);
        System.out.println("      " + Colors.GREEN_BACKGROUND + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@* @ @" + Colors.RESET + Colors.BLACK);
        System.out.println("      " + Colors.GREEN_BACKGROUND + "@@@@@            " + Colors.WHITE_BACKGROUND + "*$/" + Colors.GREEN_BACKGROUND + "            &@@@@, @ @" + Colors.RESET + Colors.BLACK);
        System.out.println("      "  + Colors.GREEN_BACKGROUND + "@@             " + Colors.WHITE_BACKGROUND + "$$_||_@@" + Colors.GREEN_BACKGROUND + "            *@, @ @" + Colors.RESET + Colors.BLACK);
        System.out.println("      "  + Colors.GREEN_BACKGROUND + "@@           " + Colors.WHITE_BACKGROUND + "$$$/  _/$$$" + Colors.GREEN_BACKGROUND + "            @, @ @" + Colors.RESET + Colors.BLACK);
        System.out.println("      "  + Colors.GREEN_BACKGROUND + "@@          " + Colors.WHITE_BACKGROUND + "($$$\\_  \\$$$)" + Colors.GREEN_BACKGROUND + "           @, @ @" + Colors.RESET + Colors.BLACK);
        System.out.println("      "  + Colors.GREEN_BACKGROUND + "@@@           " + Colors.WHITE_BACKGROUND + "$$/_ _/$$#" + Colors.GREEN_BACKGROUND + "          @@@. @#@" + Colors.RESET + Colors.BLACK);
        System.out.println("      "  + Colors.GREEN_BACKGROUND + "@@@@@            " + Colors.WHITE_BACKGROUND + "$||$" + Colors.GREEN_BACKGROUND + "             @@@@@@" + Colors.RESET + Colors.BLACK);
        System.out.println("      "  + Colors.GREEN_BACKGROUND + "*******-----------------------*******" + Colors.RESET);

    }
}
