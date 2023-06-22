package Task01;

/**
 * ProgramCalc
 */
public class ProgramCalc {

    public static void main(String[] args) {

        CalcPresenter cp = new CalcPresenter(new CalcModel(), new CalcViewer());
        cp.performCalculation();

    }
}