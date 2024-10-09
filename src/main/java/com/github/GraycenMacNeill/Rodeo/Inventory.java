package com.github.GraycenMacNeill.Rodeo;

public class Inventory {

    // Player's inventory variables
    public static int ammo = 0;
    public static int scrap = 0;
    public static int bandages = 0;
    public static double weaponDurability = 10.0;
    public static boolean weaponBroken = true;

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

    // These are the bandage functions for adding, removing, and setting the bandage value.
    // There is also a healing function
    /*--------------------------------------------------------------------------------------------*/

    // This function add bandages to the player's inventory
    public static void addBandage(int bandageAmount) {
        if (bandageAmount == 1) {
            bandages = bandages + bandageAmount;
            System.out.println(UIManager.GREEN + "▸ You gained " + bandageAmount + " bandage.");
        } else {
            bandages = bandages + bandageAmount;
            System.out.println(UIManager.GREEN + "▸ You gained " + bandageAmount + " bandages.");
        }
    }

    // This function subtracts bandages from the player's inventory
    public static void subtractBandage(int bandageAmount) {
        if (bandages > 0) {
            bandages = bandages - bandageAmount;
        }
    }

    // This function sets the amounts of bandages in the player's inventory
    public static void setBandage(int bandageAmount) {
        bandages = bandageAmount;
    }

    // This is the function to use a bandage
    public static void useBandage() {
        if (bandages > 0) {
            System.out.println(UIManager.YELLOW + "▸ Using a bandage...");

            Functions.loadingScreen();

            // Subtract one bandage and heal the player for 20 health points
            subtractBandage(1);
            Stats.addHealth(20);
            System.out.println(UIManager.GREEN + "▸ You used a bandage and restored 25 health points.");

        } else {
            System.out.println(UIManager.RED + "▸ You don't have any bandages!");
        }
    }

    // These are the weapon functions for shooting, repairing the weapon, and modifying
    // the weapon's durability
    /*--------------------------------------------------------------------------------------------*/

    // This function repairs the player's weapon
    // TODO - Add weapon functionality and shooting events
    public static void repairWeapon() {
        if (!weaponBroken) {
            System.out.println(UIManager.YELLOW + "▸ Your weapon is still in good condition!");
        } else {
            if (scrap > 0) {
                System.out.println(UIManager.YELLOW + "▸ Repairing your weapon...");

                Functions.loadingScreen();

                weaponBroken = false;
                System.out.println(UIManager.GREEN + "▸ Your weapon has been repaired!");
                subtractScrap(1);
            } else {
                System.out.println(UIManager.RED + "▸ You don't have enough scrap parts to repair your weapon!");
            }
        }
    }

    // This is the function that allows the player to shoot their weapon. It has three conditions
    public static void shootWeapon() {
        if (!weaponBroken && ammo > 1 && weaponDurability > 0.1) {
            System.out.println(UIManager.GREEN + "THIS IS A DEBUG MESSAGE AND WILL BE CHANGED");
        } else if (ammo < 1) {
            System.out.println(UIManager.RED + "▸ You don't have enough ammo to shoot your weapon!");
        } else if (weaponBroken) {
            System.out.println(UIManager.RED + "▸ Your weapon is broken! Repair it to return it's functionality!");
        }
    }


}
