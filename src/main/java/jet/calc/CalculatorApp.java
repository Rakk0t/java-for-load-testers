package jet.calc;


import static java.lang.Double.*;
import static jet.calc.Calculator.executeCommand;

public class CalculatorApp {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i += 3){
            String command = args[i];
            double a = parseDouble(args[i+1]);
            double b = parseDouble(args[i+2]);
            System.out.println(executeCommand(command, a, b));
        }
    }
}

