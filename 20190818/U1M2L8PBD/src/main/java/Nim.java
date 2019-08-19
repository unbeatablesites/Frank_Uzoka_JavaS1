import java.util.Scanner;

public class Nim {

    public static void main(String[] args) {

        int pile1 = 3;
        int pile2 = 4;
        int pile3 = 5;
        String player1;
        String player2;

        System.out.println("Player 1, enter your name:");
        Scanner scan2 = new Scanner(System.in);

        player1 = scan2.next().toUpperCase();

        System.out.println("Player 2, enter your name:");
        Scanner scan3 = new Scanner(System.in);
        player2 = scan3.next().toUpperCase();

        System.out.println("A: " + "3"+ "\tB: " + "4" + "\tC: " + "5" + "\n");

        do {


            System.out.println(player1+", Choose a pile:");
            Scanner scanInt = new Scanner(System.in);
            Scanner scan = new Scanner(System.in);
            String userChar = scan.next().toUpperCase();
            System.out.println("How many to remove from pile "+ userChar+":");
            int userInt = Integer.parseInt(scanInt.nextLine());


            if(userChar.equals ("A") || userChar.equals("a")){
                 pile1 = pile1 - userInt;
                System.out.println("A: " + (pile1)+ "\tB: " + (pile2) + "\tC: " + (pile3) + "\n");
            }

            if(userChar.equals ("B") || userChar.equals("b")){
                 pile2 = pile2 - userInt;
                System.out.println("A: " + (pile1)+ "\tB: " + (pile2) + "\tC: " + (pile3) + "\n");
            }

            if(userChar.equals ("C") || userChar.equals("c")){
                 pile3 = pile3 - userInt;
                System.out.println("A: " + (pile1)+ "\tB: " + (pile2) + "\tC: " + (pile3) + "\n");
            }

            else {
                System.out.println(player1+", there are no counters left, so you WIN!");
            }


            System.out.println(player2+", Choose a pile:");
            Scanner scanIn2 = new Scanner(System.in);
            String userChar2 = scan2.next().toUpperCase();
            System.out.println("How many to remove from pile "+ userChar2+":");
            userInt = Integer.parseInt(scanInt.nextLine());


            if(userChar2.equals ("A") || userChar2.equals("a")){
                pile1 = pile1 - userInt;
                System.out.println("A: " + (pile1)+ "\tB: " + (pile2) + "\tC: " + (pile3) + "\n");
            }

            if(userChar2.equals ("B") || userChar2.equals("b")){
                pile2 = pile2 - userInt;
                System.out.println("A: " + (pile1)+ "\tB: " + (pile2) + "\tC: " + (pile3) + "\n");
            }

            if(userChar2.equals ("C") || userChar2.equals("c")){
                pile3 = pile3 - userInt;
                System.out.println("A: " + (pile1)+ "\tB: " + (pile2) + "\tC: " + (pile3) + "\n");
            }

            else if ((pile1 <= 0) && (pile2 <= 0) && (pile3 <= 0)){
                System.out.println(player2+", there are no counters left, so you WIN!");
            }

        } while ((pile1 > 0) || (pile2 > 0) || (pile3 > 0));

        System.out.println(player1+", there are no counters left, so you WIN!");


             }

    }