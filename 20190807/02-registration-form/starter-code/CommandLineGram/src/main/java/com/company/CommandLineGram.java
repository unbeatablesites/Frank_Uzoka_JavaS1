package com.company;

import java.util.Scanner;

public class CommandLineGram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("First name");
        String name = scan.nextLine();
        System.out.println("Last name");
        String last = scan.nextLine();
        System.out.println("Email");
        String email = scan.nextLine();
        System.out.println("Twitter handle");
        String twitter = scan.nextLine();
        System.out.println("Age");
        String age = scan.nextLine();
        System.out.println("Country");
        String country = scan.nextLine();
        System.out.println("Profession");
        String job = scan.nextLine();
        System.out.println("Favorite operating system");
        String os = scan.nextLine();
        System.out.println("Favorite programming language");
        String pl = scan.nextLine();
        System.out.println("Favorite computer scientist");
        String fsc = scan.nextLine();
        System.out.println("Favorite keyboard shortcut");
        String shortk = scan.nextLine();
        System.out.println("Have you ever built your own computer?");
        String ownc = scan.nextLine();
        System.out.println("If you could be any superhero, who would it be?");
        String hero = scan.nextLine();

        System.out.println("Your first name is " + name);
        System.out.println("Your last is " + last);
        System.out.println("Your Email is " + email);
        System.out.println("Your Twitter id is " + twitter);
        System.out.println("Your Age is " + age);
        System.out.println("Your contry is " + country);
        System.out.println("Your job is " + job);
        System.out.println("Your favorite operating system is " + os);
        System.out.println("Your favorite programming language is " + pl);
        System.out.println("Your favorite scientist is " + fsc);
        System.out.println("Your favorite shortcut key is " + shortk);
        System.out.println("Have you ever built your own computer? " + ownc);
        System.out.println("The name of you fav super hero is " + hero);


    }
}
