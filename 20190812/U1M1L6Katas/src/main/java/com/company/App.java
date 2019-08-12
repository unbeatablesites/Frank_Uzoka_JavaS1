package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class App {


    public static void main(String[] args) {

        int[] collectNums = infoIN();
        String[] collectString = charIN();
        int sum = total(collectNums);
        int odd = totalOdd(collectNums);
        int even = totalEven(collectNums);
        int sLn = secondLargestNumber(collectNums);

        int[] rArray = reverse(collectNums);
        for (int i = 0; i < rArray.length; i++) {
            System.out.println(rArray[i]);
        }

        int[] lessThanFive = lessThanFive(collectNums);
        for(int i=0; i < lessThanFive.length; i++) {
            System.out.println(lessThanFive[i]);

        }

        int[] trd= everyThird(collectNums);

        for(int i: trd){
            System.out.println(i);
            
        }

        int[][] split= splitAtFive(collectNums);
        for (int[] a: split){
            for (int b : a){
                System.out.println(b);
            }
        }

        String[] swap = swapFirstAndLast(collectString);
        for (String element: swap){
            System.out.println(element);
        }
        String concatenated = concatenateString(collectString);

        System.out.println("The total is " + sum);
        System.out.println("The total is " + odd);
        System.out.println("The total is " + even);
        System.out.println("The total is " + sLn);





    }

     public static String[] charIN() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many words should the array have?");
        int stringssInArray = Integer.parseInt(scan.nextLine());
        String[] stringIN = new String[stringssInArray];

        for (int i = 0; i < stringIN.length; i++) {
            System.out.println("Enter your numbers. You have ");

            stringIN[i] = scan.nextLine();
        }
        return stringIN;
    }


    public static int[] infoIN() {
        Scanner scan = new Scanner(System.in);
        System.out.println("How long should the array be?");
        int numbsInArray = Integer.parseInt(scan.nextLine());
        int[] infoIN = new int[numbsInArray];

        for (int i = 0; i < infoIN.length; i++) {
            System.out.println("Enter your numbers. You have " + ( infoIN.length - (i)) + " left to enter");

            infoIN[i] = Integer.parseInt(scan.nextLine());
        }
        return infoIN;
    }


    public static int total(int[] array) {
//    sample input    int[] array = new int[]{0, 1, 2, 3, 4, 5, 6, 7};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int totalOdd(int[] array) {
        int odd = 0;

        for (int i = 1; i < array.length; i += 2) {

            odd += array[i];
        }


        return odd;
    }

    public static int totalEven(int[] array) {
        int even = 0;

        for (int i = 0; i < array.length; i += 2) {

            even += array[i];
        }


        return even;
    }

    public static int secondLargestNumber(int[] array) {


        Arrays.sort(array);

        int sLn = array[array.length-2];

        return sLn ;

    }


    public static int[] reverse(int[] array){

        int[] rArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            rArray[i] = array[array.length - (i + 1)];
        }
        return rArray;


    }


    public static int[] lessThanFive(int[] array) {
        int counter = 0;
        int j = 0;

        for (int element : array) {
            if (element < 5) {
                counter++;
            }
        }

        int[] lessThanFiveArray = new int[counter];

        for (int i : array) {
            if (i < 5) {
                lessThanFiveArray[j] = i;
                j++;
            }
        }
        if (lessThanFiveArray.length != 0) {
            return lessThanFiveArray;

        } else {
            return null;
        }
    }


    public static int[] everyThird(int[] array){
        if(array.length<3){
            return null;
        }
        else {
            int[] trd = new int[array.length / 3];
            for (int i = 2, j = 0; i < array.length && j < trd.length; i += 3, j++) {
                trd[j] = array[i];
            }
            return trd;
        }}


    public  static  int[][] splitAtFive(int[] array){
        int lowFive= 0, highFive=0;

        for (int i: array){
            if(i<5){
                lowFive+=1;
            }
            else{
                highFive+=1;
            }
        }

        int[] arrayLowFive= new int[lowFive];
        int[] arrayHighFive= new int[highFive];
        for(int a=0, b=0, c=0; a< array.length&& (b<arrayLowFive.length|| c<arrayHighFive.length) ;a++){
            if(array[a]< 5){
                arrayLowFive[b]=array[a];
                b++;

            }
            else {
                arrayHighFive[c]= array[a];
                c++;

            }
        }

        int[][] split5 = {arrayLowFive, arrayHighFive};


        return split5;
    }

    public static String[] swapFirstAndLast(String[] array){
        String first= array[0];
        array[0]= array[array.length-1];
        array[array.length-1]= first;
        return array;

    }

    public static String concatenateString(String [] array){
        String concatenated = "";
        for (int i = 0; i < array.length; i++){
            concatenated = concatenated + array[i];
        }
        return concatenated;
    }

}