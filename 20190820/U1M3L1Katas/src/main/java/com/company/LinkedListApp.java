package com.company;
import java.util.LinkedList;
import java.util.List;



public class LinkedListApp {


    public static int total

    {

        List<Integer> numbers = new LinkedList<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(3);
        numbers.add(7);
        numbers.add(6);
        numbers.add(1);
        numbers.add(9);
        numbers.add(10);
        numbers.add(13);
        numbers.add(56);
        numbers.add(43);

        int total = 0;

        for (int element : numbers) {
            total += element;
        }
        return total;

    }}


