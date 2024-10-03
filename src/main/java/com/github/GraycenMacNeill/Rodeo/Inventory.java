package com.github.GraycenMacNeill.Rodeo;

public class Inventory {

    public static int ammo = 0;
    public static int scrap = 0;
    public static boolean isWeaponBroken = true;

    // These are the ammo functions for adding, removing, and setting the ammo value.
    /*--------------------------------------------------------------------------------------------*/
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
    // This function subtracts the specified amount of ammo from the player's inventory
    public static void subtractAmmo(int ammoAmount) {
        if (ammo > 0) {
            ammo = ammo - ammoAmount;
        }
    }
    // This function sets the specified amount of ammo to the player's inventory
    public static void setAmmo(int ammoAmount) {
        ammo = ammoAmount;
    }

    // These are the scrap functions for adding, removing, and setting the scrap value.
    // These also include repairing the player's weapon
    /*--------------------------------------------------------------------------------------------*/
    public static void addScrap(int scrapAmount) {
        if (scrapAmount == 1) {
            scrap = scrap + scrapAmount;
            System.out.println(UIManager.GREEN + "▸ You gained " + scrapAmount + " scrap part.");
        } else {
            scrap = scrap + scrapAmount;
            System.out.println(UIManager.GREEN + "▸ You gained " + scrapAmount + " scrap parts.");
        }
    }

    // This function subtracts the "totalAmount" amount of ammo from the player's inventory
    public static void subtractScrap(int scrapAmount) {
        if (scrap > 0) {
            scrap = scrap - scrapAmount;
        }
    }
    // This function sets the specified amount of scrap to the player's inventory
    public static void setScrap(int scrapAmount) {
        scrap = scrapAmount;
    }

    public static void repairWeapon() {
        if (!isWeaponBroken) {
            System.out.println(UIManager.YELLOW + "▸ Your weapon is still in good condition!");
        } else {
            if (scrap > 0) {
                System.out.println(UIManager.YELLOW + "▸ Repairing your weapon...");

                Functions.loadingScreen();

                isWeaponBroken = false;
                System.out.println(UIManager.GREEN + "▸ Your weapon has been repaired!");
                subtractScrap(1);
            } else {
                System.out.println(UIManager.RED + "▸ You don't have enough scrap parts to repair your weapon!");
            }

        }

    }















}
