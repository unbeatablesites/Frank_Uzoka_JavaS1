import java.util.Scanner;

public class spaceBoxing {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How much do you weight?");

        float weight = Float.parseFloat(scan.nextLine());

        System.out.println("What planet are you visiting?");
        System.out.println("1. Venus");
        System.out.println("2. Mars");
        System.out.println("3. Jupiter");
        System.out.println("4. Saturn");
        System.out.println("5. Uranus");
        System.out.println("6. Neptune");

        int planet = Integer.parseInt(scan.nextLine());

        switch (planet) {
            case 1:
                System.out.println(weight * 0.78f);
                break;
            case 2:
                System.out.println(weight * 0.39f);
                break;
            case 3:
                System.out.println(weight * 2.65f);

                break;
            case 4:
                System.out.println(weight * 1.17f);

                break;
            case 5:
                System.out.println(weight * 1.05f);

                break;
            case 6:
                System.out.println(weight * 1.23f);
                break;
            default:
                System.out.println("You entered incorrect input. Enter 1 - 6");

        }



    }


}
