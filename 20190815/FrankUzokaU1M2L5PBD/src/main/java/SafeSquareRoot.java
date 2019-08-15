import java.util.Scanner;

public class SafeSquareRoot {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int integer = 0;
        double squarRoot = 0;
        System.out.println("SQUARE ROOT!");
        System.out.println("Enter a number : ");
        integer = Integer.parseInt(myScanner.nextLine());


        while (integer < 0) {
            System.out.println("You can't take the square root of a negative number, silly.");
            System.out.println("Try again : ");
            integer = Integer.parseInt(myScanner.nextLine());
        }
        squarRoot = Math.sqrt(integer);
        System.out.println("Square Root of " + integer + " is : " + squarRoot);

    }
}