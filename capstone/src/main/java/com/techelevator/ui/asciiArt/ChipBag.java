package com.techelevator.ui.asciiArt;

import com.techelevator.view.Colors;

public class ChipBag {
    public static void printChipBag() {
        System.out.println("             ____________________");
        System.out.println("            [--------------------]");
        System.out.println("            |                    |");
        System.out.println("            |,,,,,,,,,,,,,,,,,,,,|");
        System.out.println("            |    _    _          |");
        System.out.println("            | __| |_ (_)_ __ ___ |");
        System.out.println("            |/ _| ' \\| | '_ (_-< |");
        System.out.println("            |\\__|_||_|_| .__/__/ |");
        System.out.println("            |          |_|       |");
        System.out.println("            |,,,,,,,,,,,,,,,,,,,,|");
        System.out.println("            |                    |");
        System.out.println("            |                    |");
        System.out.println("            |____________________|");
        System.out.println("            [|||||||||||||||||||||");

    }
    public static void printChipBagWithColor() {
        System.out.println("\t\t\t" + Colors.BLACK + "____________________" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "[--------------------]" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "|                    |" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "|,,,,,,,,,,,,,,,,,,,,|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "|" + Colors.RED + "    _    _          " + Colors.BLACK + "|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "|" + Colors.RED + " __| |_ (_)_ __ ___ " + Colors.BLACK + "|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "|" + Colors.RED + "/ _| ' \\| | '_ (_-< " + Colors.BLACK + "|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "|" + Colors.RED + "\\__|_||_|_| .__/__/ " + Colors.BLACK + "|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "|" + Colors.RED + "          |_|       " + Colors.BLACK + "|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "|,,,,,,,,,,,,,,,,,,,,|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "|                    |" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "|                    |" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "|____________________|" + Colors.RESET + Colors.BLACK);
        System.out.println("\t\t\t"  + Colors.YELLOW_BACKGROUND + "[|||||||||||||||||||||" + Colors.RESET);

    }
}
