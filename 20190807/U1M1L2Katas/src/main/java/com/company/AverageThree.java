package com.company;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AverageThree {
    private static DecimalFormat df2 = new DecimalFormat("#.##");

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        System.out.println("What numbers would you like to multiply  you can only pick 3 ? ");
        double numToAddTo = Double.parseDouble(scan.nextLine());
        double numToAddTo1 = Double.parseDouble(scan.nextLine());
        double numToAddTo2 = Double.parseDouble(scan.nextLine());

        double addedNumbers = (numToAddTo + numToAddTo1 + numToAddTo2 );

        double div = 3;

        System.out.println("Ok, " +   String.format("%.2f",addedNumbers/div ) + " is your answer!");
    }
}
