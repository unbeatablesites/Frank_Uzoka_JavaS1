import java.util.Random;
import java.util.Scanner;


public class keepGuessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int userG = 0;
        int cGuess = random.nextInt(10) + 1;

        System.out.println("See if you can guess the correct number between 1-10!");

        while (userG != cGuess) {
            userG = Integer.parseInt(scan.nextLine());
            if (userG == cGuess) {
                System.out.println("Correct!");
            } else {
                System.out.format("Your guessed "+userG+". Try again");
            }
        }
    }
}
