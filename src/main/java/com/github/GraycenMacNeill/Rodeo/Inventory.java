package com.github.GraycenMacNeill.Rodeo;

public class Inventory {

    public static int ammo = 3;
    public static int medkit = 0;

    // This function adds the specified amount of ammo to the player's inventory
    public static void addAmmo(int ammoAmount) {
        if (ammoAmount == 1) {
            ammo = ammo + ammoAmount;
            System.out.println(UIManager.GREEN + "▸ You gained " + ammoAmount + " bullet.");
        } else {
            ammo = ammo + ammoAmount;
            System.out.println(UIManager.GREEN + "▸ You gained " + ammoAmount + " bullets.");
        }
    }

    // This function subtracts the "totalAmount" amount of ammo from the player's inventory
    public static void subtractAmmo(int ammoAmount) {
        if (ammo > 0) {
            ammo = ammo - ammoAmount;
        }
    }

    // This function adds the specified amount of medkit to the player's inventory
    public static void addMedkit(int medkitAmount) {
        if (medkitAmount == 1) {
            medkit = medkit + medkitAmount;
            System.out.println(UIManager.GREEN + "▸ You gained " + medkitAmount + " medkit.");
        } else {
            medkit = medkit + medkitAmount;
            System.out.println(UIManager.GREEN + "▸ You gained " + medkitAmount + " medkits.");
        }
    }













}
