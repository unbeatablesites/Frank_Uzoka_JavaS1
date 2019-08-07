package com.company;
import java.util.Scanner;

public class LuxuryTaxCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1 what is your salary");
        int salary1 = Integer.parseInt(scan.nextLine());
        System.out.println("Player2 enter salary");
        int salary2 = Integer.parseInt(scan.nextLine());
        System.out.println("Player 3 enter salary");
        int salary3 = Integer.parseInt(scan.nextLine());
        int total = salary1 + salary2 + salary3;
        System.out.println("Total salary is " + total);
        int taxLimit = 40000000;
        if (total > 40000000) {
            int difference = total - taxLimit;
            double taxCharge = (difference * .18);
            System.out.println("Luxury tax charge is " + taxCharge);
        } else if (total < 40000000) {
            int tax2 = (total);
            System.out.println("No luxury tax charge is " + tax2);
        }

    }
}