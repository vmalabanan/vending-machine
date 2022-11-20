package com.techelevator.ui.asciiArt;

import com.techelevator.view.Colors;

public class Soda {
    public static void printSoda() {

        System.out.println("                |||||||");
        System.out.println("               ,|||||||,");
        System.out.println("              .'       '.");
        System.out.println("            _/           \\_");
        System.out.println("           /               \\");
        System.out.println("          /                 \\");
        System.out.println("         /                   \\");
        System.out.println("        /                     \\");
        System.out.println("       ;'_____________________';");
        System.out.println("       |  ____   ___  ____  _  |");
        System.out.println("       | |  _ \\ / _ \\|  _ \\| | |");
        System.out.println("       | | |_) | | | | |_) | | |");
        System.out.println("       | |  __/| |_| |  __/|_| |");
        System.out.println("       | |_|    \\___/|_|   (_) |");
        System.out.println("       |'---------------------'|");
        System.out.println("       |                       |");
        System.out.println("       |                       |");
        System.out.println("       |                       |");
        System.out.println("       |                       |");
        System.out.println("       |                       |");
        System.out.println("       \\                      /");
        System.out.println("        \\                    /");
        System.out.println("         '._._.''._._.'._._.'");
    }

    public static void printSodaWithColor() {

        System.out.println("\t\t\t         |||||||");
        System.out.println("\t\t\t        ,|||||||,");
        System.out.println("\t\t\t       .'       '.");
        System.out.println("\t\t\t     _/           \\_");
        System.out.println("\t\t\t    /               \\");
        System.out.println("\t\t\t   /                 \\");
        System.out.println("\t\t\t  /                   \\");
        System.out.println("\t\t\t /                     \\");
        System.out.println("\t\t\t;'_____________________';");
        System.out.println("\t\t\t|" + Colors.RED_BACKGROUND + Colors.BLACK + "  ____   ___  ____  _  " + Colors.RESET + "|");
        System.out.println("\t\t\t|" + Colors.RED_BACKGROUND + Colors.BLACK + " |  _ \\ / _ \\|  _ \\| | " + Colors.RESET + "|");
        System.out.println("\t\t\t|" + Colors.RED_BACKGROUND + Colors.BLACK + " | |_) | | | | |_) | | " + Colors.RESET + "|");
        System.out.println("\t\t\t|" + Colors.RED_BACKGROUND + Colors.BLACK + " |  __/| |_| |  __/|_| " + Colors.RESET + "|");
        System.out.println("\t\t\t|" + Colors.RED_BACKGROUND + Colors.BLACK + " |_|    \\___/|_|   (_) " + Colors.RESET + "|");
        System.out.println("\t\t\t|" + Colors.RED_BACKGROUND + Colors.BLACK + "'---------------------'" + Colors.RESET + "|");
        System.out.println("\t\t\t|                       |");
        System.out.println("\t\t\t|                       |");
        System.out.println("\t\t\t|                       |");
        System.out.println("\t\t\t|                       |");
        System.out.println("\t\t\t|                       |");
        System.out.println("\t\t\t\\                      /");
        System.out.println("\t\t\t \\                    /");
        System.out.println("\t\t\t  '._._.''._._.'._._.'");
    }
}
