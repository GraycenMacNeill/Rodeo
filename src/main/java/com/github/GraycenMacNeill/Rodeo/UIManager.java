package com.github.GraycenMacNeill.Rodeo;

public class UIManager {

    // These are the string color constants
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String ORANGE = "\u001B[38;5;214m";
    public static final String YELLOW = "\u001B[33m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String INDIGO = "\u001B[38;5;75m";
    public static final String VIOLET = "\u001B[35m";
    public static final String WHITE = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String GRAY = "\u001B[37m";
    public static final String ITALICIZED = "\u001B[3m";

    // This function is used for animated text rendering. Prints out word by word
    // or prints out character by character.
    public static void typeOut(String message, int delay) throws InterruptedException {
        // Loop through each character in the message
        for (char c : message.toCharArray()) {
            // Print the character
            System.out.print(c);

            // Flush the output to ensure it's displayed immediately
            System.out.flush();

            // Pause for the specified delay
            Thread.sleep(delay); // Increase the delay if necessary, e.g., 100ms
        }
        // Print a newline after the message
        System.out.println();
    }

}
