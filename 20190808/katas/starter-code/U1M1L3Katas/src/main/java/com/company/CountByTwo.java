package com.company;

import java.util.Scanner;

public class CountByTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String number;
        int count;

        System.out.println("Enter a number to see the magic");
        number = scan.nextLine();
        count = Integer.parseInt(number);

        for (int i = 0; i <= count; i+=2){
            System.out.println(i);
        }
    }
}
