package com.company;

import java.util.Scanner;

public class AgeAgain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("How old are you?");
        String userAge;
        int age;
        String whatGrade;
        String toCollege;
        String whatCollege;
        String noCollege;
        String occupation;

        userAge = scan.nextLine();
        age = Integer.parseInt(userAge);


        if(age<14){
            System.out.println("What grade are you in");
            whatGrade = scan.nextLine();
            System.out.println("Wow! "+whatGrade+" grade - that sounds exciting!");

        }else if (age >= 14 && age <=18){
            System.out.println("Are you planning on going to college?");
            toCollege = scan.nextLine();
            if(toCollege.toLowerCase().equals("yes")){
                System.out.println("What college?");
                whatCollege = scan.nextLine();
                System.out.println(whatCollege+" is a great school!");
            }else{
                System.out.println("What are you going to do after highSchool");
                noCollege = scan.nextLine();
                System.out.println("Wow, "+noCollege+" sounds like a plan!");
            }

        }else{
            System.out.println("What is you job?");
            occupation = scan.nextLine();
            System.out.println(occupation+" sounds like a great job!");

        }







    }
}
