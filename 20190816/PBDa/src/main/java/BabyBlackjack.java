import java.util.Random;

public class BabyBlackjack {
    public static void main(String[] args){
        Random randomnum = new Random();

//        Add variables
        int userNum1 = 1+randomnum.nextInt(10);
        int userNum2 = 1+randomnum.nextInt(10);
        int userSum = userNum1+userNum2;
        int dealerNum1 = 1+randomnum.nextInt(10);
        int dealerNum2 = 1+randomnum.nextInt(10);
        int dealerSum = dealerNum1+dealerNum2;

//        Set up output

        System.out.println("Baby Blackjack!");
        System.out.println();
        System.out.println("You drew "+userNum1+" and "+userNum2);
        System.out.println("Your total is "+userSum);
        System.out.println();
        System.out.println("The dealer drew "+dealerNum1+" and "+dealerNum2);
        System.out.println("Dealer's total is "+dealerSum);
        System.out.println();

//        Add logic

        if(userSum>dealerSum){
            System.out.println("YOU WIN!");
        }else if(userSum<dealerSum){
            System.out.println("YOU LOSE!");
        }else{
            System.out.println("WOO HOO!!! IT'S A TIE");
        }

    }
}
