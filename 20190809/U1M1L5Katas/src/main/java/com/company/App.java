package com.company;

public class App {


    public static int subtract(int a, int b) {
        return a - b;
    }



    public static int subtractOrZero(int a, int b) {
        if (a - b <= 0) {
            return 0;
        } else {
            return a - b;
        }

    }


    public static int max(int a, int b, int c) {
        if (a < b && b > c) {
            return b;
        } else if (b < a && c < a) {
            return a;
        } else {
            return c;
        }
    }

    public static int min(int a, int b, int c) {
        if (a > b && b < c) {
            return b;
        } else if (b > a && c > a) {
            return a;
        } else {
            return c;
        }
    }


    public static boolean isLarger(int first, int second) {

        boolean check = false;

        if (first > second) {
            check = true;



        }
        return check;
        
    }

    public static void main(String[] args) {

        int sub =subtract(1,4);
        System.out.println(sub);

        int subt =subtractOrZero(1,6);
        System.out.println(subt);

        int  max = max(1,3, 2);
        System.out.println(max);

        int min =min(1,2, 5);
        System.out.println(min);

        boolean isLarger =isLarger(1,1);
        System.out.println(isLarger);


    }



}


