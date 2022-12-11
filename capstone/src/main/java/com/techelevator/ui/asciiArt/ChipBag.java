package com.techelevator.ui.asciiArt;

import com.techelevator.view.Colors;

public class ChipBag {
    public static void printChipBag() {
        System.out.println("             ____________________________");
        System.out.println("            [----------------------------]");
        System.out.println("            |                            |");
        System.out.println("            |                            |");
        System.out.println("            |                            |");
        System.out.println("            |,,,,,,,,,,,,,,,,,,,,,,,,,,,,|");
        System.out.println("            |        _    _              |");
        System.out.println("            |     __| |_ (_)_ __ ___     |");
        System.out.println("            |    / _| ' \\| | '_ (_-<     |");
        System.out.println("            |    \\__|_||_|_| .__/__/     |");
        System.out.println("            |              |_|           |");
        System.out.println("            |,,,,,,,,,,,,,,,,,,,,,,,,,,,,|");
        System.out.println("            |                            |");
        System.out.println("            |                            |");
        System.out.println("            |                            |");
        System.out.println("            |                            |");
        System.out.println("            |                            |");
        System.out.println("            [|||||||||||||||||||||||||||||");


    }
    public static void printChipBagWithColor() {
        System.out.println("\t\t" + Colors.BLACK + "____________________________" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "[----------------------------]" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|                            |" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|                            |" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|                            |" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|,,,,,,,,,,,,,,,,,,,,,,,,,,,,|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|" + Colors.RED_BACKGROUND + "        _    _              " + Colors.YELLOW_BACKGROUND + Colors.BLACK + "|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|" + Colors.RED_BACKGROUND + "     __| |_ (_)_ __ ___     " + Colors.YELLOW_BACKGROUND + Colors.BLACK + "|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|" + Colors.RED_BACKGROUND + "    / _| ' \\| | '_ (_-<     " + Colors.YELLOW_BACKGROUND + Colors.BLACK + "|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|" + Colors.RED_BACKGROUND + "    \\__|_||_|_| .__/__/     " + Colors.YELLOW_BACKGROUND + Colors.BLACK + "|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|" + Colors.RED_BACKGROUND + "              |_|           " + Colors.YELLOW_BACKGROUND + Colors.BLACK + "|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|" + Colors.RED_BACKGROUND + ",,,,,,,,,,,,,,,,,,,,,,,,,,,," + Colors.YELLOW_BACKGROUND + Colors.BLACK + "|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|                            |" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|                            |" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|                            |" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|                            |" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "|                            |" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t"  + Colors.YELLOW_BACKGROUND + "[|||||||||||||||||||||||||||||" + Colors.RESET);
    }
}
