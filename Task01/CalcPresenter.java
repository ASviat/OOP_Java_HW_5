package Task01;

import java.util.Scanner;

/**
 * CalcPresenter
 */
public class CalcPresenter {
    public CalcModel model;
    public CalcViewer viewer;

    Scanner input = new Scanner(System.in);

    public CalcPresenter(CalcModel model, CalcViewer viewer) {
        this.model = model;
        this.viewer = viewer;
    }

    public void performCalculation() {
        double first = viewer.inputDouble(input);

        switch (viewer.inputChar(input)) {
            case '+':
                System.out.printf("Result: %.2f\n", model.plus(first, viewer.inputDouble(input)));
                performCalculation();
            case '-':
                System.out.printf("Result: %.2f\n", model.minus(first, viewer.inputDouble(input)));
                performCalculation();
            case '*':
                System.out.printf("Result: %.2f\n", model.multiply(first, viewer.inputDouble(input)));
                performCalculation();
            case '/':
                System.out.printf("Result: %.2f\n", model.divide(first, viewer.inputDouble(input)));
                performCalculation();
            case 'q':
                System.out.println("The end");
                input.close();
                break;
            default:
                System.out.println("Friend, make a correct choise!");
                input.close();
                break;
        }
    }
}