package com.company;
import java.util.Scanner;
public class SubtractTwo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("What numbers would you like to subtract  you can only pick 2 ? ");
        int numToAddTo = Integer.parseInt(scan.nextLine());
        int numToAddTo1 = Integer.parseInt(scan.nextLine());
        System.out.println("Ok, " + (numToAddTo - numToAddTo1 ) +" is your answer!");

    }
}
