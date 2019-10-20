
import com.company.ConverterIf;
import com.company.ConverterSwitch;

import java.util.Scanner;

public class ConverterApplication {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        ConverterIf converterChoiceIf = new ConverterIf();
        ConverterSwitch converterSwitchIf = new ConverterSwitch();

        System.out.println("Enter numbers 1 to 7 to display the day of the week.");
        int userDayInput = myScanner.nextInt();
        System.out.println("Enter a number from 1 to 12 to display a month.");
        int userMonthInput = myScanner.nextInt();

        System.out.println("----------------------------------------------");
        System.out.println("Display day of the week.");
        System.out.println("----------------------------------------------");

        System.out.println("Switch : " + converterSwitchIf.convertDay(userDayInput));
        System.out.println("If/Else : " + converterChoiceIf.convertDay(userDayInput));
        System.out.println("----------------------------------------------");
        System.out.println("Display Month:");
        System.out.println("----------------------------------------------");
        System.out.println("Display Month:");
        System.out.println("Switch method: " + converterSwitchIf.convertMonth(userMonthInput));
        System.out.println("If/Else method: " + converterChoiceIf.convertMonth(userMonthInput));

    }
}
