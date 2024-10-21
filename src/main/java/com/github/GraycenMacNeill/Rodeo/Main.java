package com.github.GraycenMacNeill.Rodeo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // Integer variable to
        int choice;
        int difficulty;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = input.nextLine();

        UIManager.typeOut("This is some sample text for the story blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah blah", 15);
        input.nextLine();

        System.out.println("Choose your difficulty:");
        System.out.println("1. Easy");
        System.out.println("2. Normal");
        System.out.println("3. Hard");
        System.out.print("Enter your choice: ");

    }

}