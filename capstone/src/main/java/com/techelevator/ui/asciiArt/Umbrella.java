package com.techelevator.ui.asciiArt;

import com.techelevator.view.Colors;

import java.awt.*;

public class Umbrella {

    public static void printUmbrella() {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@ , @@             @@ . @@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@  **, @@@@@@@@@@@@@@@ ***  @@@@@@@@@@@");
        System.out.println("@@@@@@@@@@  ****** @@@@@@@@@@@@@ ******  @@@@@@@@@");
        System.out.println("@@@@@@@@  ********* @@@@@@@@@@@ *********  @@@@@@@");
        System.out.println("@@@@&  ************* @@@@@@@@@ *************  @@@@");
        System.out.println("@  ****************** @@@@@@@ ******************"  );
        System.out.println("@  @@@   ************* @@@@@ *************   @@@ %");
        System.out.println("@@ @@@@@@@@@   ******** @@@ *******,   @@@@@@@@. @");
        System.out.println("@@  @@@@@@@@@@@@@@   ,** @ **,   @@@@@@@@@@@@@@ ,@");
        System.out.println("@@% @@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@@@@@@ @@");
        System.out.println("@@. @@@@@@@@@@@@@@   *** @ ***   @@@@@@@@@@@@@@ @@");
        System.out.println("@@ @@@@@@@@&   ******** @@@ ********   @@@@@@@@, @");
        System.out.println("@% @@%   ************* @@@@@ *************   @@@ @");
        System.out.println("@  ****************** @@@@@@@ ******************"  );
        System.out.println("@@@@@  ************* @@@@@@@@@ *************  @@@@");
        System.out.println("@@@@@@@@  ********* @@@@@@@@@@@ *********  @@@@@@@");
        System.out.println("@@@@@@@@@@( ****** @@@@@@@@@@@@@ ****** @@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@  **, @@@@@@@@@@@@@@@ *** (@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@ . @,             /@   @@@@@@@@@@@@@");
    }

    public static void printUmbrellaWithColor() {
        System.out.println(Colors.BLACK + "@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%@@@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@ " + Colors.RED + "," + Colors.RESET + " @@             @@ " + Colors.RED + "." + Colors.BLACK + " @@@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@  " + Colors.RED + "**," + Colors.RESET + " @@@@@@@@@@@@@@@ " + Colors.RED + "***" + Colors.BLACK + "  @@@@@@@@@@@");
        System.out.println("@@@@@@@@@@  " + Colors.RED + "******" + Colors.RESET + " @@@@@@@@@@@@@" + Colors.RED + "******" + Colors.BLACK + "  @@@@@@@@@");
        System.out.println("@@@@@@@@  " + Colors.RED + "*********" + Colors.RESET + " @@@@@@@@@@@ " + Colors.RED + "*********" + Colors.BLACK + " @@@@@@@");
        System.out.println("@@@@&  " + Colors.RED + "*************" + Colors.RESET + " @@@@@@@@@ " + Colors.RED + "*************" + Colors.BLACK + "  @@@@");
        System.out.println("@  " + Colors.RED + "******************" + Colors.RESET + " @@@@@@@ " + Colors.RED + "******************" + Colors.BLACK);
        System.out.println("@"  + Colors.RESET + "@@@   "  + Colors.RED + "*************" + Colors.RESET + "@@@@@ " + Colors.RED + "*************" + Colors.RESET + "   @@@ %");
        System.out.println(Colors.BLACK + "@@" + Colors.RESET + "@@@@@@@@@   " + Colors.RED + "********" + Colors.RESET + " @@@ "  + Colors.RED + "*******," + Colors.RESET + "   @@@@@@@@." + Colors.BLACK + " @");
        System.out.println("@ " + Colors.RESET + "@@@@@@@@@@@@@@@@@ " + Colors.RED + ",**" + Colors.RESET + " @ " + Colors.RED + "**," + Colors.RESET + "   @@@@@@@@@@@@@@" + Colors.BLACK + " ,@");
        System.out.println("@@%" + Colors.RESET + "@@@@@@@@@@@@@@@@@@@@ " + Colors.RED + "*" + Colors.RESET +" @@@@@@@@@@@@@@@@@@@@ " + Colors.BLACK + "@@");
        System.out.println("@@" + Colors.RESET + ".@@@@@@@@@@@@@@   " + Colors.RED + "***" + Colors.RESET + " @ "  + Colors.RED + "***" + Colors.RESET + "   @@@@@@@@@@@@@@" + Colors.BLACK + " @@");
        System.out.println("@@" + Colors.RESET + "@@@@@@@@&   " + Colors.RED + "********" + Colors.RESET + " @@@ " + Colors.RED + "********" + Colors.RESET + "   @@@@@@@@," + Colors.BLACK + " @");
        System.out.println("@" + Colors.RESET + "%@@%   " + Colors.RED + "*************" + Colors.RESET + " @@@@@ " + Colors.RED + "*************" + Colors.RESET + "   @@@" + Colors.BLACK + " @");
        System.out.println("@  " + Colors.RED + "******************" + Colors.RESET + " @@@@@@@ " + Colors.RED + "******************"  + Colors.BLACK );
        System.out.println("@@@@@  " + Colors.RED + "*************" + Colors.RESET + " @@@@@@@@@ " + Colors.RED + "*************" + Colors.BLACK + "  @@@@");
        System.out.println("@@@@@@@@  " + Colors.RED + "*********" + Colors.RESET + " @@@@@@@@@@@ " + Colors.RED + "*********" + Colors.BLACK + "  @@@@@@@");
        System.out.println("@@@@@@@@@@( " + Colors.RED + "******" + Colors.RESET + " @@@@@@@@@@@@@ " + Colors.RED + "******" + Colors.BLACK + " @@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@  " + Colors.RED + "**," + Colors.RESET + " @@@@@@@@@@@@@@@ " + Colors.RED + "***" + Colors.BLACK + " (@@@@@@@@@@@");
        System.out.println("@@@@@@@@@@@@@@ " + Colors.RED + "." + Colors.RESET + " @,             /@" + Colors.RED + "." + Colors.BLACK + "  @@@@@@@@@@@@@" + Colors.RESET);
    }
}
