import java.util.Scanner;
public class AddingValuesInALoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I will add up the numbers you give me. ");

        boolean testSample = false;
        int add = 0;

        while (testSample == false) {

            int userI;
            System.out.println("Number: ");
            userI = Integer.parseInt(scan.nextLine());
            add += userI;

            if (userI == 0) {
                testSample = true;
                System.out.println("The total is "+ add +".");
            }
        }

    }

}
