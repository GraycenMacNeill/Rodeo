package com.github.GraycenMacNeill.Rodeo;

public class Stats {

    // Player's stats variables
    public static int health = 100;
    public static int stamina = 100;

    // These are functions for the player's health
    // The player's health is capped at 100
    // This is the player health symbol: ❥
    /*--------------------------------------------------------------------------------------------*/
    // This is the function to add to the player's health
    public static void addHealth(int healthAmount) {
        if (healthAmount == 1) {
            health = health + healthAmount;
            System.out.println(UIManager.GREEN + "❥ You gained " + healthAmount + " health point.");
            if (health > 100) {
                health = 100;
            }
        } else {
            health = health + healthAmount;
            System.out.println(UIManager.GREEN + "❥ You gained " + healthAmount + " health points.");
            if (health > 100) {
                health = 100;
            }
        }
    }

    // This is the function to subtract the player's health
    public static void subtractHealth(int healthAmount) {
            health = health - healthAmount;
            System.out.println(UIManager.RED + "❥ You lost " + healthAmount + " health point.");
            if (health < 1) {
                Functions.gameOver();
            }
    }

    // This is the function to set the player's health
    public static void setHealth(int healthAmount) {
        health = healthAmount;
    }

    // These are functions for the player's stamina
    // Player's stamina affects the ability to attack, if they have enough stamina they can
    // perform an attack, if not they have to suffer and will lose health
    // This is the stamina symbol: ✸
    /*--------------------------------------------------------------------------------------------*/
    // This is the function to add to the player's stamina bar
    public static void addStamina(int staminaAmount) {
        stamina = stamina + staminaAmount;
        System.out.println(UIManager.VIOLET + "▸ You gained " + staminaAmount + " stamina point.");
        if (stamina > 100) {
            stamina = 100;
        }
    }

    // This is the function to subtract the player's stamina bar
    public static void subtractStamina(int staminaAmount) {
        stamina = stamina - staminaAmount;
        System.out.println(UIManager.YELLOW + "✸ You used " + staminaAmount + " stamina points.");
        if (stamina < 1) {
            System.out.println(UIManager.RED + "✸ You are exhausted, you are unable to perform that action.");
        }
    }

    // This is the function to set the player's stamina bar value
    public static void setStamina(int staminaAmount) {
        stamina = staminaAmount;
    }


}
