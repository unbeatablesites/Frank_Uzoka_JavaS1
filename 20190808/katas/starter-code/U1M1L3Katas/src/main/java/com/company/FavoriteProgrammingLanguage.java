package com.company;

import java.util.Scanner;

public class FavoriteProgrammingLanguage {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        String lang;
        do {
            System.out.println("Whats Your favorite programing language?");
            lang = enter.nextLine();
            if (lang.equals("Java")){
                System.out.format("That's what I was looking for! Java is definitely the answer!");}

        } while (!lang.equals("Java"));
    }
}
