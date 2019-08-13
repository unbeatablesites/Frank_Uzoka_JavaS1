import java.util.Random;

public class dice {
    public static void main(String[] args) {
        Random randNum = new Random();

        int Frool1 = randNum.nextInt(6) + 1;
        int Frool2 = randNum.nextInt(6) + 1;
        int total = Frool1 + Frool2;

        System.out.println("Roll1: " + Frool1);
        System.out.println("Roll2: " + Frool2);
        System.out.println("Total for both is " + total + " .");
    }
}