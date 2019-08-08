package com.company;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number;
        int numberConverted;

        System.out.println("Enter a number to see the magic");
        number = scan.nextLine();
        numberConverted = Integer.parseInt(number);

        if ((numberConverted % 2)==0)    {
            System.out.println(numberConverted + " is even");
        }
        else {
            System.out.println(numberConverted + " is odd");
        }


    }
}
