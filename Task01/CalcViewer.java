package Task01;

import java.util.Scanner;

/**
 * CalcViewer
 */
public class CalcViewer {
    
    double myDouble;
    char mychar;

    public double inputDouble(Scanner input) {
        System.out.println("Enter double: ");
        String line = input.nextLine();
        try {
            return Double.parseDouble(line);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid double.");
            return inputDouble(input);
        }
    }

    public char inputChar(Scanner input) {
        System.out.println("Enter action: +,-,*,/\nor q to exit");
        return mychar = input.next().charAt(0);
    }
}