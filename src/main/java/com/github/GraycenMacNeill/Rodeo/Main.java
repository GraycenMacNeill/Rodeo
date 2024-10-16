package com.github.GraycenMacNeill.Rodeo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int choice;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();


        Functions.loadingScreen();

        UIManager.typeOut(UIManager.GRAY + UIManager.ITALICIZED + "You’re lost in deep sleep, the kind that feels endless, until a sudden, violent banging shatters", 20);
        UIManager.typeOut("the silence. It’s coming from outside, each thud growing louder, more urgent… something’s out there,", 20);
        UIManager.typeOut("and it’s getting closer..." + UIManager.RESET, 20);
        input.nextLine();

        System.out.println(UIManager.BLUE + "\nJoseph Scotch: " + UIManager.RESET);
        UIManager.typeOut("By thunder! " + name + ", they’re bustin’ through the back door! Get ready, or we’re done for!", 20);
        input.nextLine();
        System.out.println(UIManager.BLUE + "\nBenjamin Scotch: " + UIManager.RESET);
        UIManager.typeOut("Look out for the boulders, they’re going to roll downhill!", 20);

    }

}