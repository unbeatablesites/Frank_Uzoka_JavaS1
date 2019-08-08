package com.company;

import java.util.Scanner;

public class YourAgeCan {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        String userInput;
        int age;

        System.out.println("Enter your age: ");
        userInput = myScanner.nextLine();
        age = Integer.parseInt(userInput);

        if (age >= 100) {
            System.out.println("This person is more than a century old.");
            System.out.println("This person an octogenerian.");
            System.out.println("This person can retire.");
            System.out.println("This person can have AARP.");
            System.out.println("This person can be the president.");
            System.out.println("This person can drink alcohol.");
            System.out.println("This person can vote.");

        } else if (age >= 80 && age <= 89) {
            System.out.println("This person an octogenerian.");
            System.out.println("This person can retire.");
            System.out.println("This person can have AARP.");
            System.out.println("This person can be the president.");
            System.out.println("This person can drink alcohol.");
            System.out.println("This person can vote.");
        } else if (age > 65) {
            System.out.println("This person can retire.");
            System.out.println("This person can have AARP.");
            System.out.println("This person can be the president.");
            System.out.println("This person can drink alcohol.");
            System.out.println("This person can vote.");
        } else if (age > 55) {
            System.out.println("This person can have AARP.");
            System.out.println("This person can be the president.");
            System.out.println("This person can drink alcohol.");
            System.out.println("This person can vote.");
        } else if (age > 35) {
            System.out.println("This person can be the president.");
            System.out.println("This person can drink alcohol.");
            System.out.println("Vote.");
        } else if (age > 21) {
            System.out.println("This person can drink alcohol.");
            System.out.println("This person can vote.");
        } else if (age > 18) {
            System.out.println("This person can vote.");
        }

    }
}
