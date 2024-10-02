package com.github.GraycenMacNeill.Rodeo;

import java.lang.Thread;


public class Functions {




    // Function to display a loading screen with a customizable animation
    public static void loadingScreen() {
        String[] loadingSteps = {"⠋", "⠙", "⠹", "⠸", "⠼", "⠴", "⠦", "⠧", "⠇", "⠏"};  // Loading animations

        for (int i = 0; i < 3; i++) {  // Loop for a few iterations of the animation
            for (String step : loadingSteps) {
                System.out.print("\r" + step);  // \r moves the cursor back to the start of the line
                delay(1); }}
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

