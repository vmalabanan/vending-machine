package com.techelevator.ui.asciiArt;

import com.techelevator.view.Colors;

public class Gum {
    public static void printGum() {
        System.out.println("        __________________________________");
        System.out.println("       /      ___  __  __ ___ ___        / \\");
        System.out.println("      /     / __ `/ / / / __ `__ \\      /  /");
        System.out.println("     /     / /_/ / /_/ / / / / / /     /  /");
        System.out.println("    /      \\__, /\\__,_/_/ /_/ /_/     /  /");
        System.out.println("   /      /____/                     /  /");
        System.out.println("  /_________________________________/  /");
        System.out.println("  \\__________________________________\\/");
        System.out.println("  ");
    }

    public static void printGumWithColor() {
        System.out.println("           " + Colors.BLACK + "__________________________________");
        System.out.println("          " + Colors.CYAN_BACKGROUND + "/      ___  __  __ ___ ___        / \\" + Colors.RESET + Colors.BLACK);
        System.out.println("         " + Colors.CYAN_BACKGROUND + "/     / __ `/ / / / __ `__ \\      /  /" + Colors.RESET + Colors.BLACK);
        System.out.println("        " + Colors.CYAN_BACKGROUND + "/     / /_/ / /_/ / / / / / /     /  /" + Colors.RESET + Colors.BLACK);
        System.out.println("       " + Colors.CYAN_BACKGROUND + "/      \\__, /\\__,_/_/ /_/ /_/     /  /" + Colors.RESET + Colors.BLACK);
        System.out.println("      " + Colors.CYAN_BACKGROUND + "/      /____/                     /  /" + Colors.RESET + Colors.BLACK);
        System.out.println("     " + Colors.CYAN_BACKGROUND + "/_________________________________/  /" + Colors.RESET + Colors.BLACK);
        System.out.println("     " + Colors.CYAN_BACKGROUND + "\\__________________________________\\/" + Colors.RESET + Colors.BLACK + Colors.RESET);
      }
}
