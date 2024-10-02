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

        Inventory.addAmmo(5);
        Inventory.addAmmo(1);
        Inventory.subtractAmmo(2);
        Inventory.addMedkit(1);
        Inventory.addMedkit(3);




    }
}