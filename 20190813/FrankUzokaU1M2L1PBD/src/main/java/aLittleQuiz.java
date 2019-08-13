import java.util.Scanner;

public class aLittleQuiz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you ready for a quiz? press 1 for yes and any key for no.");
        int userInput = Integer.parseInt(scan.nextLine());

        if(userInput == 1 ){
            System.out.println("Q1) What is the capital of Alaska?");
            System.out.println("    1) Melbourne\n" + "\t2) Anchorage\n" + "\t3) Juneau");
            System.out.println("==================Enter=====Answers=====Here==================");
            int question1 = Integer.parseInt(scan.nextLine());

            if(question1 == 3){
                System.out.println("Correct");
            }else{
                System.out.println("Incorrect");
            }

            System.out.println("=======================Question===========================");
            System.out.println("Q2) Can you store the value \"cat\" in a variable of type int?");
            System.out.println("    1) Yes\n" + "\t2) No\n");
            int question2 = Integer.parseInt(scan.nextLine());
            if(question2 == 2){
                System.out.println("Correct");
            }else{
                System.out.println("Incorrect");
            }

            System.out.println("=======================Question===========================");
            System.out.println("Q3)What is the result of 9+6/3?");
            System.out.println(" 1)  5\n " + "2)  11\n " + "3)  15/3");
            int question3 = Integer.parseInt(scan.nextLine());

            if(question3 == 2){
                System.out.println("Correct");
            }else{
                System.out.println("Incorrect");
            }



        }else{


            return ;
        }


    }
}
