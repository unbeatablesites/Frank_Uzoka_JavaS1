package com.company;

import java.util.Scanner;

public class AddFive {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("What number would you like to add  you can only pick 5 ? ");
        int numToAddTo = Integer.parseInt(scan.nextLine());
        int numToAddTo1 = Integer.parseInt(scan.nextLine());
        int numToAddTo2 = Integer.parseInt(scan.nextLine());
        int numToAddTo3 = Integer.parseInt(scan.nextLine());
        int numToAddTo4 = Integer.parseInt(scan.nextLine());


        System.out.println("Ok, " + (numToAddTo + numToAddTo1 + numToAddTo2 + numToAddTo3 + numToAddTo4) +" is your answer!");


    }
}
