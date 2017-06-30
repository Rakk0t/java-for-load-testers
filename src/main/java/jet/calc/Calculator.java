package jet.calc;

public class Calculator {
    private static double memory = 0;
    private static double currentMemory = 0;
    public static int add (int a, int b) {
        a = limit(a);
        b = limit(b);

        memory = a + b;
        return limit(a + b);
    }

    public static double add (double a, double b) {
        a = limit(a);
        b = limit(b);

        memory = a + b;
        return limit(a + b);
    }

    public static int sub (int a, int b) {
        a = limit(a);
        b = limit(b);
        memory = a - b;
        return limit(a - b);
    }

    public static double sub (double a, double b) {
        a = limit(a);
        b = limit(b);
        memory = a - b;
        return limit(a - b);
    }

    public static int mult (int a, int b) {
        a = limit(a);
        b = limit(b);
        memory = a * b;
        return limit(a * b);
    }

    public static double mult (double a, double b) {
        a = limit(a);
        b = limit(b);
        memory = a * b;
        return limit(a * b);
    }

    public static int div (int a, int b) {
        a = limit(a);
        b = limit(b);
        memory = a / b;
        return limit(a / b);
    }

    public static double div (double a, double b) {
        a = limit(a);
        b = limit(b);
        memory = a / b;
        return limit(a / b);
    }

    public static int limit (int value) {
        if (value < -10) {
            value = -10;
        } else if (value > 10) {
            value = 10;
        }
        return value;
    }

    public static double limit (double value) {
        if (value < -10) {
            value = -10;
        } else if (value > 10) {
            value = 10;
        }
        return value;
    }

    public static int modul (int value) {
        if (value < 0) {
            value = -value;
        }
        return value;
    }

    public static double modul (double value) {
        if (value < 0) {
            value = -value;
        }
        return value;
    }


    public static void saveToMemory () {
        currentMemory = memory;
    }

    public static void addMemory () {
        currentMemory = memory + currentMemory;
    }

    public static double showMemory () {
        return currentMemory;
    }

    public static double executeCommand(String command, double a, double b) {
        switch (command) {
            case "add": return add(a, b);
            case "div": return div(a, b);
            case "mult": return mult(a, b);
            case "sub": return sub(a, b);
        }
        return 0;
    }
    public static void log(){

    }
}




