package com.github.GraycenMacNeill.Rodeo;

import java.lang.Thread;

public class Functions {

    // This function is used to end the game and reset all of the game variables
    public static void gameOver() {
        delay(1000);
        Inventory.ammo = 0;
        Inventory.scrap = 0;
        Inventory.weaponBroken = false;
        System.out.println(UIManager.RED + "Game over!");
        delay(3000);
        System.exit(0);
    }
    // Function to display a loading screen with a customizable animation
    public static void loadingScreen() {
        String[] loadingSteps = {"⠋", "⠙", "⠹", "⠸", "⠼", "⠴", "⠦", "⠧", "⠇", "⠏"};  // Loading animations

        for (int i = 0; i < 3; i++) {  // Loop for a few iterations of the animation
            for (String step : loadingSteps) {
                System.out.print("\r" + step);  // \r moves the cursor back to the start of the line
                delay(10); }}
        System.out.println("\r         ");
    }


    // Function to delay the execution of the program for a specified number of milliseconds
    // Remember, 1000 milliseconds = 1 second
    public static void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}

