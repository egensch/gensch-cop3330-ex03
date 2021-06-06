/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner inputQuote = new Scanner(System.in);

        System.out.print("What is the quote? ");
        String userInput1 = inputQuote.nextLine();

        System.out.print("Who said it? ");
        String userInput2 = inputQuote.nextLine();

        System.out.println("" + userInput2 + " says, \"" + userInput1 + "\"");
    }
}
