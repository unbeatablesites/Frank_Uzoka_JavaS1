import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte {

    public static void main(String[] args) {
        System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n" +
                "He glances at you out of the corner of his eye and starts shuffling.\n" +
                "He lays down three cards.\n");

        System.out.println("Which one is ace?\n");

        System.out.println("      ##  ##  ##");
        System.out.println("      ##  ##  ##");
        System.out.println("      1   2   3\n");

        System.out.println(">");

        Scanner scan = new Scanner(System.in);
        int stringIN = Integer.parseInt(scan.nextLine());

        Random randomGuess = new Random();
        int guessedNumber = randomGuess.nextInt(3) + 1;


        if(guessedNumber == stringIN){
            System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.\n" +
                    "\n" +
                    "\t##  AA  ##\n" +
                    "\t##  AA  ##\n" +
                    "\t1   2   3\n");
        }else{System.out.println("Ha! Fast Eddie wins again! The ace was card number " + guessedNumber +"\n");}

        if (guessedNumber == 1){
            System.out.println("          AA  ##  ##");
            System.out.println("          AA  ##  ##");
            System.out.println("           1   2   3");
        }else if(guessedNumber == 2){
            System.out.println("          ##  AA  ##");
            System.out.println("          ##  AA  ##");
            System.out.println("           1   2   3");
        }else {
            System.out.println("          ##  ##  AA");
            System.out.println("          ##  ##  AA");
            System.out.println("           1   2   3");
        }

    }


}
