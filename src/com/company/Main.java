package com.company;
import java.util.Scanner;


/*
 *  UCF COP3330 Summer 2021 Assignment 4 Solution
 *  Copyright 2021 Adam Nogueira
 */

public class Main {

    public static void main(String[] args) {
        Scanner Noun= new Scanner(System.in);
        Scanner Verb = new Scanner(System.in);
        Scanner adj= new Scanner(System.in);
        Scanner adverb = new Scanner(System.in);



        System.out.println("Enter a noun:");

        String NounStr = Noun.nextLine();

        System.out.println("Enter a verb:");

        String VerbStr = Verb.nextLine();

        System.out.println("Enter an adjective:");

        String adjstr = Noun.nextLine();

        System.out.println("Enter an adverb:");

        String advstr = Verb.nextLine();


        System.out.println("Do you " + VerbStr + " your " + adjstr + " " + NounStr + " " + advstr + " ? That's hilarious");





    }
}
