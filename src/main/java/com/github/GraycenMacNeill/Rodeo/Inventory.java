package com.github.GraycenMacNeill.Rodeo;

public class Inventory {

    public static int ammo = 0;

    // This function adds the specified amount of ammo to the player's inventory'
    public static void addAmmo(int ammoAmount) {
        ammo = ammo + ammoAmount;
    }

    // This function subtracts the total amount of ammo from the player's inventory
    public static void subtractAmmo(int ammoAmount) {
        if (ammo > 0) {
            ammo = ammo - ammoAmount;
        } else {}
    }

    public static int food = 0;

    // This function adds the specified amount of food to the player's inventory
    public static void addFood(int foodAmount) {
        food = food + foodAmount;
    }

    // This function subtracts the total amount of food from the player's inventory
    public static void subtractFood(int foodAmount) {
        if (food > 0) {
            food = food - foodAmount;
        } else {}
    }









}
