import java.util.Scanner;
import java.util.Random;



public class fortuneCookie {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any key to learn your fortune");

        int rand = Integer.parseInt(scan.nextLine());

        Random random = new Random();
        int fortune = random.nextInt(6)+1;

        switch (fortune) {
            case 1:
                System.out.println("The fortune you seek is in another cookie.");

                break;
            case 2:
                System.out.println( "A closed mouth gathers no feet.");

                break;
            case 3:
                System.out.println("A conclusion is simply the place where you got tired of thinking." );


                break;
            case 4:
                System.out.println("A cynic is only a frustrated optimist.");


                break;
            case 5:
                System.out.println(  "A foolish man listens to his heart. ...");


                break;
            case 6:
                System.out.println("You will die alone and poorly dressed.");

                break;
            default:
                System.out.println("You entered incorrect input. Enter 1 - 6");

        }
    }
}
