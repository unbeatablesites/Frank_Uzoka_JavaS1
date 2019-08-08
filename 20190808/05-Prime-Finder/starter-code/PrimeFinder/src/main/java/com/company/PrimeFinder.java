package com.company;
import java.util.Scanner;


public class PrimeFinder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        String numberIN;


        int convertedNum;

        System.out.println("Let's see if you have a prime number!");
                            numberIN = myScanner.nextLine();
        convertedNum = Integer.parseInt(numberIN);


        for (int i=1; i<=convertedNum; i++){
            int validc = 0;

            for (int k=1; k<=i; k++){

                if (i%k == 0){


                    validc++;
                }

            }
            if (validc == 2){
                
                System.out.println(i);
            }


        }

    }
}






