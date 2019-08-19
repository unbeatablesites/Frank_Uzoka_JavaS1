import java.util.Scanner;

public class BabyNim {

    public static void main(String[] args) {

        int pile1 = 3;
        int pile2 = 3;
        int pile3 = 3;

        System.out.println("A: " + "3"+ "\tB: " + "3" + "\tC: " + "3" + "\n");

        do {

            System.out.println("Choose a pile:");
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


        } while ((pile1 > 0) || (pile2 > 0) || (pile3 > 0));




             }

    }