package com.company;

import java.util.Scanner;

public class UltimateQuestion {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);

        int number;
        String userNumber;
        do {
            System.out.println("Enter a number between 1 and 100");
            userNumber = enter.nextLine();
            number = Integer.parseInt(userNumber);
            if (number == 42){
            System.out.format("That's the number I was looking for! 42 is definitely the answer!");}

        } while (number != 42);

    }
}
