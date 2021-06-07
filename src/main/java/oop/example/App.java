package oop.example;
/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ayush Pindoria
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String noun, verb, adj, adv;
        System.out.print("Enter a noun: ");
        noun = input.nextLine();
        System.out.print("Enter a verb: ");
        verb = input.nextLine();
        System.out.print("Enter an adjective: ");
        adj = input.nextLine();
        System.out.print("Enter an adverb: ");
        adv = input.nextLine();

        String output = String.format("Do you %s your %s %s %s? That's hilarious!", verb, adj, noun, adv);
        System.out.println(output);

    }//end main method
}//end classB