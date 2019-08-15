package com.company;

import com.company.interfaces.UserIO;

import java.util.Scanner;

public class Input implements UserIO {

    Scanner scan = new Scanner(System.in);



    public int readInt(String prompt) {
        System.out.println(prompt);
        String stringIN = scan.nextLine();
        int intInput = Integer.parseInt(stringIN);

        return intInput;
    }

    public long readLong(String prompt) {
        System.out.println(prompt);
        String stringIN = scan.nextLine();
        long longIN = Long.parseLong(stringIN);
        return longIN;
    }

    public double readDouble(String prompt) {
        System.out.println(prompt);
        String stringIn = scan.nextLine();
        double doubleIN = Double.parseDouble(stringIn);
        return doubleIN;
    }

    public float readFloat(String prompt) {
        System.out.println(prompt);
        String stringIn = scan.nextLine();
        float floatIN = Float.parseFloat(stringIn);
        return floatIN;
    }

    public String readString(String prompt) {
        System.out.println(prompt);
        String stringIN = scan.nextLine();
        return stringIN;
    }
}
