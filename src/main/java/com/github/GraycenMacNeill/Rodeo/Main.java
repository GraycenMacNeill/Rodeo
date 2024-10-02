package com.github.GraycenMacNeill.Rodeo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = input.nextLine();

        System.out.println("What is your last name?");
        String lastName = input.nextLine();

        Functions.loadingScreen();

        System.out.println("\nWelcome, " + firstName + " " + lastName + "!");
        Inventory.addAmmo(5);
        Inventory.addAmmo(1);
        Inventory.subtractAmmo(2);
        System.out.println(UIManager.RED + "▸ Uh oh! You lost 1,000,000 dollars!" );
        Inventory.addScrap(100000000);
        Inventory.subtractScrap(99020);
        System.out.println(Inventory.scrap);
        Inventory.setAmmo(2);
        System.out.println(Inventory.ammo);

        System.out.println("Thomas Macduff: " + firstName + ", let's go!");





    }
}