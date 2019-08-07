package com.company;

import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("What number would you like to add  you can only pick 5 ? ");
        int numToAddTo = Integer.parseInt(scan.nextLine());

        System.out.println("Ok, " + ((numToAddTo * 2) +5));





    }
}
