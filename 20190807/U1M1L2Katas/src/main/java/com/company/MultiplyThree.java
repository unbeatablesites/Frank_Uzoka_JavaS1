package com.company;

import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("What numbers would you like to multiply  you can only pick 3 ? ");
        int numToAddTo = Integer.parseInt(scan.nextLine());
        int numToAddTo1 = Integer.parseInt(scan.nextLine());
        int numToAddTo2 = Integer.parseInt(scan.nextLine());


        System.out.println("Ok, " + (numToAddTo * numToAddTo1 * numToAddTo2 ) +" is your answer!");

    }
}