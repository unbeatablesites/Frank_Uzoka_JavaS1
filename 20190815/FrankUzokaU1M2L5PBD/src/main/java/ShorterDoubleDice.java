import java.util.Random;

public class ShorterDoubleDice {

    public static void main(String[] args) {
        Random num = new Random();
        int firstRoll;
        int secondRoll;
        do {
            firstRoll = num.nextInt(6) + 1;
            secondRoll = num.nextInt(6) + 1;
            int sum = firstRoll + secondRoll;
            System.out.println("HERE COMES THE DICE!\n");
            System.out.println("Roll #1 : " + firstRoll);
            System.out.println("Roll #2 : " + secondRoll);
            System.out.println("The total is " + sum + "!");
        } while (firstRoll!=secondRoll);

    }
}
