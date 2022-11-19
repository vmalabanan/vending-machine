package com.techelevator.ui.asciiArt;

import com.techelevator.view.Colors;

public class VendingMachineArt {
    public static void printVendingMachineArt() {
        System.out.println(" _____________________________________");
        System.out.println("|                                     |");
        System.out.println("|    _________________________        |");
        System.out.println("|   |  ___   ___   ___   ___  |       |");
        System.out.println("|   | |   | |   | |   | |   | |       |");
        System.out.println("|   | '---' '---' '---' '---' |       |");
        System.out.println("|   |  ___   ___   ___   ___  |  ---  |");
        System.out.println("|   | |   | |   | |   | |   | | {ooo} |");
        System.out.println("|   | '---' '---' '---' '---' | {ooo} |");
        System.out.println("|   |  ___   ___   ___   ___  | {ooo} |");
        System.out.println("|   | |   | |   | |   | |   | |  ---  |");
        System.out.println("|   | '---' '---' '---' '---' |  $$$  |");
        System.out.println("|   |  ___   ___   ___   ___  |       |");
        System.out.println("|   | |   | |   | |   | |   | |       |");
        System.out.println("|   | '---' '---' '---' '---' |       |");
        System.out.println("|   '_________________________'       |");
        System.out.println("|                               ___   |");
        System.out.println("|      ====================    {___}  |");
        System.out.println("|     |                    |          |");
        System.out.println("|      ====================           |");
        System.out.println(" ____________________________________");
    }

    public static void printVendingMachineArtWithColor() {
        System.out.println(" _____________________________________");
        System.out.println("|                                     |");
        System.out.println("|    _________________________        |");
        System.out.println("|   |  ___   ___   ___   ___  |       |");
        System.out.println("|   | |" + Colors.WHITE_BACKGROUND + "   " + Colors.RESET + "| |" + Colors.RED_BACKGROUND + "   " + Colors.RESET + "| |" + Colors.BLUE_BACKGROUND + "   " + Colors.RESET + "| |" + Colors.CYAN_BACKGROUND + "   " + Colors.RESET + "| |       |");
        System.out.println("|   | '---' '---' '---' '---' |       |");
        System.out.println("|   |  ___   ___   ___   ___  |  ---  |");
        System.out.println("|   | |" + Colors.PURPLE_BACKGROUND + "   " + Colors.RESET + "| |" + Colors.WHITE_BACKGROUND + "   " + Colors.RESET + "| |" + Colors.YELLOW_BACKGROUND + "   " + Colors.RESET + "| |" + Colors.GREEN_BACKGROUND + "   " + Colors.RESET + "| | {ooo} |");
        System.out.println("|   | '---' '---' '---' '---' | {ooo} |");
        System.out.println("|   |  ___   ___   ___   ___  | {ooo} |");
        System.out.println("|   | |"  + Colors.GREEN_BACKGROUND + "   " + Colors.RESET + "| |" + Colors.BLUE_BACKGROUND + "   " + Colors.RESET + "| |" + Colors.PURPLE_BACKGROUND + "   " + Colors.RESET + "| |" + Colors.RED_BACKGROUND + "   " + Colors.RESET + "| |  ---  |");
        System.out.println("|   | '---' '---' '---' '---' |  " + Colors.GREEN + "$$$" + Colors.RESET+ "  |");
        System.out.println("|   |  ___   ___   ___   ___  |       |");
        System.out.println("|   | |" + Colors.YELLOW_BACKGROUND + "   " + Colors.RESET + "| |" + Colors.CYAN_BACKGROUND + "   " + Colors.RESET + "| |" + Colors.RED_BACKGROUND + "   " + Colors.RESET + "| |" + Colors.BLUE_BACKGROUND + "   " + Colors.RESET + "| |       |");
        System.out.println("|   | '---' '---' '---' '---' |       |");
        System.out.println("|   '_________________________'       |");
        System.out.println("|                               ___   |");
        System.out.println("|      ====================    {___}  |");
        System.out.println("|     |                    |          |");
        System.out.println("|      ====================           |");
        System.out.println(" ____________________________________");
    }
}
