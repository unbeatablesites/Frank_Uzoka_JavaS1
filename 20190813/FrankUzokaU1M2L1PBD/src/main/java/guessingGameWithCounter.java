

import java.util.Random;
import java.util.Scanner;
public class guessingGameWithCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int computerGuess = random.nextInt(10) + 1;

        int userG = 0;
        int add = 0;
        System.out.println("Can you guess the number I'm thinking? 1- 10");

        while (userG != computerGuess) {
            userG = Integer.parseInt(scan.nextLine());
            add++;
            if (userG == computerGuess) {
                System.out.format("Correct.It took "+add+" guesses") ;
            } else {
                System.out.format("You guessed "+userG+ " try again");
            }
        }
    }
}


