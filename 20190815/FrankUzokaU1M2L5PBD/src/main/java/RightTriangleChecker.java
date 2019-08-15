import java.util.Scanner;

public class RightTriangleChecker {

//    (((s1*s1) + (s2*s2)) == (s3*s3))  formula used


    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        int s1 = 0;
        int s2 = 0;
        int s3 = 0;

        System.out.println("Side 1 : ");
        s1 = Integer.parseInt(myScanner.nextLine());

        do {
            System.out.println("Side 2 : ");
            s2 = Integer.parseInt(myScanner.nextLine());
            if (s2 < s1)
                    System.out.println(s2 + " is smaller than " + s1 + ". Try again");
                        }while(s2 < s1);

        do {
            System.out.println("Side 3 : ");
            s3 = Integer.parseInt(myScanner.nextLine());
            if (s3 < s2)
                System.out.println(s3 + " is smaller than " + s2 + ". Try again");
                    }while(s3 < s2);

        System.out.println("Your three side are " + s1 + " " + s2 + " " + s3);
        if (((s1*s1) + (s2*s2)) == (s3*s3))
            System.out.println("These sides *do* make a right triangle.  Yippy-skippy!");
        else
            System.out.println("NO!  These sides do not make a right triangle!");
    }

}