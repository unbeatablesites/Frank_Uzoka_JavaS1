import java.util.Random;
import java.util.Scanner;

public class aNumberGuessingGame {
    public static void main(String[] args) {
        Random randomNumb = new Random();
        int numberToGuess = randomNumb.nextInt(10)+1;

        Scanner scan = new Scanner(System.in);


        System.out.println("Guess a number from 1 to 10.");
        String guess = scan.nextLine();
        int yourGuess = Integer.parseInt(guess);


        if(numberToGuess == yourGuess){
            System.out.println("Correct " + numberToGuess +" !");
        }else{
            System.out.println("Incorrect, " + numberToGuess + " was the answer.");
        }
    }
}
