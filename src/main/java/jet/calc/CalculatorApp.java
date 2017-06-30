package jet.calc;


import static jet.calc.Calculator.executeCommand;

public class CalculatorApp {

    public static void main(String[] args) {

        for (int i = 0; i < args.length; i += 3){
            String command = args[i];
            double a = Double.parseDouble(args[i+1]);
            double b = Double.parseDouble(args[i+2]);
            System.out.println(executeCommand(command, a, b));
        }
    }
}
