import java.util.Random;

public class main {

    public static void main(String[] args) {

        Random randomGenerator = new Random();

        int randInt1 = 0;
        int randInt2 = 0;

        int diSum = 0;

        int rollsTo7 = 0;
        int numOf7 = 0;
        int totalRolls = 0;

        for ( int i=1; i <= 102; i++){
            randInt1 = randomGenerator.nextInt(6)+1;
            randInt2 = randomGenerator.nextInt(6)+1;
            diSum = randInt1 + randInt2;
            totalRolls++;

            System.out.println(diSum);

            if (diSum == 7) {
                numOf7++;

            }

            if (numOf7 == 1 && diSum == 7) {
                rollsTo7 = totalRolls;
            }

        }

        System.out.println("It took " + rollsTo7 + " rolls to get a 7.");
        System.out.println("Seven was rolled " + numOf7 + "times.");

    }

}