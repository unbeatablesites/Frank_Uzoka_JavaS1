package com.company;

import java.util.Scanner;

public class RangeChecker {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        int number;
        String userNumber;
        do {
            System.out.println("Enter a number between 15 and 32");
            userNumber = enter.nextLine();
            number = Integer.parseInt(userNumber);
            System.out.format("You entered %d", number);
        } while (number <= 15 || number >= 32);
    }
}
