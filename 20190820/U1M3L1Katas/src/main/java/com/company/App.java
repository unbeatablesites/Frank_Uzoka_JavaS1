package com.company;
import com.sun.jdi.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.*;
import java.util.Iterator;


public class App {

    public static int total(ArrayList<Integer> numbers) {
        List<Integer> integerList = new ArrayList<>();
        int sum = 0;
        for (int element : numbers) {
            integerList.add(element);
        }
        for (int element : integerList) {
            sum += element;
        }

        return sum;
    }

//    public static int totalEven (ArrayList<Integer> numbers) {
//
//        int sum = 0;
//        for(int i = 0; i < numbers.length; i += 2) {
//            sum += numbers[i];
//        }
//
//        return sum;
//    }

    public static ArrayList<String> swapFirstAndLast(ArrayList<String> strings) {

        List<String> integerList = new ArrayList<String>();
        for (String element : strings) {
            integerList.add(element);
        }
        Collections.swap(strings, 0, integerList.size() - 1);

        return strings;
    }


    public static ArrayList<Integer> reverse(ArrayList<Integer> numbers) {

        List<Integer> integerList = new ArrayList<Integer>();

        for (Integer element : numbers) {
            integerList.add(element);
        }
        Collections.reverse(numbers);

        return numbers;
    }

    public static ArrayList<Integer> lessThanFive(ArrayList<Integer> lessThan) {

        List<Integer> lessThanList = new ArrayList<Integer>();

        for (Integer element : lessThan) {
            lessThanList.add(element);

        }
        for (Integer element : new ArrayList<>(lessThanList)) {
            if (element > 4) {
                lessThan.remove(element);
            }
            if (element.equals("[]")) {

            }

            return lessThan;

        }return null;
    }}

//    //challenge
//    public static int[][] splitAtFive(int[] numbers) {
//        int numLessThanFive = 0;
//        int numMoreThanFive = 0;
//
//        for(int num : numbers) {
//            if ( num < 5 ) {
//                numLessThanFive++;
//            } else {
//                numMoreThanFive++;
//            }
//        }
//
//        int[] lessThan = new int[numLessThanFive];
//        int[] moreThan = new int[numMoreThanFive];
//
//
//        for(int num : numbers) {
//
//            // subtracting numLessThanFive from length then decrementing numLessThanFive
//            // allows us to go from 0 to length - 1 in order without additional variables
//            // same with numMoreThanFive
//            if ( num < 5 ) {
//                lessThan[lessThan.length - numLessThanFive] = num;
//                numLessThanFive--;
//            } else {
//                moreThan[moreThan.length - numMoreThanFive] = num;
//                numMoreThanFive--;
//            }
//        }
//
//        return new int[][] { lessThan, moreThan };
//    }
//
//    // Challenge
//    public static String[][] evensAndOdds(String[] strings) {
//
//        //leveraging integer division
//        String[] odds = new String[ strings.length/2 ];
//
//        // Set evens to null for reassignment below
//        String[] evens = null;
//
//        // again leveraging integer division
//        // if it's already of even length, we're good
//        // but if it's of odd length, there's one more even index than odd
//        if (strings.length % 2 == 0) {
//            evens = new String[ strings.length/2];
//        } else {
//            evens = new String[ strings.length/2 + 1];
//        }
//
//        for(int i = 0; i < strings.length; i++) {
//            int currIndex = i/2;
//            if( i % 2 == 0 ) {
//                evens[currIndex] = strings[i];
//            } else {
//                odds[currIndex] = strings[i];
//            }
//        }
//
//        return new String[][] { evens, odds };
//    }