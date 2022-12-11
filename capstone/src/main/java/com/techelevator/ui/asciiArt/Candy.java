package com.techelevator.ui.asciiArt;

import com.techelevator.view.Colors;

public class Candy {
    public static void printCandy() {
        System.out.println("\t\t           ______");
        System.out.println("\t\t___      .' /:::::.      ___");
        System.out.println("\t\t\\  '-.  /  (:::::-'\\  .-'  /");
        System.out.println("\t\t >_-=.\\/:\\___\\/___  \\/.=-_<");
        System.out.println("\t\t > -='/\\:::::/\\::::\\/\\'=- <");
        System.out.println("\t\t/__.-'  \\:::'  ):::/  '-.__\\");
        System.out.println("\t\t         '.___/:::'");

    }

    public static void printCandyWithColor() {
        System.out.println(Colors.RED + "\t\t           ______");
        System.out.println("\t\t___      .' /:::::.      ___");
        System.out.println("\t\t\\  '-.  /  (:::::-'\\  .-'  /");
        System.out.println("\t\t >_-=.\\/:\\___\\/___  \\/.=-_<");
        System.out.println("\t\t > -='/\\:::::/\\::::\\/\\'=- <");
        System.out.println("\t\t/__.-'  \\:::'  ):::/  '-.__\\");
        System.out.println("\t\t         '.___/:::'" + Colors.RESET);

    }

}
